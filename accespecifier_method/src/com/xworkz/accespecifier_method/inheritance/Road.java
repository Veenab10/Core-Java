package com.xworkz.accespecifier_method.inheritance;

public class Road {
	
	
	public void runHandWash(HandWash handWash)
	{
		handWash.aroma="Rose";
		System.out.println(handWash.aroma);
		handWash.clean();
		
	
		if(handWash instanceof Sanitizer)
		{
			Sanitizer sanitizer=(Sanitizer)handWash;
			sanitizer.quantity=100;
			System.out.println(sanitizer.quantity);
			sanitizer.disinfect();
		}
		 if(handWash instanceof Soap)
		{
			Soap soap=(Soap)handWash;
			soap.price=80;
			System.out.println(soap.price);
			soap.form();
			
			if(soap instanceof Lux)
			{
				Lux lux=(Lux)soap;
				lux.manufacturerName="Unilever";
				System.out.println(lux.manufacturerName);
				lux.makeYoung();
			}
		 
		}
		
		

}
}
