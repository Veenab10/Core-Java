package com.xworkz.inheritance.encapsulation;

public class NailPolish {
	
	String brandName;
	int price;
	String color;
	String type;
	String material;
	
	@Override
	public String toString() {
	return "NailPolish=BrandName:"+brandName+"\t"+"Price:"+price+"\t"+"Color:"+color+"\t"+"Type:"+type+"\t"+"Material:"+material;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof NailPolish)
		{
			NailPolish nailPolish=(NailPolish)obj;
			System.out.println(nailPolish);
			if(this.brandName.equals(nailPolish.brandName) || this.price==nailPolish.price && this.material.equals(nailPolish.material))
			{
				return true;
			}
		}
		return false;
		}
	
	public String getBrandName()
	{
		return this.brandName;
	}
	
	public void setBrandName(String brandName)
	{
		this.brandName=brandName;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public  String getType()
	{
		return this.type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	
	public String getMaterial()
	{
		return this.material;
	}
		
	public void setMaterial(String material)
	{
		this.material=material;
	}
	
}
