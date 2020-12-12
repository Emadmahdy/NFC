<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>add new Customer</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
	<h1 align="center">Newark Fulfillment Centers</h1>

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/home">Home</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/ViewCustomerInformation">Search
				Customer</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/addNewCustomer">Add new Customer</a></li>
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			data-bs-toggle="dropdown" href="#" role="button" aria-expanded="true">Dropdown</a>
			<ul class="dropdown-menu">
				<li><a class="dropdown-item" href="/ViewCustomerInformation">Action</a></li>
				<li><a class="dropdown-item" href="/ViewCustomerInformation">Another
						action</a></li>
				<li><a class="dropdown-item" href="#">Something else here</a></li>
				<li><hr class="dropdown-divider"></li>
				<li><a class="dropdown-item" href="#">Separated link</a></li>
			</ul></li>

		<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
		<li class="nav-item"><a class="nav-link disabled" href="#"
			tabindex="-1" aria-disabled="true">Disabled</a></li>
	</ul>

	<div class="container-lg">
		<section id="searchCustomer" class="section">
			<div class="mb-2">
				<br /> <br />
				<h2>Search Customer</h2>
				<br /> <br />
				<form:form method="post" action="/insertCustomer"
					modelAttribute="customerAdd">
					
					<br />
					<label>Username</label>
					<form:input path="username" type="text" />
					<form:errors path="username" cssClass="error" />
					<br />
					<label>Password</label>
					<form:input path="password" type="password" />
					<form:errors path="password" cssClass="error" />
					<br />
					<label>First Name</label>
					<form:input path="firstname" type="text" />
					<form:errors path="firstname" cssClass="error" />
					<br />
					<label>Last Name</label>
					<form:input path="lastname" type="text" />
					<form:errors path="lastname" cssClass="error" />
					<br />
					<label>Date of birth</label>
					<form:input path="dob" type="date" />
					<form:errors path="dob" cssClass="error" />
					<br />
					<label>Address 1</label>
					<form:input path="add1" type="text" />
					<form:errors path="add1" cssClass="error" />
					<br />
					<label>Address 2</label>
					<form:input path="add2" type="text" />
					<form:errors path="add2" cssClass="error" />
					<br />
					<label>city</label>
					<form:input path="city" type="text" />
					<form:errors path="city" cssClass="error" />
					<br />
					<label>state</label>
					<form:input path="state" type="text" />
					<form:errors path="state" cssClass="error" />
					<br />
					<label>Zip code</label>
					<form:input path="zip" type="text" />
					<form:errors path="dob" cssClass="error" />

					<br />
					<br />

					<input type="submit" value="Submit" id="submit"
						class="btn btn-primary">
					<input type="reset" value="reset" id="reset"
						class="btn btn-primary">
				</form:form>
			</div>
		</section>
		<br /> <br />

		<c:if test="${!empty customerReturn}">
			<h3>Cutomer's information</h3>

			<div class="card">
				<div class="card-body">
					<div class="row">
						<div class="col-sm">Cutomer ID</div>
						<div class="col-sm">${customerReturn.get().cid}</div>
					</div>
					<div class="row">
						<div class="col-sm">First name</div>
						<div class="col-sm">${customerReturn.get().firstname}</div>
					</div>
					<div class="row">
						<div class="col-sm">Last name</div>
						<div class="col-sm">${customerReturn.get().lastname}</div>
					</div>
					<div class="row">
						<div class="col-sm">Date of birth</div>
						<div class="col-sm">${customerReturn.get().dob}</div>
					</div>
					<div class="row">
						<div class="col-sm">Address 1</div>
						<div class="col-sm">${customerReturn.get().add1}</div>
					</div>
					<div class="row">
						<div class="col-sm">Address 2</div>
						<div class="col-sm">${customerReturn.get().add2}</div>
					</div>
					<div class="row">
						<div class="col-sm">City</div>
						<div class="col-sm">${customerReturn.get().city}</div>
					</div>
					<div class="row">
						<div class="col-sm">State</div>
						<div class="col-sm">${customerReturn.get().state}</div>
					</div>
					<div class="row">
						<div class="col-sm">Zip</div>
						<div class="col-sm">${customerReturn.get().zip}</div>
					</div>
				</div>
			</div>
		</c:if>
</body>
</html>