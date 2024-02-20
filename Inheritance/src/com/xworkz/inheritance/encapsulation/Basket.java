package com.xworkz.inheritance.encapsulation;

public class Basket {
	
	private String brandName;
	private int price;
	private String style;
	private String shape;
	private String color;
	
	@Override
	public String toString() {
	return "Basket=BrandName:"+brandName+"\t"+"Price:"+price+"\t"+"Style:"+style+"\t"+"Shape:"+shape+"\t"+"Color:"+color;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof Basket)
		{
			Basket basket=(Basket)obj;
			System.out.println(basket);
			if(this.brandName.equals(basket.brandName) && this.price==basket.price && this.color.equals(basket.color))
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
	
	public String getStyle()
	{
		return this.style;
	}
	public void setStyle(String style)
	{
		this.style=style;
	}
	public String getShape()
	{
		return this.shape;
	}
	public void setShape(String shape)
	{
		this.shape=shape;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}

}
