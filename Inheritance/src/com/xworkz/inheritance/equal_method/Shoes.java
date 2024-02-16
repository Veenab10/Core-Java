package com.xworkz.inheritance.equal_method;

public class Shoes {
	
	public Shoes() {
		System.out.println("no parameter constructor of Shoe");
	}
	
	public String brand;
	public int price;
	public char size;
	public String archType;
	public String material;
	public String color;
	
	@Override
	public String toString() {
	return "Shoes=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Size:"+size+"\t"+"archType:"+archType+"\t"+"material:"+material+"\t"+"Color:"+color;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Belt class");
		System.out.println(this);
		if(obj!=null && obj instanceof Shoes)
		{
			Shoes shoe=(Shoes)obj;
			System.out.println(shoe);
			if(this.brand.equals(shoe.brand) && this.archType.equals(shoe.archType) && this.price==shoe.price)
			{
				return true;
			}
		}
		return false;
	}


}
