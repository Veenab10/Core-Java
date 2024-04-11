<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>xworkz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form>

<div>
<nav class="navbar navbar-dark bg-primary">


  <div><a class="navbar-brand" href="index.jsp">Home </a>
  
       </nav>
  
    </div>
    <h4>Entered Name:<span style="color:green">${Name}</span></h4>
    <h4>Entered Email:<span style="color:green">${Email}</span></h4>
    <h4>Entered College:<span style="color:green">${College}</span></h4>
    <h4>Entered Degree:<span style="color:green">${Degree}</span></h4>
    <h4>Entered Branch:<span style="color:green">${Branch}</span></h4>
    <h4>Entered Percentage:<span style="color:green">${Percentage}</span></h4>
    
</form>
</body>
</html>