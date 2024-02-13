package com.xworkz.inheritance.single_inheritance;

public class Play {
	
	public Play()
	{
		System.out.println("no parameter constructor of Play");
	}
	
	public void playRunner(Object object)
	{
		if(object instanceof Shoe)
		{
			Shoe shoe=(Shoe)object;
			System.out.println(shoe.closureType);
			shoe.footProtection();
		}
		if(object instanceof OutdoorShoe)
		{
			OutdoorShoe outdoorShoe=(OutdoorShoe)object;
			System.out.println(outdoorShoe.waterproof);
			outdoorShoe.hiking();
		}
	}
	public void playRunner(Shoe shoe)
	{
		System.out.println(shoe.closureType);
		shoe.footProtection();
		
		if(shoe instanceof OutdoorShoe)
		{
			OutdoorShoe outdoorShoe=(OutdoorShoe)shoe;
			System.out.println(outdoorShoe.waterproof);
			outdoorShoe.hiking();
			
		}
			
	}
	public void playRunner(OutdoorShoe outdoorShoe)
	{
		System.out.println(outdoorShoe.waterproof);
		outdoorShoe.hiking();
	}
	
}
