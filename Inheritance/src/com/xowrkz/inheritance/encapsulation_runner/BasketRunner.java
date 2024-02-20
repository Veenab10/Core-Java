package com.xowrkz.inheritance.encapsulation_runner;

import com.xworkz.inheritance.encapsulation.Basket;

public class BasketRunner {
	
	public static void main(String[] args) {
		
		Basket basket=new Basket();
		String res=basket.getBrandName();
		System.out.println(res);
		
		basket.setBrandName("HomeStrap");
		String res1=basket.getBrandName();
		System.out.println(res1);
		System.out.println("--------------------------------------------");
		
		int res3=basket.getPrice();
		System.out.println(res3);
		
		basket.setPrice(100);
		int res4=basket.getPrice();
		System.out.println(res4);
		System.out.println("--------------------------------------------");
		
		String res5=basket.getStyle();
		System.out.println(res5);
		
		basket.setStyle("Luxury");
		String res6=basket.getStyle();
		System.out.println(res6);
		System.out.println("--------------------------------------------");
		
		String res7=basket.getShape();
		System.out.println(res7);
		
		basket.setShape("Oval");
		String res8=basket.getShape();
		System.out.println(res8);
		System.out.println("--------------------------------------------");		
		 
		String res9=basket.getColor();
		System.out.println(res9);
		
		basket.setColor("Orange");
		String res2=basket.getColor();
		System.out.println(res2);
		System.out.println("--------------------------------------------");
		
		//2nd instance
		
		Basket basket2=new Basket();
		basket2.setBrandName("Nayasa");
		String ans=basket2.getBrandName();
		System.out.println(ans);
		
		basket2.setColor("White");
		String ans1=basket2.getColor();
		System.out.println(ans1);
		
		basket2.setPrice(200);
		int ans2=basket2.getPrice();
		System.out.println(ans2);
		
		basket2.setShape("Boat");
		String ans3=basket2.getShape();
		System.out.println(ans3);
		
		basket2.setStyle("Modern");
		String ans4=basket2.getStyle();
		System.out.println(ans4);
		
		boolean bool=basket.equals(basket2);
		System.out.println(bool);
		
		
	}

}
