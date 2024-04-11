function nameValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var name1=document.getElementById("name1").value
	console.log(name1.value)
	if(name1.length>=5 && name1.length<10)
	{
			var nameError=document.getElementById("nameError")
		nameError.innerHTML=" Entered Name is valid"
		nameError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		
		console.log("Please Enter Name")
		var nameError=document.getElementById("nameError")
		nameError.innerHTML="Entered name is invalid"
		nameError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
	}
	
	function emailValidation()
	{
		let btn=document.getElementById("submit_button")
		console.log(btn)
		var email=document.getElementById("email").value
		console.log(email.value)
	if(email.length>=5 && email.length<30)
	{
			var emailError=document.getElementById("emailError")
		emailError.innerHTML=" Entered Name is valid"
		emailError.style.color='green'
		btn.removeAttribute("disabled");
				
	}
	
	else{
		
		console.log("Please Enter Name")
		var emailError=document.getElementById("emailError")
		emailError.innerHTML="Entered name is invalid"
		emailError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		
	}
	
	function collegeValidation()
	{
		let btn=document.getElementById("submit_button")
	console.log(btn)
	var college=document.getElementById("college")
	console.log(college.value)
	
	if(college.value=="")
	{
		var collegeError=document.getElementById("collegeError")
		collegeError.innerHTML=" Please Select degree"
		collegeError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var collegeError=document.getElementById("collegeError")
		collegeError.innerHTML=" entered value is correct "
		collegeError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
	validateAndEnableSubmit()
	}
	
	function degreeValidation(){
	
	
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var degree=document.getElementById("degree")
	console.log(degree.value)
	
	if(degree.value=="")
	{
		var degreeError=document.getElementById("degreeError")
		degreeError.innerHTML=" Please Select degree"
		degreeError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var degreeError=document.getElementById("degreeError")
		degreeError.innerHTML=" entered value is correct "
		degreeError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
	validateAndEnableSubmit()
}

function branchValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var branch=document.getElementById("branch")
	console.log(branch.value)
	
	if(branch.value=="")
	{
		var branchError=document.getElementById("branchError")
		branchError.innerHTML=" Please Select degree"
		branchError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var branchError=document.getElementById("branchError")
		branchError.innerHTML=" entered value is correct "
		branchError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
}

function percentageValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var percentage=document.getElementById("percentage").value
	console.log(percentage.value)
	if(percentage=="")
	{
			var percentageError=document.getElementById("percentageError")
		percentageError.innerHTML=" Please Enter the percentage"
		percentageError.style.color='red'
		btn.setAttribute("disabled","");
		
				
	}
	
	else{
		
		console.log("Please Enter Name")
		var percentageError=document.getElementById("percentageError")
		percentageError.innerHTML="Entered name is invalid"
		percentageError.style.color='green'
		btn.removeAttribute("disabled");
		 
				
		}
	}
	
/*function degreeValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	
	var degree=document.getElementById("degree").value
	console.log(degree.value)
	
	if(degree.value=='')
	{
		var degreeError=document.getElementById("degreeError")
		degreeError.innerHTML="Please Select degree "
		degreeError.style.color='red'
		btn.setAttribute("disabled","");
	}
	
}*/

