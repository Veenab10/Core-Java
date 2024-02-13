package com.xworkz.inheritance.builtin_methods;

public class Tie {
	
	public Tie()
	{
		System.out.println("No parameter constructor of Tie");
	}
	
	public  String apparelMaterial="Art Silk";
	public String occasion="Business";
	public String brand="Bureaucrat";
	
	@Override
	public String toString() {
		return "Tie:"+"\n"+"Apparel Material:"+apparelMaterial+"\n"+"Occasion:"+occasion+"\n"+"Brand:"+brand;
	}
	


}
