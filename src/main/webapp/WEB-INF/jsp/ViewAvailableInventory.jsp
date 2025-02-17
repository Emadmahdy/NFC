<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta charset="UTF-8">
<title>View Customer Inventory</title>
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
				<h2>Search Customer's inventory</h2>
				<br /> <br />
				<form:form method="post" action="/searchCustomerInventory"
					modelAttribute="customer">
					<label>Customer ID</label>
					<form:input path="cid" type="text" />
					<form:errors path="cid" cssClass="error" />
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
		<c:if test="${!empty returnInv}">
			</br>
			</br>
			<h3>Cutomer's Inventory</h3>
			<c:forEach var="returnInvItem" items="${returnInv}">
				<div class="card">

					<div class="card-body">
						<form:form method="post"
							action="/UpdateInventory/${returnInvItem.iid}"
							modelAttribute="inventory">
							
							<div class="row">
								<div class="col-sm">Cutomer ID</div>
								<div class="col-sm">${returnInvItem.cid}</div>
								<form:hidden path="cid" value="${returnInvItem.cid}"/>
							</div>
							<div class="row">
								<div class="col-sm">Inventory ID</div>
								<div class="col-sm">${returnInvItem.iid}</div>
								<form:hidden path="iid" value="${returnInvItem.iid}"/>
							</div>
							<div class="row">
								<div class="col-sm">Name</div>
								<div class="col-sm">${returnInvItem.name}</div>
							</div>
							<div class="row">
								<div class="col-sm">amount</div>
								<div class="col-sm">${returnInvItem.amount}</div>
								
							</div>
							<div class="row">
								<div class="col-sm">Warehouse</div>
								<div class="col-sm">${returnInvItem.wid}</div>
							</div>
							</br>
							<div class="col-sm">New amount</div>
							<form:input class="col-sm" path="amount" value="${returnInvItem.amount}"/>
							<input type="submit" value="Update Inventory" id="submit"
								class="btn btn-primary">
						</form:form>
						</br>
					</div>
				</div>
				</br>
				</br>
			</c:forEach>
		</c:if>
</body>
</html>