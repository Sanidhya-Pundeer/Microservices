<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete record</title>
<link rel="stylesheet" href="styles_home.css">
</head>
<body>
<h1>Delete record</h1>
<form action="fDeleteprocess">

<label><b>Student ID</b></label>
<input type="text" placeholder="Enter Student ID" name="sID" required>
<button type="submit" formmethod="post">Delete</button>
</form>

</body>
</html>