
package com.xworkz.inheritance.equal_method;

public class Button {
	
	public Button() {
		System.out.println("no paramete constructor of Button");
	}
	
	public String brand;
	public int price;
	public String material;
	public String shape;
	public String color;
	public String madeIn;
	
	@Override
	public String toString() {
		return "Button=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Material:"+material+"\t"+"Shape:"+shape+"\t"+"Color:"+color+"\t"+"Made In:"+madeIn;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running Button");
		System.out.println(this);
		if(obj!=null && obj instanceof Button)
		{
			Button ref=(Button)obj;
			System.out.println(ref);
			if(this.brand.equals(ref.brand) && this.price==ref.price && this.material.equals(ref.material))
			{
				return true;
			}
		}
		return false;
	}

}
