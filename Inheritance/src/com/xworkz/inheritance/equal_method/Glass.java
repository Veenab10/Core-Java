package com.xworkz.inheritance.equal_method;

public class Glass {
	
	public Glass() {
		System.out.println("no paramete constructor of Glass");
	}
	public String brand;
	public int price;
	public String occasion;
	public String shape;
	public String materialType;
	public String style;
	
	@Override
	public String toString() {
		return "Glass=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Occasion:"+occasion+"\t"+"Shape:"+shape+"\t"+"Material Type:"+materialType+"\t"+"Style:"+style;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in Glass class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Glass)
		{
			Glass ref=(Glass)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.materialType.equals(ref.materialType))
			{
				
				return true;
			}
		}
		return false;
	}

}
