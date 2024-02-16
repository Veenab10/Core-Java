package com.xworkz.inheritance.equal_method;

public class Belt {
	
	public Belt() {
		System.out.println("no parameter constrictor of Belt");
	}
	
	public String brand;
	public int price;
	public char size;
	public String apparelMaterial;
	public String occasion;
	public String color;
	
	@Override
	public String toString() {
	return "Belt=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Size:"+size+"\t"+"Apparel Material:"+apparelMaterial+"\t"+"Occasion:"+occasion+"\t"+"Color:"+color;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Belt class");
		System.out.println(this);
		if(obj!=null && obj instanceof Belt)
		{
			Belt belt=(Belt)obj;
			System.out.println(belt);
			if(this.brand.equals(belt.brand) && this.apparelMaterial.equals(belt.apparelMaterial) && this.price==belt.price)
			{
				return true;
			}
		}
		return false;
	}

}
