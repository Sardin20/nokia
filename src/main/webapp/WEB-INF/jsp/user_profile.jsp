<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="Userdet" items="${Userlist}">
<table>
<th>USER_DETAILS</th>
<tr></tr>
<tr><td>USER_ID</td><td>${Userdet.uid}</td></tr>
<tr><td>USER_NAME</td><td>${Userdet.uname}</td></tr>
</table>
</c:forEach>
</body>
</html>