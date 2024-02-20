package com.xworkz.inheritance.encapsulation;

public class Cock {
	
	private String brand;
	private int price;
	private String materialType;
	private String color;
	private String madeIn;
	
	@Override
	public String toString() {
		return "Cock=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Material Type:"+materialType+"\t"+"Color:"+color+"\t"+"MadeIn:"+madeIn;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof Cock)
		{
			Cock cock=(Cock)obj;
			System.out.println(cock);
			if(this.brand.equals(cock.brand) || this.price==cock.price || this.color.equals(cock.color))
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
	
	
	public String getMaterialType()
	{
		return this.materialType;
	}
	public void setMaterialType(String materialType)
	{
		this.materialType=materialType;
	}
	
	
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getMadeIn()
	{
		return this.madeIn;
	}
	public void setMadeIn(String madeIn)
	{
		this.madeIn=madeIn;
	}
	
	

}
