<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Faculty login</title>
<link rel="stylesheet" href="styles_home.css">
</head>
<body>
<h1>Welcome Faculty</h1>
<form action="fLoginprocess" >
<label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="fID" required>
    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="fPass" required>
    <button type="submit" >Login</button>
    
 </form>
	
	

</body>
</html>