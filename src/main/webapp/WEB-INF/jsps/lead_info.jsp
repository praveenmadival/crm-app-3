<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead info</title>
</head>
<body>

<h2>Lead information</h2>

First Name :${lead.firstName} <br>
Last Name :${lead.lastName} <br>
Source :${lead.source} <br>
Email :${lead.email} <br>
Mobile :${lead.mobile} <br>

<form action="saveContact" method="post">
<input type="hidden" name="id" value="${lead.id}">
<input type="submit" value="convert">
</form>

</body>
</html>