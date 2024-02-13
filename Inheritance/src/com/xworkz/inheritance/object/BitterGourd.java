package com.xworkz.inheritance.object;

import com.xworkz.inheritance.single_inheritance.Vegetable;

public class BitterGourd extends Vegetable {
	
	public BitterGourd()
	{
		System.out.println("no pram constructor of BitterGourd");
	}
	
	public String Protein="1gram";
	
	public void controlBloodSugarLevels()
	{
		System.out.println("BitterGourd used for control Blood Sugar Levels ");
	}

}
