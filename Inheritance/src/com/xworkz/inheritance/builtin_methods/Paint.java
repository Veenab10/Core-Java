package com.xworkz.inheritance.builtin_methods;

public class Paint {
	public Paint()
	{
		System.out.println("No prameter constructor of paint");
		
	}
	public String surfaceRecommendation;
	public String itemForm;
	public int size;
	
	public Paint(String surfaceRecommendation,String itemForm,int size)
	{
		this.surfaceRecommendation=surfaceRecommendation;
		this.itemForm=itemForm;
		this.size=size;
	}
	@Override
	public String toString() {
		System.out.println("tostring runing in Paint");
		
		return "Paint:"+"\n"+"surface Recommendation:"+surfaceRecommendation+"\n"+"Item Form:"+itemForm+"\n"+"Size:"+size;
	}
	
	

}
