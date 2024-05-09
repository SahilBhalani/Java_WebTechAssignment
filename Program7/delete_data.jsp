<%@page import="Model.User"%>
<%@page import="java.util.ArrayList"%>
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
			<div class="col-md-8 m-auto"></div>
			<div class="col-md-8 m-auto">


				<h1 class="text-primary">Deleted User</h1>


				<table class="table" border="1">
					<tr>
						<th>Id</th>
						<th>Firstname</th>
						<th>Lastname</th>
						<th>Email</th>
						<th>Mobile</th>
						<th>Gender</th>
						<th>Password</th>
					</tr>

					<%
					ArrayList<User> user = (ArrayList) request.getAttribute("d_data");

					for (User u : user) {
					%>

					<tr>
						<td><%=u.getId()%></td>
						<td><%=u.getFname()%></td>
						<td><%=u.getLname()%></td>
						<td><%=u.getEmail()%></td>
						<td><%=u.getMobile()%></td>
						<td><%=u.getGender()%></td>
						<td><%=u.getPass()%></td>


					</tr>

					<%
					}
					%>


				</table>


				<span><a href="viewuser" class="btn btn-primary">Back</a></span>


			</div>

		</div>

	</div>

</body>
</html>