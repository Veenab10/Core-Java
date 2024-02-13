package com.xworkz.inheritance.object;

import com.xworkz.inheritance.single_inheritance.Vegetable;

public class Ginger extends Vegetable  {
	
	public Ginger()
	{
		System.out.println("no pram constructor of Ginger");
	}
	
	public int calories=80;
	
	public void oxidativeStress()
	{
		System.out.println("Ginger used for oxidative Stress ");
		
	}

}
