package com.xworkz.inheritance.encapsulation;

public class Pot {
	
	private String brand;
	private int price;
	private int height;
	private int width;
	private int depth;
	
	@Override
	public String toString() {
	return "Pot=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Height:"+height+"\t"+"Width:"+width+"\t"+"Depth:"+depth;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof Pot)
		{
			Pot pot=(Pot)obj;
			System.out.println(pot);
			if(this.brand.equals(pot.brand) || this.price==pot.price || this.height==pot.height)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	
	public int getPrice()
	{
		return this.price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	public void setHeight(int height)
	{
		this.height=height;
				
	}
	
	public int getWidth()
	{
		return this.width;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	
	public int getDepth()
	{
		return this.depth;
	}
	public void setDepth(int depth)
	{
		this.depth=depth;
	}

		
}


