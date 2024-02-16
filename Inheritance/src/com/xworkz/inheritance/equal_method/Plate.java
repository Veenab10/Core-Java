package com.xworkz.inheritance.equal_method;

public class Plate {
	public Plate() {
		System.out.println("No parameter constructor of Plate");
	}
	public String brand;
	public int price;
	public String occasion;
	public String shape;
	public String pattern;
	public String material;
	
	@Override
	public String toString() {
		return "Plate=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Occasion:"+occasion+"\t"+"Shape:"+shape+"\t"+"Pattern:"+pattern+"\t"+"Material:"+material;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals running in Plate class");	
		System.out.println(this);
		if(obj!=null && obj instanceof Plate)
		{
			Plate ref=(Plate)obj;
			System.out.println(ref);
			if(this.brand.equals(ref.brand) && this.price==ref.price && this.material.equals(ref.material))
			{
				return true;
			}
			
		}
		return false;
		
	}
	}


