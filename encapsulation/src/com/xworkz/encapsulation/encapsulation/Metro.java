package com.xworkz.encapsulation.encapsulation;

public abstract class Metro {
	
	public String material;
	public int length;
	
	public Metro(String material, int length)
	{
		this.material=material;
		this.length=length;
				
	}
	
	abstract boolean build();

}


