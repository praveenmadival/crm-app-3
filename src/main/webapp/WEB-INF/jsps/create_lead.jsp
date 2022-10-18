<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>

<h2>create lead</h2>
<form action="saveLead" method="post">
	<pre>
		Fist name :<input type="text" name="firstName">
		Last name :<input type="text" name="lastName">
		Source :<select name="source">
					  <option >select</option>
					  <option value="newsPaper">News paper</option>
					  <option value="radio">Radio</option>
					  <option value="tvAdd">TV add</option>
					  <option value="online">Online</option>
				</select>
		Email :<input type="email" name="email">
		Mobile :<input type="text" name="mobile">
		<input type="submit" value="register">
	</pre>
</form>


</body>
</html>