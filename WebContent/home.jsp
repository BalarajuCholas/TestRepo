<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>home</title>
</head>

<frameset  rows="30%,*,5%" >
	<frame src="header.jsp" name="head" scrolling="no">

	<frameset cols="15%,*">
		<frame noresize="noresize"  src="login.jsp" name="login">
		<frame noresize="noresize" src="body.jsp" name="body">
	</frameset>
	<frame src="footer.jsp" name="foot" scrolling="no">
</frameset>

</html>