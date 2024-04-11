function marketValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var market=document.getElementById("market").value
	console.log(market.value)
	if(market.length>=5 && market.length<20)
	{
			var marketError=document.getElementById("marketError")
		marketError.innerHTML=" Entered Name is valid"
		marketError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Name")
		var marketError=document.getElementById("marketError")
		marketError.innerHTML="Entered name is invalid,please Enter less than 20 characters only"
		marketError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}


function locationValidation(){
		
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var location=document.getElementById("location")
	console.log(location.value)
	
	if(location.value=="")
	{
		var locationError=document.getElementById("locationError")
		locationError.innerHTML=" Please Select location"
		locationError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var locationError=document.getElementById("locationError")
		locationError.innerHTML=" location is Entered "
		locationError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
	validateAndEnableSubmit()
}


function cityValidation(){
		
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var city=document.getElementById("city")
	console.log(city.value)
	
	if(city.value=="")
	{
		var cityError=document.getElementById("cityError")
		cityError.innerHTML=" Please Select City"
		cityError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var cityError=document.getElementById("cityError")
		cityError.innerHTML=" City is Entered "
		cityError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
	validateAndEnableSubmit()
}


function pincodeValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var pincode=document.getElementById("pincode").value
	console.log(pincode.value)
	if(pincode.length==6)
	{
			var pincodeError=document.getElementById("pincodeError")
		pincodeError.innerHTML=" Entered pincode is valid"
		pincodeError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Pincode")
		var pincodeError=document.getElementById("pincodeError")
		pincodeError.innerHTML="Entered pincode is invalid, Please Enter pincode greater than 1 less than 6"
		pincodeError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}

function areaValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var area=document.getElementById("area").value
	console.log(area.value)
	if(area.length>=5 && area.length<20)
	{
			var areaError=document.getElementById("areaError")
		areaError.innerHTML=" Entered  area Name is valid"
		areaError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Eneter Area Name")
		var areaError=document.getElementById("areaError")
		areaError.innerHTML="Entered area name is invalid,please Enter less than 20 characters only"
		areaError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}


function marketTypeValidation(){
		
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var type=document.getElementById("type")
	console.log(type.value)
	
	if(type.value=="")
	{
		var typeError=document.getElementById("typeError")
		typeError.innerHTML=" Please Select Market Type"
		typeError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var typeError=document.getElementById("typeError")
		typeError.innerHTML=" Market Type is Entered "
		typeError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
	validateAndEnableSubmit()
}

function stallNumberValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var stallNo=document.getElementById("stallNo").value
	console.log(stallNo.value)
	if(stallNo.length>1 && stallNo.length<1000)
	{
			var stallNoError=document.getElementById("stallNoError")
		stallNoError.innerHTML=" Entered Stall Number is valid"
		stallNoError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Stall Number")
		var stallNoError=document.getElementById("stallNoError")
		stallNoError.innerHTML="Entered Stall Number is invalid"
		stallNoError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
}


function itemNameValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var itemName=document.getElementById("itemName").value
	console.log(itemName.value)
	if(itemName.length>=5 && itemName.length<20)
	{
		var marketError=document.getElementById("itemNameError")
		itemNameError.innerHTML=" Entered  Item Name is valid"
		itemNameError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Item Name")
		var itemNameError=document.getElementById("itemNameError")
		itemNameError.innerHTML="Entered  Item name is invalid,please  enter greater than 1 less than 20 character"
		itemNameError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}

function itemQuantityValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var itemQuantity=document.getElementById("itemQuantity").value
	console.log(itemQuantity.value)
	if(itemQuantity.length>1 && itemQuantity.length<1000)
	{
			var itemQuantityError=document.getElementById("itemQuantityError")
		itemQuantityError.innerHTML=" Entered Quantity is valid"
		itemQuantityError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Quantity")
		var itemQuantityError=document.getElementById("itemQuantityError")
		itemQuantityError.innerHTML="Entered Quantity is invalid, please enter greater than 1 less than 20"
		itemQuantityError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}

function itemCostValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var itemCost=document.getElementById("itemCost").value
	console.log(itemCost.value)
	if(itemCost.length>1 && itemCost.length<1000)
	{
			var itemCostError=document.getElementById("itemCostError")
		itemCostError.innerHTML=" Entered item cost is valid"
		itemCostError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Item Cost")
		var itemCostError=document.getElementById("itemCostError")
		itemCostError.innerHTML="Entered item cost is invalid, please enter greater than 1 less than 20"
		itemCostError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}

function ownerValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var owner=document.getElementById("owner").value
	console.log(owner.value)
	if(owner.length>=5 && owner.length<20)
	{
			var ownerError=document.getElementById("ownerError")
		ownerError.innerHTML=" Entered OwnerName is valid,please enter greater than 1 and less than 20 character"
		ownerError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Owner Name")
		var ownerError=document.getElementById("ownerError")
		ownerError.innerHTML="Entered OwnerName is invalid, please enter greter than 1 and less than 20 character"
		ownerError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}



function kEBNoValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var kebNo=document.getElementById("kebNo").value
	console.log(kebNo.value)
	if(kebNo.length>1 && kebNo.length<1000)
	{
			var kebNoError=document.getElementById("kebNoError")
		kebNoError.innerHTML=" Entered Name is valid"
		kebNoError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Name")
		var kebNoError=document.getElementById("kebNoError")
		kebNoError.innerHTML="Entered name is invalid, please greater than 1 less than 20"
		kebNoError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}


function GSTValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var gst=document.getElementById("gst").value
	console.log(gst.value)
	if(isNaN(gst)|| gst < 1 || gst.length> 7)
	{
		console.log("Please Enter  StallOwner GST Number")
		var gstError=document.getElementById("gstError")
		gstError.innerHTML="Entered stall owner gst number is invalid, please enter greater than 1 less than 7"
		gstError.style.color='red'
		 btn.setAttribute("disabled","");
			
				
	}
	
	else{
		var gstError=document.getElementById("gstError")
		gstError.innerHTML=" Entered stall owner gst number is valid"
		gstError.style.color='green'
		btn.removeAttribute("disabled");
		
				
		}
		validateAndEnableSubmit()
	
}

function transactionValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var transaction=document.getElementById("transaction").value
	console.log(transaction.value)
	if(isNaN(transaction)|| transaction < 1 || transaction.length> 10)
	{
		console.log("Please Enter Weekely Transaction")
		var transactionError=document.getElementById("transactionError")
		transactionError.innerHTML="Please Enter transaction greater than 1 to less than 10"
		transactionError.style.color='red'
		 btn.setAttribute("disabled","");		
	}
	
	else{
		var transactionError=document.getElementById("transactionError")
		transactionError.innerHTML=" Entered TRANSACTION is valid"
		transactionError.style.color='green'
		btn.removeAttribute("disabled");
						
		}
		validateAndEnableSubmit()
	
}








