<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="person" method="post">
<div class="form-group">
    <label for="exampleInputEmail1">ENTER FIRST NAME </label>
    <input type="text" class="form-select custom-select" id="firstName" aria-describedby="emailHelp" placeholder="Enter First Name" name="name1"/>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">ENTER LAST NAME </label>
    <input type="text" class="form-select custom-select" id="lastName" aria-describedby="emailHelp" placeholder="Enter Last Name" name="name2"/>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
<button type="submit" class="btn btn-primary" >send</button>
</div>
</form>
</body>
</html>