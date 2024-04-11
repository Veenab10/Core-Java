function pgFunction()
{
	console.log("Running..")
	var name=document.getElementById("name")
	console.log(name.value)
	
	let submitButton = document.getElementById("submit_button")
	submitButton.disabled =  true;
	
	if(name.value=="")
	{
		console.log("Please Enter The Name")
		var nameError=document.getElementById("nameError")
		nameError.innerHTML="Please Enter the Name"
		nameError.style.color='red'
		
	}
	
	var number=document.getElementById("number")
	console.log(number.value)
	if(number.value=="")
	{
		console.log("Please Enter The Phone Number")
		var numberError=document.getElementById("numberError")
		numberError.innerHTML="Please Enter Phone Number"
		numberError.style.color='red'
	}
	
	var language=document.getElementById("language")
	console.log(language.value)
	
	if(language.value=="")
	{
		console.log("Please Select Known Language")
		var languageError=document.getElementById("languageError")
		languageError.innerHTML="Please Select Known Language"
		languageError.style.color='red'
	}
	
	 var documents=document.getElementById("documents")
	 console.log(documents.value)
	 
	 if(documents.value=="")
	 {
		 console.log("Please Select Documents which you given")
		 var documentError=document.getElementById("documentError")
		 documentError.innerHTML="Please Select Documents which you given"
		 documentError.style.color='red'	
	 }
	 
	 console.log(document.Pgform.share);
	 console.log(document.Pgform.share[0]);
	 console.log(document.Pgform.share[1]);
	 
	 //console.log(document.Pgform.share.checked);
	 console.log(document.Pgform.share[0].checked);
	 console.log(document.Pgform.share[1].checked);
	 
	
	 
	 if(document.Pgform.share[0].checked==false &&
	 document.Pgform.share[1].checked==false)
	 {
		 console.log("please select pg share")
		 var shareError=document.getElementById("shareError")
		 shareError.innerHTML="Please Select Pg share"
		 shareError.style.color='red';
	 }
	 
	 if(!checkbox.checked){
		console.log("Please Accept")
		var checkboxError=document.getElementById("checkboxError")
		checkboxError.innerHTML="Please Accept"
		checkboxError.style.color='red'
		return;
	}
	return ;
	 
	 
}