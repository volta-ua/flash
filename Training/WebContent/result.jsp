<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="First name: ${val1}"/><br>
	<c:out value="Last name: ${val2}"/>
	<c:out value="Date of birth: ${val3}"/>
	<c:out value="Coefficient: ${val4}"/>
</body>
</html>