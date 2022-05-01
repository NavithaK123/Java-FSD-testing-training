<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>

	
	<%=request.getAttribute("employee")%>
	<br /> ID:
	<b>${id}</b>
	 Name:
	<b>${name}</b>
	 Salary:
	<b>${salary}</b>
	

</body>
</html>