package com.xworkz.inheritance.equal_method;

public class Mug {
	
	public Mug() {
		System.out.println("no parameter constructor of Mug");
	}
	
	public String brand;
	public int price;
	public String material;
	public String occasion;
	public String theme;
	public String color;
	
	@Override
	public String toString() {
		return "Mug=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Material:"+material+"\t"+"Occasion:"+occasion+"\t"+"Theme:"+theme+"\t"+"Color:"+color;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Mug class");
		System.out.println(this);
		if(obj!=null && obj instanceof Mug)
		{
			Mug ref=(Mug)obj;
			System.out.println(ref);
			if(this.brand.equals(ref.brand) && this.price==ref.price && this.material.equals(ref.material))
			{
				return true;
			}
		}
		return false;
	}

}
