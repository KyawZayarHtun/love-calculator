<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<header>
		<h1 align="center">Result Page</h1>
		<hr>

	</header>
	<section>
		<h2>Love Calculator Predicts :</h2>
		<br> 
		${userInfo.userName} and ${userInfo.crushName} are :
		<br>
		${result }
		<br>
		<a href="/Demo/sendEmail">Send Result To Your Email</a>
	</section>

</body>
</html>