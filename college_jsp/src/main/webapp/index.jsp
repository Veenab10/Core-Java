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
<form action="college" method="post">

<div class="form-group">
    <label for="exampleInputEmail1">Enter Message</label>
    <input type="text" class="form-select custom-select" id="message" aria-describedby="emailHelp" placeholder="Enter Message" name="messages"/>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
<div class="form-group">
<button type="submit" class="btn btn-primary" >send</button>
</div>
<!-- <a href="Message.jsp">Message</a> -->
</form>
</body>
</html>