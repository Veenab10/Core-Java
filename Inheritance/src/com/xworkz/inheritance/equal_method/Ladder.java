package com.xworkz.inheritance.equal_method;

public class Ladder {
	public Ladder() {
		System.out.println("no parameter constructor of Ladder");
	}
	
	public int price;
	public int height;
	public String brand;
	public String material;
	public int steps;
	public String color;
	
	@Override
	public String toString() {
		return "Ladder=Price:"+price+"\t"+"Height:"+height+"\t"+"Brand:"+brand+"\t"+"Material:"+material+"\t"+"Steps:"+steps+"\t"+"Color:"+color;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals running in Ladder class");
		System.out.println(this);
		if(obj!=null && obj instanceof Ladder)
		{
			Ladder ref=(Ladder)obj;
			System.out.println(ref);
			if(this.brand.equals(ref.brand)&& this.steps==ref.steps && this.price==ref.price)
			{
				return true;
			}
		}
		return false;
	}

}
