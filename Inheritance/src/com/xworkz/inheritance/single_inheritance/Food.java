package com.xworkz.inheritance.single_inheritance;

public class Food {
	
	public Food()
	{
		System.out.println("no parameter constructor of Food");
	}
	
	public void foodMaking(Vegetable vegetable)
	{
		System.out.println(vegetable.name);
		vegetable.giveEnergy();
		
		if(vegetable instanceof Tomato)
		{
			Tomato tomato=(Tomato)vegetable;
			System.out.println(tomato.family);
			tomato.preventCancer();
		}
		if(vegetable instanceof Radish)
		{
			Radish radish=(Radish)vegetable;
			System.out.println(radish.flavor);
			radish.balancedDiet();
		}
		if(vegetable instanceof Carrot)
		{
			Carrot carrot=(Carrot)vegetable;
			System.out.println(carrot.sciencitificName);
			carrot.improveVisin();
		}
		if(vegetable instanceof BeetRoot)
		{
			BeetRoot beetRoot=(BeetRoot)vegetable;
			System.out.println(beetRoot.fiber);
			beetRoot.increaseBloodFlow();
		}
	}
	

}
