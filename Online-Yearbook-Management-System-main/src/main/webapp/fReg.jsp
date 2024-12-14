<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Faculty Registration</title>
<link rel="stylesheet" href="styles_home.css">
</head>
<body>
<h1>Faculty Registration</h1>
<form action="fRegprocess">

<label><b>Faculty ID</b></label>
<input type="text" placeholder="Enter ID" name="fID" required>
<label><b>Faculty name</b></label>
<input type="text" placeholder="Enter name" name="fName" required>
<label><b>Faculty password</b></label>
<input type="password" placeholder="Enter password" name="fPass" required>
<button type="submit" formmethod="post">Submit</button>
</form>
</body>
</html>