package com.xworkz.accespecifier_method.inheritance;

public class CanonPrinter extends Printer {
	
	public void connectToWifi() 
	{
		System.out.println("connectToWifi in cannonprinter class");
		
	}
	
	@Override
	public void print()
	{
		System.out.println("print is in CanonPrinter class");
	}
	
	@Override
	public void scan()
	{
		System.out.println("scan is in canonprinter class");
	}
	
	@Override
	public void copy()
	{
		System.out.println("copy is canonprinter class");
	}

}
