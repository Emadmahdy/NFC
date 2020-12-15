<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>View Customer Information</title>
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
	<h2>Warehouse Management</h2>

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
				<h2>Employee ID</h2>
				<br /> <br />
				<form:form method="post" action="/employeeSearch"
					modelAttribute="employee">
					<label>Employee ID</label>
					<form:input path="eid" type="text" />
					<form:errors path="eid" cssClass="error" />
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

		<c:if test="${!empty employeeReturn}">
			<h3>employee's information</h3>

			<div class="card">
				<div class="card-body">
					<div class="row">
						<div class="col-sm">Employee ID</div>
						<div class="col-sm">${employeeReturn.eid}</div>
					</div>
					<div class="row">
						<div class="col-sm">Employee role ID</div>
						<div class="col-sm">${employeeReturn.role}</div>
					</div>
					<div class="row">
						<div class="col-sm">Employee role name</div>
						<div class="col-sm">${employeeReturn.name}</div>
					</div>
					<div class="row">
						<div class="col-sm">First name</div>
						<div class="col-sm">${employeeReturn.firstname}</div>
					</div>
					<div class="row">
						<div class="col-sm">Last name</div>
						<div class="col-sm">${employeeReturn.lastname}</div>
					</div>
					<div class="row">
						<div class="col-sm">Address 1</div>
						<div class="col-sm">${employeeReturn.add1}</div>
					</div>
					<div class="row">
						<div class="col-sm">Address 2</div>
						<div class="col-sm">${employeeReturn.add2}</div>
					</div>
					<div class="row">
						<div class="col-sm">City</div>
						<div class="col-sm">${employeeReturn.city}</div>
					</div>
					<div class="row">
						<div class="col-sm">State</div>
						<div class="col-sm">${employeeReturn.state}</div>
					</div>
					<div class="row">
						<div class="col-sm">Zip</div>
						<div class="col-sm">${employeeReturn.zip}</div>
					</div>
				</div>
			</div>
		</c:if>
		<br /> <br />
		<c:if test="${!empty unprocessedOrders}">
			<h3>Unprocessed Orders</h3>
			<c:forEach var="unprocessedOrdersItem" items="${unprocessedOrders}">
				<div class="card">

					<div class="card-body">
						<form:form method="post" action="/markProccessed/${employeeReturn.eid}"
							modelAttribute="orders">
							<div class="row">
								<div class="col-sm">Order ID</div>
								<div class="col-sm">${unprocessedOrdersItem.oid}</div>
								<form:hidden path="oid" value="${unprocessedOrdersItem.oid}"/>
								
							</div>
							<div class="row">
								<div class="col-sm">Cutomer ID</div>
								<div class="col-sm">${unprocessedOrdersItem.cid}</div>
							</div>
							<div class="row">
								<div class="col-sm">Inventory ID</div>
								<div class="col-sm">${unprocessedOrdersItem.iid}</div>
							</div>
							<div class="row">
								<div class="col-sm">Amount</div>
								<div class="col-sm">${unprocessedOrdersItem.amount}</div>
							</div>
							<div class="row">
								<div class="col-sm">Type</div>
								<div class="col-sm">${unprocessedOrdersItem.type}</div>
							</div>
							<div class="row">
								<div class="col-sm">Warehouse</div>
								<div class="col-sm">${unprocessedOrdersItem.wid}</div>
							</div>
							<div class="row">
								<div class="col-sm">Date</div>
								<div class="col-sm">${unprocessedOrdersItem.date}</div>
							</div>
							<div class="row">
								<div class="col-sm">Processed</div>
								<div class="col-sm">${unprocessedOrdersItem.processed}</div>
							</div>
							<br />
							<input type="submit" value="Mark processed" id="submit"
								class="btn btn-primary">
						</form:form>
						<br />
					</div>
				</div>
				<br />
			</c:forEach>
		</c:if>
</body>
</html>