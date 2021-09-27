<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
</head>
<body>
<h2>Registration for Vaccine</h2>
	<div align="center">

		<form action="/onRegister.xworkz">
			<pre>
<label>UserName</label>
<input type="text" name="UserName">
<label>Email</label>
<input type="text" name="email">
<label>PassWord</label>
<input type="password" name="password">
<label>Confirm Password</label>
<input type="password" name="confirmPassword">
<label>PhoneNo</label>
<input type="text" name="phoneNo">
<label>Vaccine type</label>
<select name="vaccineType">
<option value="Covishield">Covishield></option>
<option value="Covaxine">Covaxine</option>
<option value="Covaxine">Sputnic</option>
</select>
<label>Aadhar no</label>
<input type="text" name="aadharNo">
<label>gender</label>
<label>male<input type="radio" name="gender" value="male"></label>
<label>female<input type="radio" name="gender" value="male"></label>
<label>others<input type="radio" name="gender" value="male"></label>
<br>
<input type="submit" value="Register">
</pre>
		</form>
	</div>

</body>
</html>