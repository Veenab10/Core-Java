package com.xworkz.accespecifier_method.inheritance;

public class AtmCard extends Card {
	
	public AtmCard()
	{
		System.out.println("no paramter constructor of AtmCard");
	}
	
	public int atmNumber;
	
	public void withDraw()
	{
		System.out.println("withdraw runing in atm..");
	}

}
