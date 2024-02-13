package com.xworkz.inheritance.runner;



import com.xworkz.inheritance.single_inheritance.BeetRoot;
import com.xworkz.inheritance.single_inheritance.Carrot;
import com.xworkz.inheritance.single_inheritance.Food;
import com.xworkz.inheritance.single_inheritance.Radish;
import com.xworkz.inheritance.single_inheritance.Tomato;
import com.xworkz.inheritance.single_inheritance.Vegetable;

public class FoodRunner {
	
	public static void main(String[] args) {
		
		Food food=new Food();
		
		
		Vegetable vegetable=new Vegetable();
		food.foodMaking(vegetable);
		
		System.out.println("---------------------------------------");
		
		Vegetable vegetable2=new Tomato();
		food.foodMaking(vegetable2);
		
		System.out.println("---------------------------------------");
		
		Vegetable vegetable3=new Carrot();
		food.foodMaking(vegetable3);
		
		System.out.println("---------------------------------------");
		
		Vegetable vegetable4=new BeetRoot();
		food.foodMaking(vegetable4);
		
		System.out.println("---------------------------------------");
		
		Vegetable vegetable5=new Radish();
		food.foodMaking(vegetable5);
	}

	
	
	

}
