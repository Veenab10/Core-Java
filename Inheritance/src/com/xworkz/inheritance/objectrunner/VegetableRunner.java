package com.xworkz.inheritance.objectrunner;

import com.xworkz.inheritance.object.BeetRoot;
import com.xworkz.inheritance.object.BitterGourd;
import com.xworkz.inheritance.object.Brinjal;
import com.xworkz.inheritance.object.Capsicum;
import com.xworkz.inheritance.object.Carrot;
import com.xworkz.inheritance.object.Chilli;
import com.xworkz.inheritance.object.Coriander;
import com.xworkz.inheritance.object.Food;
import com.xworkz.inheritance.object.Ginger;
import com.xworkz.inheritance.object.GreenBean;
import com.xworkz.inheritance.object.Onion;
import com.xworkz.inheritance.object.Radish;
import com.xworkz.inheritance.object.Tomato;
import com.xworkz.inheritance.object.Vegetable;

public class VegetableRunner {
	 
	public static void main(String[] args) {
		
		Food food=new Food();
	
		Object obj1=new Vegetable();
		food.foodRunner(obj1);
		
		System.out.println("-------------------------------------");
		
		Object obj2=new Tomato();
		food.foodRunner(obj2);
		
		System.out.println("-------------------------------------");
		
		Object obj3=new Radish();
		food.foodRunner(obj3);
		
		System.out.println("-------------------------------------");

		Object obj4=new Onion();
		food.foodRunner(obj4);
		
		System.out.println("-------------------------------------");
		
		Object obj5=new GreenBean();
		food.foodRunner(obj5);
		
		System.out.println("-------------------------------------");
		
		Object obj6=new Ginger();
		food.foodRunner(obj6);
		
		System.out.println("-------------------------------------");
		
		Object obj7=new Coriander();
		food.foodRunner(obj7);
		
		System.out.println("-------------------------------------");
		
		Object obj8=new Chilli();
		food.foodRunner(obj8);
		
		System.out.println("-------------------------------------");
		
		Object obj9=new Carrot();
		food.foodRunner(obj9);
		
		System.out.println("-------------------------------------");
		
		Object obj10=new Capsicum();
		food.foodRunner(obj10);
		
		System.out.println("-------------------------------------");

		Object obj11=new Brinjal();
		food.foodRunner(obj11);
		
		System.out.println("-------------------------------------");
		
		Object obj12=new BitterGourd();
		food.foodRunner(obj12);
		
		System.out.println("-------------------------------------");
		
		Object obj13=new BeetRoot();
		food.foodRunner(obj13);

		}
}
