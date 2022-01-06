<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hi ${userInfo.userName} and ${userInfo.crushName }</h2>
	<form:form action="process-email" method="GET"
		modelAttribute="emailDTO">
		<label>Your Email Id: </label>
		<form:input path="email" />
		<!-- <label>YBro </label>
		<input name="nah" list="browser"/>
		<datalist id="browser">
			<option value="Firefox" />
			<option value="Chrome"/>
		</datalist> -->
		<input type="submit" value="Send">
	</form:form>
</body>
</html>