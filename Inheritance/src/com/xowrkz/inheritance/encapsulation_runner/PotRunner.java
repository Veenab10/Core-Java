package com.xowrkz.inheritance.encapsulation_runner;

import com.xworkz.inheritance.encapsulation.Pot;

public class PotRunner {
	
	public static void main(String[] args) {
		
		Pot pot=new Pot();
		String res=pot.getBrand();
		System.out.println(res);
		
		pot.setBrand("Leafy Tales");
		String res1=pot.getBrand();
		System.out.println(res1);
		System.out.println("---------------------------------");
		
		int res3=pot.getHeight();
		System.out.println(res3);
		
		pot.setHeight(200);
		int res4=pot.getHeight();
		System.out.println(res4);
		System.out.println("---------------------------------");
		
		int res5=pot.getWidth();
		System.out.println(res5);
		
		pot.setWidth(100);
		int res6=pot.getWidth();
		System.out.println(res6);
		System.out.println("---------------------------------");
		
		int res7=pot.getDepth();
		System.out.println(res7);
		
		pot.setDepth(300);
		int res8=pot.getDepth();
		System.out.println(res8);
		System.out.println("---------------------------------");
		
		int res9=pot.getPrice();
		System.out.println(res9);
		
		pot.setPrice(350);
		int res2=pot.getPrice();
		System.out.println(res2);
		System.out.println("---------------------------------");
		
		//2nd instance
		Pot pot2=new Pot();
		pot2.setBrand("Leafy Tales");
		String ans=pot2.getBrand();
		System.out.println(ans);
		
		pot2.setPrice(450);
		int ans1=pot2.getPrice();
		System.out.println(ans1);
		
		pot2.setHeight(80);
		int ans2=pot2.getHeight();
		System.out.println(ans2);
		
		pot2.setWidth(40);
		int ans4=pot2.getWidth();
		System.out.println(ans4);
		
		pot2.setDepth(30);
		int ans5=pot2.getDepth();
		System.out.println(ans5);
		
		boolean bool=pot.equals(pot2);
		System.out.println(bool);
		
		
		
		
		
	}

}
