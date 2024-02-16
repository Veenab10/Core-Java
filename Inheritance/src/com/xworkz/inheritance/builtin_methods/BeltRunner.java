package com.xworkz.inheritance.builtin_methods;

public class BeltRunner {
	public static void main(String[] args) {
		
		Belt belt=new Belt();
		belt.length=10;
		belt.material="Leather";
		belt.type="Buckle";
		belt.price=100;
		
		Belt belt1=new Belt();
		belt1.length=10;
		belt1.material="Leather";
		belt1.type="Buckle";
		belt1.price=100;
		
		boolean output=belt.equals(belt1);
		System.out.println(output);
		

	}

}
