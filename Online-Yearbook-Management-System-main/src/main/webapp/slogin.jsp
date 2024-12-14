<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.sql.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles_home.css">
<style>
.form-center {
  display:flex;
  justify-content: center;
}
label {
 font-size: x-medium;
}
h1{text-align: center;}
</style>
<meta charset="ISO-8859-1">
<title>Student Login</title>
</head>
<body>
<h1 >STUDENT LOGIN </h1>
<pre>

</pre>	


<div class="form-center">
<form action="ssLogin">
	
		<label >Username: </label><input type=text name="user" placeholder="Username" required>
		
		
		
		<label >Password:   </label><input type=password name="pass" placeholder="Password" required>
		<button type="submit" formmethod="post">Login</button>
			
</form>
</div>
	
</body>
</html>