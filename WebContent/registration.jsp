<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
<a href="home.jsp" id="admin">Home</a>&nbsp;&nbsp;
	<h1>Registration Form</h1>
	<div class="ex">
		<form action="RegistrationServlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="country" /></td>
				</tr>
				<tr>
					<td>Pin Code</td>
					<td><input type="text" name="pincode" maxlength="6"/></td>
				</tr>
				<tr>
					<td>E-mail</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" name="gender" value="male" checked>Male</td>
					<td><input type="radio" name="gender" value="female" checked>Female</td>
					<td><input type="radio" name="gender" value="other" checked>Other</td>
				</tr>
				<tr>
					<td>Contact No.</td>
					<td><input type="number" name="contact" maxlength="10" /></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><input type="date" name="dob" /></td>
				</tr>
			</table>
			
			<input type="submit" value="register" />
			<input type="reset" />
		</form>
	</div>
</body>
</html>