<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1 align="center">Register page</h1>
	<div align="center">
		<form action="actor.xworkz">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>E-mail</td>
					<td><input type="text" name="E-mail"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="Password"></td>
				<tr>
					<td>ConfirmPassword</td>
					<td><input type="password" name="confirmPwd"></td>
				</tr>
				<tr>
					<td>MobileNumber</td>
					<td><input type="text" name="phoneNo"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>
						<input type="radio" name="gender" value="Male">
						<label>Male</label>
						<input type="radio" name="gender" value="Female">
						<label>Female</label>
						<input type="radio" name="gender" value="Other">
						<label>Other</label>
					</td>
				</tr>
				<tr>
					<td>State</td>
					<td><select name="state">
						<option value="AP">Karnataka</option>
						<option value="KA">Andhrapradesh</option>
						<option value="KE">Tamilnadu</option>
						<option value="TN">Kerala</option>
						<option value="TE">Telangana</option>
					</select></td>
				</tr>
			</table>
		</form>
	</div>
	<div align="center">
			<button>Submit</button>
	</div>
</body>
</html>