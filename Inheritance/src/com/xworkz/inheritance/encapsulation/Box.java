package com.xworkz.inheritance.encapsulation;

public class Box {
	
	String color;
	int height;
	int width;
	String shape;
	String material;
	
	@Override
	public String toString() {
		return "Box=Color:"+color+"\t"+"Height:"+height+"\t"+"Width:"+width+"\t"+"Shape:"+shape+"\t"+"Material:"+material;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof Box)
		{
			Box box=(Box)obj;
			System.out.println(box);
			if(this.color.equals(box.color) && this.height==box.height && this.width==box.width && this.material.equals(box.material))
			{
				return true;
			}
		}
		return false;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
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
	
	public String getShape()
	{
		return this.shape;
	}
	
	public void setShape(String shape)
	{
		this.shape=shape;
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
