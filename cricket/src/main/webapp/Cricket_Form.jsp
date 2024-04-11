<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="Cricket.js"></script>
</head>
<body>
<form action="cricket" method="post">
<div>
<nav class="navbar navbar-dark bg-primary">

  <div>
  <a class="navbar-brand" href="index.jsp">HOME</a>
          </nav>
  
    </div>
    
    <form>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Player Name</label>
    <input type="email" class="form-control" name="name" id="name" onblur="nameValidation()" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Player Name">
    <span id="nameError"></span>
    <!-- <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small> -->
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="number" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>