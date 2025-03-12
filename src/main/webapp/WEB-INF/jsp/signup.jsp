<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New User</h1>
<form action="add_sign_up_details" method="post">
<table>
<tr><td>Name:</td><td><input type="text" name="uname"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="upass"/></td></tr>
<tr><td>Email:</td><td><input type="email" name="uemail"/></td></tr>
<tr><td>Sex:</td><td><input type="radio" name="usex" value="male"/>Male <input type="radio" name="sex" checked value="female"/>Female </td></tr>
<tr><td>Occupation:</td><td>
<select name="uocc" style="width:155px">
<option>Bussiness</option>
<option>Engineer</option>
<option>Student</option>
<option>Other</option>
</select>
</td></tr>
<tr><td>Country:</td><td>
<select name="ucountry" style="width:155px">
<option>India</option>
<option>Pakistan</option>
<option>Other</option>
</select>
</td></tr>
<tr><td>City:</td><td>
<select name="ucity" style="width:155px">
<option>Mumbai</option>
<option>Lahore</option>
<option>Other</option>
</select>
</td></tr>
<tr><td colspan="2"><input type="submit" value="Add User"/></td></tr>
</table>
</form>
</body>
</html>