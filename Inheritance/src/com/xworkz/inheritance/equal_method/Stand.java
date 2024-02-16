package com.xworkz.inheritance.equal_method;

public class Stand {
	public Stand() {
		System.out.println("no parameter constructor of Stand");
	}
	
	public String brand;
	public int price;
	public String color;
	public int weight;
	public int feet;
	public String patternName;
	
	@Override
	public String toString() {
		return "Stand=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Color:"+color+"\t"+"Weight:"+weight+"\t"+"Feet:"+feet+"\t"+"Pattern Name:"+patternName;
	}
	
	@Override
	public boolean equals(Object obj) {
			System.out.println("equals method running in Stand class");
			System.out.println(this);
			if(obj!=null && obj instanceof Stand)
			{
				Stand ref=(Stand)obj;
				System.out.println(ref);
				if(this.brand.equals(ref.brand) && this.price==ref.price && this.feet==ref.feet)
				{
					return true;
				}
			}
			return false;
	}

}
