<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xworkz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="shoe.js">
</script>
</head>
<body>
<form name="shoe" method="post">
<div>

<nav class="navbar navbar-light bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Shoe Form</a>
  </div>
</div>


</div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Shoe  Brand Name</label>
    <input type="email" class="form-control" id="exampleInputEmail1" id="name" onblur="nameValidation()" aria-describedby="emailHelp">
    <span id="nameError"></span>
     </div>
  
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Shoe Price</label>
    <input type="email" class="form-control" id="exampleInputEmail1" id=""price aria-describedby="emailHelp">
    <span id="priceError"></span>
    
  </div>
  
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Amount</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Number of Pairs</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  
  <div>
  <button class="btn btn-primary" type="submit">Button</button>
  </div>
  

</form>
</body>
</html>