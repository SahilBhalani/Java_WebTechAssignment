<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

				<form action="add" method="post">

					<input type="hidden" name="id" value="${edata.getId()}">

					<div class="form-group">
						<label>First name</label> <input type="text" name="fname"
							placeholder="Enter the Firstname" class="form-control"
							value="${edata.getFname()}"> <span class="text-danger">${fnameerr}</span>
					</div>

					<div class="form-group">
						<label>Last name</label> <input type="text" name="lname"
							placeholder="Enter the Lastname" class="form-control"
							value="${edata.getLname()}"> <span class="text-danger">${lnameerr}</span>
					</div>

					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							placeholder="Enter your Mobile number" class="form-control"
							value="${edata.getMobile()}"> <span class="text-danger">${mobileerr}</span>
					</div>

					<div class="form-group">
						<label>Email</label> <input type="email" name="email"
							placeholder="Enter your Email" class="form-control"
							value="${edata.getEmail()}"> <span class="text-danger">${emailerr}</span>
					</div>

					<div class="form-group">
						<label>Password</label> <input type="text" name="pass"
							placeholder="Enter your Password" class="form-control"
							value="${edata.getPass()}"> <span class="text-danger">${passerr}</span>
					</div>

					<div class="form-group">
						<input type="submit" class="btn btn-success">
					</div>

					<div class="form-group">
						<span><a href="display" class="btn btn-primary">View
								User</a></span>
					</div>

					<span>${msg}</span>

				</form>
			</div>

		</div>
	</div>

</body>
</html>