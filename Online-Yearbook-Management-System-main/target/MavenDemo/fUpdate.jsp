<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Record</title>
<link rel="stylesheet" href="styles_home.css">
</head>
<body>
<h1>Update record</h1>
<form action="fUpdateprocess">

<label><b>Student ID</b></label>
<input type="text" placeholder="Enter Student ID" name="sID" required>

<h3>Enter updated info:</h3>

<label><b>Student name</b></label>
<input type="text" placeholder="Enter name" name="sName" >
<label><b>Student password</b></label>
<input type="text" placeholder="Enter password" name="sPass">
<button type="submit" formmethod="post">Update</button>
</form>
</body>
</html>