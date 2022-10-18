<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all leads</title>
</head>
<body>

<h4><a href="l">create lead</a></h4>

<h2>list all leads</h2>

<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Source</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	<c:forEach items="${lead}" var="ld">
	<tr>
		<td><a href="convertLead?id=${ld.id}">${ld.firstName}</a></td>
		<td>${ld.lastName}</td>
		<td>${ld.source}</td>
		<td>${ld.email}</td>
		<td>${ld.mobile}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>