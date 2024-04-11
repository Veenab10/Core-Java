function tvRecharge(){
	console.log("Running..")


	var customerId=document.getElementById("customerId").value;
	console.log(customerId)
	console.log(customerId.value)
	//var letterNumber = /^[0-9a-zA-Z]+$/;
	//if(!customerId.value.match(letterNumber))
	
	let submitButton = document.getElementById("submit_button")
	submitButton.disabled =  true;
	
	//let onchange=document.getElementById("submit_button")
	//onchange.disabled=true;
	
	//submitButton.disabled = false
	if(customerId.length < 8)
	{
		console.log("Please Enter Customer  ID")
		var nameError=document.getElementById("nameError")
		nameError.innerHTML="Please Enter Customer ID"
		nameError.style.color='red'
		
	}
	/*else{
		var onchange=document.getElementById("submit_button").addEventListener("change", tvRecharge);
	onchange.disabled=false;
	return;
	}*/
	
	
	var vendor=document.getElementById("vendor")
	console.log(vendor)
	console.log(vendor.value)
	
	if(vendor.value=='')
	{
		console.log("Please Select Vendor")
		var vendorError=document.getElementById("vendorError")
		vendorError.innerHTML="Please Select Vendor"
		vendorError.style.color='red'
		
		
	}
	
	var amount=document.getElementById("amount")
	console.log(amount)
	console.log(amount.value)
	if(amount.value=="")
	{
		console.log("Please Enter Tv Recharge Amount")
		var amountError=document.getElementById("amountError")
		amountError.innerHTML="Please Enter Tv Recharge Amount"
		amountError.style.color='red'
	}
	
	//var rechargeType=document.getElementById("rechargeType")
	//console.log(rechargeType)
	//console.log(rechargeType.value)
	//if(rechargeType.value=="")
	//{
	//	console.log("Please Enter  Recharge Type")
	//	var rechargeError=document.getElementById("rechargeError")
	//	rechargeError.innerHTML="Please Select Recharge Type"
	//	rechargeError.style.color='red'
	//}
	
	//var check=document.getElementById("check")
	
	//if(check.value=""){
		//console.log("Please checked this one")
		//var checkError=document.getElementById("checkError")
		//checkError.innerHTML="Please checked this one"
		//checkError.style.color='red'
	//}
	
	if(!checkbox.checked){
		console.log("Please Accept")
		var checkboxError=document.getElementById("checkboxError")
		checkboxError.innerHTML="Please Accept"
		checkboxError.style.color='red'
		return;
	}
	return;
	return;
	
	submitButton.disabled = false ;
}
