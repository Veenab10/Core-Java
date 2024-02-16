package com.xworkz.inheritance.equal_method;

public class Socks {
	
	public Socks() {
		System.out.println("No parameter constructor of Socks");
	}
	
	public String brand;
	public int price;
	public String apparelMaterial;
	public String occasion;
	public String style;
	public String color;
	
	@Override
	public String toString() {
		return "Socks=Brand:"+brand+"\t"+"Price:"+"\t"+"Apparel Material:"+apparelMaterial+"\t"+"Occasion:"+occasion+"\t"+
	"\t"+"Style:"+style+"\t"+"Color:"+color;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method running in Socks class");
		System.out.println(this);
		if(obj!=null && obj instanceof Socks)
		{
			Socks socks=(Socks)obj;
			System.out.println(socks);
			if(this.brand.equals(socks.brand) && this.apparelMaterial.equals(socks.apparelMaterial) && this.price==socks.price)
			{
				return true;
			}
		}
		return false;
		}

}
