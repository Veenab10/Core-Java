package com.xworkz.inheritance.object;

import com.xworkz.inheritance.single_inheritance.Vegetable;

public class Chilli extends Vegetable {
	
	public  Chilli()
	{
		System.out.println("No pram constructor of Chilli");
	}
	
	public String type="Byadgi Chilli" ;
	
	 public void reducesCholesterolLevel()
	 {
		 System.out.println(" chilli used for reduces Cholesterol Level");
	 }


}
