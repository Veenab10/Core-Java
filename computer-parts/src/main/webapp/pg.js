/*let fieldsChecks = {
    "name" : false,
    "number" : false,
    "language" : false,
    "documents" : false,
    "flexRadioDefault1" : false,
    "checkbox":false
}

function validateAndEnableSubmit(){
    let flag = false;

    for(let [key, value] of Object.entries(fieldsChecks)){

        if(value === false){
            flag = true;
            break;
        }
    }

    if(!flag){
        document.getElementById("submit_button").removeAttribute("disabled");
    }else{
        document.getElementById("submit_button").setAttribute("disabled","");
    }
}*/


function nameValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var name=document.getElementById("name").value
	console.log(name.value)
	if(name.length>=5 && name.length<6)
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
		validateAndEnableSubmit()
	
}

function numberValidation()
{
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var number=document.getElementById("number").value
	console.log(number.value)
	if(number.length>0 && number.length<=10)
	{
			var numberError=document.getElementById("numberError")
		numberError.innerHTML=" Entered Name is valid"
		numberError.style.color='green'
		btn.removeAttribute("disabled");
					
	}
	
	else{
		
		console.log("Please Enter Name")
		var numberError=document.getElementById("numberError")
		numberError.innerHTML="Entered name is invalid"
		numberError.style.color='red'
		 btn.setAttribute("disabled","");
				
		}
		validateAndEnableSubmit()
	
}
function languageValidation() {
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var language=document.getElementById("language")
	console.log(language.value)
	
	if(language.value=="")
	{
		var languageError=document.getElementById("languageError")
		languageError.innerHTML=" Please Select language"
		languageError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var languageError=document.getElementById("languageError")
		languageError.innerHTML=" Language is Entered"
		languageError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
	validateAndEnableSubmit()
}

function documentValidation(){
	
	
	let btn=document.getElementById("submit_button")
	console.log(btn)
	var documents=document.getElementById("documents")
	console.log(documents.value)
	
	if(documents.value=="")
	{
		var documentError=document.getElementById("documentError")
		documentError.innerHTML=" Please Select documents"
		documentError.style.color='red'
		btn.setAttribute("disabled","");
		
	}
	else{
		console.log("Please Enter Name")
		var documentError=document.getElementById("documentError")
		documentError.innerHTML=" Document is Entered "
		documentError.style.color='green'
		btn.removeAttribute("disabled");
		
	}
	validateAndEnableSubmit()
}

function sharingValidation(){
	let btn=document.getElementById("submit_button")
	console.log(btn)
	
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
		 btn.setAttribute("disabled","");
	 }
	 else(document.Pgform.share[0].checked==true &&
	 document.Pgform.share[1].checked==true)
	 {
		  var shareError=document.getElementById("shareError")
		 shareError.innerHTML="correct"
		 shareError.style.color='green';
		 btn.removeAttribute("disabled");
	 }
	 validateAndEnableSubmit()
}

function checkValidation()
{
	/*if(!checkbox.checked){
	*/
	var a=document.getElementById("checkbox1")
		console.log("Please Accept")
		if(a.checked)
		{
			var checkboxError=document.getElementById("checkboxError")
		checkboxError.innerHTML="Accepted"
		checkboxError.style.color='green'
		btn.removeAttribute("disabled");

		
	}
	else{
		var checkboxError=document.getElementById("checkboxError")
		checkboxError.innerHTML="Please Accept"
		checkboxError.style.color='red'
		btn.setAttribute("disabled","");
		
			}
	
	
	validateAndEnableSubmit();
	sharingValidation();
}



