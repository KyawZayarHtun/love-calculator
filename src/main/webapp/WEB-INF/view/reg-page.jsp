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
	<h1 align="center">Register</h1>
	<form:form action="reg-process">

		<div align="center">

			<form:form action="reg-process" modelAttribute="userReg" method="GET">
				<label>Name</label>
				<form:input path="name" />
				<form:errors path="name"/>
				<br>
				<label>UserName</label>
				<form:input path="userName" />
				<br>
				<label>Password</label>
				<form:password path="password" />
				<br>
				<label>Country</label>
				<form:select path="country">
					<form:option value="Ind" label="India" />
					<form:option value="Myn" label="Myanmar" />
					<form:option value="Usa" label="United State of America" />
					<form:option value="Uk" label="United Kindom" />
				</form:select>
				<br>

				<label>Hobby: </label>
		Cricket: <form:checkbox path="hobbies" value="cricket" />
		Reading: <form:checkbox path="hobbies" value="reading" />
		Travel: <form:checkbox path="hobbies" value="travel" />
		Programming: <form:checkbox path="hobbies" value="programming" />
		Football: <form:checkbox path="hobbies" value="football" />
				<br>
				<br>
				<label>Gender</label>
		Male: <form:radiobutton path="gender" value="male" />
		Female: <form:radiobutton path="gender" value="female" />
				<br>
				<br>
				<h3>Communication </h3>
				<label>Phone</label>
				<form:input path="communicationDTO.phone" />
				<br>
				<label>Age</label>
				<form:password path="age" />
				<form:errors path="age"/>
				<br>
				<input type="submit" value="Submit" />
			</form:form>


		</div>



	</form:form>
</body>
</html>