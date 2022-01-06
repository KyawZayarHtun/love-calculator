<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Result</h1>
	<p>${reg.name }</p>
	<p>${reg.userName }</p>
	<c:forEach var="temp" items="${reg.password}">
		<p>${temp }</p>
	</c:forEach>

	<p>${reg.country }</p>
	<c:forEach var="temp" items="${reg.hobbies}">

		<p>${temp }</p>
	</c:forEach>
	<p>${reg.gender }</p>
	<p>${reg.age }</p>
	<p>${reg.communicationDTO.email }</p>
	<p>${reg.communicationDTO.phone.countryCode }</p>

</body>
</html>