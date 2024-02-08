package com.xworkz.accespecifier_method.inheritance;

public class MicroFiberPillow  extends Pillow{
	
	public MicroFiberPillow()
	{
		//super();
		System.out.println("no paramter constructor of microfiberpillow");
	}
	
	public String  brandName;
	
	public void clean()
	{
		System.out.println("clean runing  in microfiberpillow");
	}
	
	@Override
	public void support()
	{
		System.out.println("support running in micro..");
	}
}
