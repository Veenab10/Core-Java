package com.xowrkz.inheritance.encapsulation_runner;

import com.xworkz.inheritance.encapsulation.Cock;

public class CockRunner {

	public static void main(String[] args) {
		Cock cock=new Cock();
		String res=cock.getBrand();
		System.out.println(res);
		
		cock.setBrand("YONEX");
		String res1=cock.getBrand();
		System.out.println(res1);
		System.out.println("---------------------------");
		
		String res2=cock.getColor();
		System.out.println(res2);
		
		cock.setColor("Green");
		String res3=cock.getColor();
		System.out.println(res3);
		System.out.println("---------------------------");
		
		String res4=cock.getMaterialType();
		System.out.println(res4);
		
		cock.setMaterialType("Nylon");
		String res5=cock.getMaterialType();
		System.out.println(res5);
		System.out.println("---------------------------");
		
		int res6=cock.getPrice();
		System.out.println(res6);
		
		cock.setPrice(400);
		int res7=cock.getPrice();
		System.out.println(res7);
		System.out.println("---------------------------");
		
		String res8=cock.getMadeIn();
		System.out.println(res8);
		
		cock.setMadeIn("India");
		String res9=cock.getMadeIn();
		System.out.println(res9);
		System.out.println("---------------------------");
		
		Cock cock2=new Cock();
		cock2.setBrand("IMTION");
		String ans=cock2.getBrand();
		System.out.println(ans);
		
		cock2.setColor("White");
		String ans1=cock2.getColor();
		System.out.println(ans1);
		
		cock2.setMaterialType("Feather");
		String ans2=cock2.getMaterialType();
		System.out.println(ans2);
		
		cock2.setPrice(400);
		int ans3=cock2.getPrice();
		System.out.println(ans3);
		
		cock2.setMadeIn("India");
		String ans4=cock2.getMadeIn();
		System.out.println(ans4);
		
		boolean bool=cock.equals(cock2);
		System.out.println(bool);
		

	}

}
