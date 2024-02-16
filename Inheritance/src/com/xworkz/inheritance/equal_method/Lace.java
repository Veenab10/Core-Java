package com.xworkz.inheritance.equal_method;

public class Lace {
	
	public Lace() {
		System.out.println("no parameter constructor of Lace");
		}

	public String brand;
	public int price;
	public String occasion;
	public String color;
	public String material;
	public int length;
	
	@Override
	public String toString() {
	return "Lace=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Occasion:"+occasion+"\t"+"Color:"+color+"\t"+"Material:"+material+"\t"+"Length:"+length;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Lace class");
		System.out.println(this);
		if(obj!=null && obj instanceof Lace)
		{
			Lace lace=(Lace)obj;
			System.out.println(lace);
			if(this.brand.equals(lace.brand) && this.color.equals(lace.color) && this.price==lace.price)
			{
				return true;
			}
		}
		return false;
	}
}
