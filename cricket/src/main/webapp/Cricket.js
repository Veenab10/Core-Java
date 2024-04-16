/*function nameValidation()
{
	var submit=document.getElementById("submit_button")
	
	var name=document.getElementById("name").value
	console.log(name.value)
	if(name=="")
	{
		console.log("Please Enter the value")
		var nameError=document.getElementById("nameError")
		nameError.innerHTML="Please Enter Player Name"
		nameError.style.color='red'
		submit.removeAttribute("disabled","")
		
	}
	else
	{
		var nameError=document.getElementById("nameError")
		nameError.innerHTML="correct"
		nameError.style.color='green'
		submit.setAttribute("disabled","")
	}
}*/


/*function nameValidation()
{
	let submit=document.getElementById("submit_button")
	console.log(submit)
	var name=document.getElementById("name").value
	console.log(name.value)
	if(name.length>=5 && name.length<20)
	{
		var nameError=document.getElementById("nameError")
		nameError.innerHTML=" Entered Name is valid"
		nameError.style.color='green'
		submit.removeAttribute("disabled");
				
	}
	
	else{
		console.log("Please Enter Name")
		var nameError=document.getElementById("nameError")
		nameError.innerHTML="Entered name is invalid,please Enter less than 20 characters only"
		nameError.style.color='red'
		 submit.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}*/


function nameValidation()
{
	var nameInput = document.getElementById("name").value;
    var nameError = document.getElementById("nameError");

    // Reset previous error message
    nameError.innerText = "";

    // Regular expression to validate name input
    var nameRegex = /^[a-zA-Z\s'-]+$/;

    // Check if the name input matches the regex pattern
    if (!nameRegex.test(nameInput)) {
        nameError.innerText = "Please enter a valid name";
        nameError.style.color='red'
        return false; // Prevent form submission
    }

}