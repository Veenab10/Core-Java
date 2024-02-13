package com.xworkz.inheritance.builtin_methods;

public class Ring {
	
	public Ring()
	{
		System.out.println("No parameter constructor of Ring");
	}
	
	public String jewelleryType;//Gold
	public String platedMetalType;
	public String stoneShape;
	
	public Ring(String jewelleryType,String platedMetalType,String stoneShape)
	{
		this.jewelleryType=jewelleryType;
		this.platedMetalType=platedMetalType;
		this.stoneShape=stoneShape;
	}
	public void wear()
	{
		System.out.println("Wear runing in Ring");
		 toString();
		
	}
	@Override
	public String toString() {
		System.out.println("toString running in Ring..");
		System.out.print("Ring:"+"\n"+"jewelleryType:"+jewelleryType+ "\n"+"platedMetalType:"+platedMetalType+ "\n"+"stoneShape:"+stoneShape);
		return super.toString();
	
}

}
