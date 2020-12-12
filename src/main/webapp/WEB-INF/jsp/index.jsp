<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
<meta charset="UTF-8">
<title>NFC</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
	<h1 align="center">Newark Fulfillment Centers</h1>
	<header id="home" class="header"> </header>
	<!-- #home -->

	<div>
		<section id="registration" class="section">
	 <div class="container tagline">
	 <em>Register Customer</em><br/>
    		 <form:form method="post" action="/registerCustomer" modelAttribute="newcustomer">
    			<label>Username</label> <form:input path="username" type="text" /><form:errors path="username" cssClass="error"/><br/>
    			<label>Password</label> <form:input path="password" type="password" /><form:errors path="password" cssClass="error"/><br/>
    			<label>First Name</label> <form:input path="firstName" type="text" /><form:errors path="firstName" cssClass="error"/><br/>
    			<label>Last Name</label> <form:input path="lastName" type="text" /><br/>
    			<label>What do you want to do? </label> 
				<form:radiobutton path="activity" id="activity" value="sport"/>Play a Sport?
				<form:radiobutton path="activity" id="activity" value="gym"/>Hit the Gym?
				<form:errors path="activity" cssClass="error"/><br/>
    			<label>Date of birth</label>
    			<form:input path="dateOfBirth" type="date" /><form:errors path="dateOfBirth" cssClass="error"/><br/>
    			<label>Gender</label>
    			<form:select path="gender" items="${genderitems}"/>
    			<br/>
				  
    			<input type="submit" value="Submit" id="submit"> <input type="reset" value="reset" id="reset">
    		</form:form>
		</div>
	</section>
	
		
	</div>

	<footer class="footer"> </footer>
	<!-- footer -->

</body>
</html>
