package com.xworkz.example_interface.admin;

import com.xworkz.example_interface.rules.SamsungFreezer;

public class User {
	private SamsungFreezer samsung;
	
	public User(SamsungFreezer samsung) {
		this.samsung=samsung;
	}
	
	public void autoCool()
	{
		if(samsung!=null)
		{
			System.out.println("running samsungfreezer interface");
		}
		else
		{
			System.out.println("invalid samsunginterface");
		}
	}
	

}
