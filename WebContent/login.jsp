<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>Login Page</title>
</head>
<body>

<form action="LoginServlet1" method="post">
	<p align="center">
	<label>Username<input type="text" name="username"/></label><br><br>
	<label>Password<input type="password" name="password"/></label><br><br>
	<!-- <label>Role<input type="text" name="role"></label><br><br> -->
	<input type="submit" value="login"/>	</p>	
</form>

</body>
</html>