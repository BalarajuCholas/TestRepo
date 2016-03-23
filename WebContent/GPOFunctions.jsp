<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>GPO Functions</title>
</head>
<body>

		<ul>
			<li>
				<a href="createAssessment.jsp" target="body" style="background-color:silver;">Create Assessment</a>
			</li>
			<br> <br> <br>
			<li>
				<a href="viewAssessment.jsp" target="body">View Assessment</a>
			</li>
			<br /> <br /> <br />
			<li>
				<a href="searchAssessment.jsp" target="body">Search Assessment</a>
			</li>
			<br /> <br /> <br />
			<li>
				<a href="generateReport.jsp" target="body">Generate Report</a>
			</li>
			<br /> <br /> <br />
			<li>
				<a href="import.jsp" target="body">Import</a>
			</li>
			<br /> <br /> <br />
			<li>
				<a href="login.jsp" onclick="jumpto(this.href,'body.html'); return false;">Logout</a>
				
			</li>
		</ul>

</body>
</html>