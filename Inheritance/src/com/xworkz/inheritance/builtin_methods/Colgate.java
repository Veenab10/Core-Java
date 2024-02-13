package com.xworkz.inheritance.builtin_methods;

public class Colgate {
	
	public Colgate()
	{
		System.out.println("No parameter constructor of Colgate");
	}
	
	public String itemForm="Gel";
	public String flavour="Spicy fresh";
	public int price=45;
	
	@Override
	public String toString() {
		
		return "Colgate:"+"\n"+"Item Form:"+itemForm+"\n"+"flavour:"+flavour+"\n"+"Price:"+price;
	}

}
