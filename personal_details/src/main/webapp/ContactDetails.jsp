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
<form action="details" method="post">

<h4><span style="color:green">${FirstName},${LastName}</span>Please Provide Contact Details</h4>
<div class="form-group">
    <label for="exampleInputEmail1">ENTER EMAIL ID </label>
    <input type="text" class="form-select custom-select" id="email" aria-describedby="emailHelp" placeholder="Enter Email ID" name="email"/>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">ENTER PHONE NUMBER</label>
    <input type="number" class="form-select custom-select" id="phone" aria-describedby="emailHelp" placeholder="Enter Phone Number" name="phone"/>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
<button type="submit" class="btn btn-primary" >send</button>
</div>
</form>

</body>
</html>