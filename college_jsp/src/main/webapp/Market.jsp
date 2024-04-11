<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>xworkz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="Market1.js"></script>
</head>
<body>
<form action="market" method="post">
<div class="form-group">
    <label for="exampleInputEmail1">Enter Market Name</label>
    <input type="text"  id="market" onblur="marketValidation()" aria-describedby="emailHelp" placeholder="Enter Market Name" name="market"/>
    <span id="marketError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
Select Location<select class="form-select custom-select" id="location" onblur="locationValidation()" name="location"  aria-label="Default select example">
  <option selected value="">--select Location--</option>
  <option value="JayNagar">Jaynagar</option>
  <option value="K R Market">K R Market</option>
  <option value="Majestic">Majestic</option>
  <option value="BTM">BTM</option>
  <option value="JPNagar">JPNagar</option>
  </select>
  <span id="locationError"></span>
  </div>
  
   <div class="form-group">
Select City<select class="form-select custom-select" id="city" onblur="cityValidation()" name="city"  aria-label="Default select example">
  <option selected value="">--select City--</option>
  <option value="Banglore">Banglore</option>
  <option value="Mysore">Mysore</option>
  <option value="Dharwad">Dharwad</option>
  <option value="Hubli">Hubli</option>
  <option value="Bagalkot">Bagalkot</option>
  </select>
  <span id="cityError"></span>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Pincode</label>
    <input type="number"  id="pincode" onblur="pincodeValidation()" aria-describedby="emailHelp" placeholder="Enter pincode" name="pincode"/>
    <span id="pincodeError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Area Name</label>
    <input type="text" id="area" onblur="areaValidation()" aria-describedby="emailHelp" placeholder="Enter Area Name" name="area"/>
    <span id="areaError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
    <div class="form-group">
Select Type<select class="form-select custom-select" id="type" onblur="marketTypeValidation()" name="type"  aria-label="Default select example">
  <option selected value="">--select Market Type--</option>
  <option value="Fruit">Fruit</option>
  <option value="Bags">Bags</option>
  <option value="Shoes">Shoes</option>
  <option value="Shoes">Shoes</option>
  <option value="Toys">Toys</option>
  </select>
  <span id="typeError"></span>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Stall Number</label>
    <input type="number"  id="stallNo" onblur="stallNumberValidation()" aria-describedby="emailHelp" placeholder="Enter Stall Number" name="stallNo"/>
    <span id="stallNoError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Item Name</label>
    <input type="text"  id="itemName" onblur="itemNameValidation()" aria-describedby="emailHelp" placeholder="Enter Item Name" name="itemName"/>
    <span id="itemNameError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
 <!--  <div class="form-group">
    <label for="exampleInputEmail1">Enter Item Quality</label>
    <input type="text" class="form-select custom-select" id="itemQuality" onblur="itemQualityValidation()" aria-describedby="emailHelp" placeholder="Enter Item Quality" name="itemQuality"/>
    <span id="itemQualityError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div> -->
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Item Quantity</label>
    <input type="number"  id="itemQuantity" onblur="itemQuantityValidation()" aria-describedby="emailHelp" placeholder="Enter Item Quantity" name="itemQuantity"/>
    <span id="itemQuantityError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Item Cost</label>
    <input type="number"  id="itemCost" onblur="itemCostValidation()" aria-describedby="emailHelp" placeholder="Enter Item Cost" name="itemCost"/>
    <span id="itemCostError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Stall Owner Name</label>
    <input type="text" ct" id="owner" onblur="ownerValidation()" aria-describedby="emailHelp" placeholder="Enter Stall Owner Name" name="owner"/>
    <span id="ownerError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Stall KEB Number</label>
    <input type="number"  id="kebNo" onblur="kEBNoValidation()" aria-describedby="emailHelp" placeholder="Enter KEB Number" name="kebNo"/>
    <span id="kebNoError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter stall Owner GST Number</label>
    <input type="number"  id="gst" onblur="GSTValidation()" aria-describedby="emailHelp" placeholder="Enter Stall Owner GST Number" name="gst"/>
    <span id="gstError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Weekly Transaction</label>
    <input type="number"  id="transaction" onblur="transactionValidation()" aria-describedby="emailHelp" placeholder="Enter Weekly Transaction" name="transaction"/>
    <span id="transactionError"></span>
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
   <div class="form-group">
<button type="submit" class="btn btn-primary" id="submit_button" disabled>Save Market details</button>
</div>
  

</body>
</html>