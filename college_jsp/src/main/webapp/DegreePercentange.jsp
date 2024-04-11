<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="degree.js"></script>
</head>
<body>
<form action="degree" method="post">
<div class="form-group">
    <label for="exampleInputEmail1">Enter Name</label>
    <input type="text" class="form-select custom-select" id="name1" onblur="nameValidation()" aria-describedby="emailHelp" placeholder="Enter Name" name="name"/>
    <span id="nameError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Email Id</label>
    <input type="text" class="form-select custom-select" id="email" onblur="emailValidation()" aria-describedby="emailHelp" placeholder="Enter Email Id" name="email"/>
    <span id="emailError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
Select College<select class="form-select custom-select" id="college" onblur="collegeValidation()" name="college"  aria-label="Default select example">
  <option selected value="">--select college--</option>
  <option value="JSS">JSS</option>
  <option value="SMI">SMI</option>
  <option value="KCD">KCD</option>
  <option value="KUD">KUD</option>
  <option value="KHK">KHK</option>
  </select>
  <span id="collegeError"></span>
  </div>
  
  <div class="form-group">
Select Degree<select class="form-select custom-select" id="degree" name="degree" onblur="degreeValidation()" aria-label="Default select example">
  <option selected value="">--select degree--</option>
  <option value="BCA">BCA</option>
  <option value="MCA">MCA</option>
  <option value="BSC">BSC</option>
  <option value="MSC">MSC</option>
  <option value="BCOM">BCOM</option>
  </select>
  <span id="degreeError"></span>
  </div>
  
  <!-- <div class="form-group">
 SELECT GIVEN DOCUMENTS<select class="form-select custom-select" id="documents" name="documents" onblur="documentValidation()" aria-label="Default select example">
 
  <option selected value="">--select given documents--</option>
  <option value="ADDHAR CARD XEROX">ADDHAR CARD XEROX</option>
  <option value="PHOTO">PHOTO</option>
  <option value="RECEPIT">RECEPIT XEROX</option>
  
</select>
<span id="documentError"></span>
</div> -->
  
   <div class="form-group">
Select Branch<select class="form-select custom-select" name="branch" id="branch" onblur="branchValidation()" aria-label="Default select example">
  <option selected value="">--select branch --</option>
  <option value="CS">CS</option>
  <option value="Civil">Civil</option>
  <option value="Non-cs">Non-cs</option>
  
  </select>
  <span id="branchError"></span>

</div>

 <div class="form-group">
    <label for="exampleInputEmail1">Enter Percentage</label>
    <input type="text" class="form-select custom-select" id="percentage" onblur="percentageValidation()" aria-describedby="emailHelp" placeholder="Enter Percentage" name="percentage"/>
    <span id="percentageError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  
  <div class="form-group">
<button type="submit" class="btn btn-primary" id="submit_button" disabled>Save Result</button>
</div>
</form>
</body>
</html>