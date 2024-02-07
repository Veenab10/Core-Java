package com.xworkz.accespecifier_method.RunnerClass;

import com.xworkz.accespecifier_method.inheritance.HandWash;
import com.xworkz.accespecifier_method.inheritance.Lux;
import com.xworkz.accespecifier_method.inheritance.Road;
import com.xworkz.accespecifier_method.inheritance.Sanitizer;
import com.xworkz.accespecifier_method.inheritance.Soap;


public class RoadRunner {

	public static void main(String[] args) {
		
		Road road=new Road();
		HandWash handWash=new HandWash();
		road.runHandWash(handWash);
		
		HandWash handWash1=new Sanitizer();
		road.runHandWash(handWash1);
		
		HandWash handWash2=new Soap();
		road.runHandWash(handWash2);
		
		HandWash handWash3=new Lux();
		road.runHandWash(handWash3);
				
		
	}

}
