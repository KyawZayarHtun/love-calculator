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
	<section>
		<header>
			<h1 align="center">Love Calculator</h1>
			<hr>
		</header>
		<form:form action="process-homepage" method="get"
			modelAttribute="userInfo">
			<div align="center">
				<p>
					<label for="yn">Your Name</label>
					<form:input type="text" id="yn" path="userName" />
					
					<form:errors path="userName"/>
					<br><br>
				</p>
				<p>
					<label for="cn">Crush Name</label>
					<form:input type="text" id="cn" path="crushName" /><br>
					<form:errors path="crushName"/>
				</p>
				<p>
				<form:checkbox path="termsAndCond" id="check"/>
				<label>hi <del>hi again</del> <ins>Agree this is fun</ins></label>
				<form:errors path="termsAndCond"/>
				</p>
				<%-- <p>
					<label for="age">Your age</label>
					<form:input type="text" id="age" path="age" /><br>
					<form:errors path="age"/>
				</p>
				<p>
					<label for="eg">Your eg</label>
					<form:input type="text" id="eg" path="eg" /><br>
					<form:errors path="eg"/>
				</p> --%>
				
				<input type="submit" value="Calculate" />
			</div>
		</form:form>
	</section>

</body>
</html>