function nameValidation()
{
	var name1=document.getElementById("name");
	console.log(name1);
	 var submitton=document.getElementById("submitton")
	if(name1.value=="")
	{
		console.log("Enter Brand Name")
		var error=document.getElementById("nameError")
		error.innerHTML="Please Enter Brand Name"
		error.style.color='red'
		submitton.removeAttribute("disabled", "");
		
	}
	
}
function priceValidation()
{
	var price=document.getElementById("price")
	console.log(price)
	if(price.value=="")
	{
		console.log("Please Enter Price")
		var priceError=document.getElementById("priceError")
		priceError.innerHTML="Please Enter Price Details"
		priceError.style.color='red'
	}
}