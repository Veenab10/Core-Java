package com.xworkz.inheritance.builtin_methods;

public class SwitchBoard {
	
	public SwitchBoard()
	{
		System.out.println("No parameter constructor Switch Board");
	}
	
	public String brand;
	public int price;
	public String madeIn;
	
	public SwitchBoard(String brand,int price,String madeIn)
	{
		this.brand=brand;
		this.price=price;
		this.madeIn=madeIn;
	}
	@Override
	public String toString() {
		
		System.out.print( "SwitchBoard:"+"\n"+"Brand:"+brand+"\n"+"price:"+price+"\n"+"madeIN:"+madeIn);
		return super.toString();
	}

}
