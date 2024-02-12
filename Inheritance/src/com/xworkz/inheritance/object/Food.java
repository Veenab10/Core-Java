package com.xworkz.inheritance.object;

public class Food {
	
	public Food()
	{
		System.out.println("No parameter constructor of Food");
	}
		
		public void foodRunner(Object obj)
		{
			//Object obj=new Object();
			if(obj instanceof Vegetable)
			{
				Vegetable vegetable=(Vegetable)obj;
				System.out.println(vegetable.name);
				vegetable.giveEnergy();
				
			}
			if(obj instanceof Tomato)
			{
				Tomato tomato=(Tomato)obj;
				System.out.println(tomato.family);
				tomato.preventCancer();
			}
			if(obj instanceof Radish)
			{
				Radish radish=(Radish)obj;
				System.out.println(radish.flavor);
				radish.balancedDiet();
				
			}
			if(obj instanceof Onion)
			{
				Onion onion=(Onion)obj;
				System.out.println(onion.genus);
				onion.protectsSkinInfections();
			}
			if(obj instanceof GreenBean)
			{
				GreenBean greenBean=(GreenBean)obj;
				System.out.println(greenBean.seasonality);
				greenBean.roastingFlavor();
			}
			if(obj instanceof Ginger)
			{
				Ginger ginger=(Ginger)obj;
				System.out.println(ginger.calories);
				ginger.oxidativeStress();
			}
			if(obj instanceof Coriander)
			{
				Coriander coriander=(Coriander)obj;
				System.out.println(coriander.vitamin);
				coriander.controlsSpasmodicPain();
			}
			if(obj instanceof Chilli)
			{
				Chilli chilli=(Chilli)obj;
				System.out.println(chilli.type);
				chilli.reducesCholesterolLevel();
			}
			if(obj instanceof Carrot)
			{
				Carrot carrot=(Carrot)obj;
				System.out.println(carrot.sciencitificName);
				carrot.improveVisin();
				
			}
			if(obj instanceof Capsicum)
			{
				Capsicum capsicum=(Capsicum)obj;
				System.out.println(capsicum.color);
				capsicum.protectAgainstOxidativeStress();
			}
			if(obj instanceof Brinjal)
			{
				Brinjal brinjal=(Brinjal)obj;
				System.out.println(brinjal.carbohydrate);
				brinjal.enhanceMemory();
			}
			if(obj instanceof BitterGourd)
			{
				BitterGourd bitterGourd=(BitterGourd)obj;
				System.out.println(bitterGourd.Protein);
				bitterGourd.controlBloodSugarLevels();
			}
			if(obj instanceof BeetRoot)
			{
				BeetRoot beetRoot=(BeetRoot)obj;
				System.out.println(beetRoot.fiber);
				beetRoot.increaseBloodFlow();
			}
		}
	}
	
	


