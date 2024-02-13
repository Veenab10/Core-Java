package com.xworkz.inheritance.object;

import com.xworkz.inheritance.single_inheritance.Vegetable;

public class Onion extends Vegetable {
	
	public Onion()
	{
		System.out.println("no pram constructor of Onion");
	}
	
	public String genus=" Allium";
	
	public void protectsSkinInfections()
	{
		System.out.println("Onion used for protecting Skin Infections");
	}


}
