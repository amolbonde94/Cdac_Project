<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
admin here 
<%=session.getAttribute("UserName") %>
<%=session.getAttribute("RollID") %>
<a href="signout">Logout</a>
</body>
</html>