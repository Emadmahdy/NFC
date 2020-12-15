<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>Add new Inventory</title>
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
	<h2>Warehouse Customer Inventory Management</h2>

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/home">Home</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/ViewCustomerInformation">Search
				Customer</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/addNewCustomer">Add new Customer</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/addNewInventory">Add new Inventory</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/ViewAvailableInventory">View Available
				Inventory</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/addNewOrder">Add new Order</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/ViewOrder">View Available Order</a></li>
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="/employeeView">Employee View</a></li>
	</ul>

	<div class="container-lg">
		<section id="searchCustomer" class="section">
			<div class="mb-2">
				<br /> <br />
				<h2>Add Order</h2>
				<br /> <br />
				<form:form method="post" action="/addOrder" modelAttribute="orders">

					<br />
					<label>Type</label>
					<form:input path="type" type="text" />
					<form:errors path="type" cssClass="error" />
					<br />
					<label>amount</label>
					<form:input path="amount" type="text" />
					<form:errors path="amount" cssClass="error" />
					<br />
					<label>Inventory ID</label>
					<form:input path="iid" type="text" />
					<form:errors path="iid" cssClass="error" />
					<br />
					<label>Warehouse ID</label>
					<form:input path="wid" type="text" />
					<form:errors path="wid" cssClass="error" />
					<br />
					<label>Customer ID</label>
					<form:input path="cid" type="text" />
					<form:errors path="cid" cssClass="error" />
					
					<br />

					<br />

					<input type="submit" value="Submit" id="submit"
						class="btn btn-primary">
					<input type="reset" value="reset" id="reset"
						class="btn btn-primary">
				</form:form>
			</div>
		</section>
	</div>
	<br />
	<br />

	<c:if test="${!empty confirm}">
		<h3>Cutomer's Inventory</h3>
		<div class="card">
			<div class="card-body">

				<div class="row">
					<div class="col-sm">Order ID</div>
					<div class="col-sm">${confirm.oid}</div>
				</div>
				<div class="row">
					<div class="col-sm">Cutomer ID</div>
					<div class="col-sm">${confirm.cid}</div>
				</div>
				<div class="row">
					<div class="col-sm">Inventory ID</div>
					<div class="col-sm">${confirm.iid}</div>
				</div>
				<div class="row">
					<div class="col-sm">Type</div>
					<div class="col-sm">${confirm.type}</div>
				</div>
				<div class="row">
					<div class="col-sm">amount</div>
					<div class="col-sm">${confirm.amount}</div>
				</div>
				<div class="row">
					<div class="col-sm">Warehouse</div>
					<div class="col-sm">${confirm.wid}</div>
				</div>

			</div>
		</div>
	</c:if>
</body>
</html>