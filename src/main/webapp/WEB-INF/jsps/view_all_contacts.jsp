<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list all contacts</title>
</head>
<body>

<h2>List all Contacts</h2>

<table>
	<tr>
		<th>First Name</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Billing</th>
	</tr>
<c:forEach items="${contacts}" var="ct">
	<tr>
		<td><a href="contactid?id=${ct.id}">${ct.firstName}</a> </td>
		<td>${ct.email}</td>
		<td>${ct.mobile}</td>
		<td><a href="generateBill?id=${ct.id}">${ct.firstName}</a> </td>
	</tr>
</c:forEach>
</table>

</body>
</html>