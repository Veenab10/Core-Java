package com.xworkz.accespecifier_method.inheritance;

public class AirPillow  extends Pillow{
	
	public AirPillow()
	{
		super();
		System.out.println("no parameter constructor in airpillow");
		
	}

	public String fillMaterial;
	
	public void adjustable()
	{
		System.out.println("adjustable runing in airpillow ");
	}

}
