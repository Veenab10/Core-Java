package com.xworkz.abstraction;

public abstract class Bag {
	
	public String brand;
	public String material;
	public int price;
	
	public abstract void storage();
	
	public Bag(String brand, String material) {
		
		this.brand=brand;
		this.material=material;
		
	}
	public Bag(int price)
	{
		this.price=price;
	}
	
	

}
