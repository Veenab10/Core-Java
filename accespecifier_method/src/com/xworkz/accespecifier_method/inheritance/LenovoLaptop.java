package com.xworkz.accespecifier_method.inheritance;

public class LenovoLaptop extends Laptop {
	
	public void powerOff()
	{
		System.out.println("powerOff is in LenovoLaptop class");
	}
	
	public void powerOn()
	{
		System.out.println("powerOn is in LenovoLaptop class");
	}
	
	public void shutDown()
	{
		System.out.println("shutDown is in LenovoLaptop class");
	}
	@Override
	public void run()
	{
		System.out.println("run is in LenovoLaptop class");
		
	}
	
	@Override
	public void execute()
	{
		System.out.println("execute is in LenovoLaptop class");
	}
	
	@Override
	public void storage()
	{
		System.out.println("storage is in LenovoLaptop class");
	}

}
