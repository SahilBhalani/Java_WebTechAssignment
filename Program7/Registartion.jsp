<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">

				<h1 class="text-success">Registration Form</h1>

				<form action="reg" method="post">

					<input type="hidden" name="id" value="${edata.getId()}">

					<div class="form-group">
						<label>Firstname</label> <input type="text" name="fname"
							class="form-control" placeholder="Enter your Firstname"
							value="${edata.getFname()}"> <span class="text-danger">${fnameerr}</span>
					</div>

					<div class="form-group">
						<label>Lastname</label> <input type="text" name="lname"
							class="form-control" placeholder="Enter your Lastname"
							value="${edata.getLname()}"> <span class="text-danger">${lnameerr}</span>
					</div>

					<div class="form-group">
						<label>Email</label> <input type="text" name="email"
							class="form-control" placeholder="Enter your Email"
							value="${edata.getEmail()}"> <span class="text-danger">${emailerr}</span>
					</div>
					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							class="form-control" placeholder="Enter your Mobilenumber"
							value="${edata.getMobile()}"> <span class="text-danger">${mobileerr}</span>
					</div>

					<div class="form-group">
						<label>Gender</label> <input type="radio" name="gender"
							value="${edata.getGender()}">Male <input type="radio"
							name="gender" value="${edata.getGender()}">Female
						<%-- <span class="text-danger">${gendererr}</span> --%>
					</div>

					<div class="form-group">
						<label>Password</label> <input type="text" name="pass"
							class="form-control" placeholder="Enter your Password"
							value="${edata.getPass()}"> <span class="text-danger">${passerr}</span>
					</div>

					<div class="form-group">
						<input type="submit" class="btn btn-success">
					</div>

					<span>${msg}</span> <span><a href="viewuser"
						class="btn btn-primary">View user</a></span>

				</form>
			</div>
		</div>

	</div>


</body>
</html>