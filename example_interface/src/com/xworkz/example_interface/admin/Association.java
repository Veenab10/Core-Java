package com.xworkz.example_interface.admin;

import com.xworkz.example_interface.rules.LgFreezer;

public class Association {
	
	private LgFreezer lg;
	
	public Association(LgFreezer lg) {
		this.lg=lg;
		
	}
	
	public void autoCool()
	{
		if(lg!=null)
		{
			System.out.println("running lgfreezer interface ");
		}
		else
		{
			System.out.println("invalid lgfreezer");
		}
	}
	public void temperatureControl()
	{
		if(lg!=null)
		{
			System.out.println(" Running Temperature control method");
		}
		else
		{
			System.out.println("Invalid Temperature control");
		}
	}

}
