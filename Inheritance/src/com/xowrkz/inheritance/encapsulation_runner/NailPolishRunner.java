package com.xowrkz.inheritance.encapsulation_runner;

import com.xworkz.inheritance.encapsulation.NailPolish;

public class NailPolishRunner {
	
	public static void main(String[] args) {
		
		NailPolish nailPolish=new NailPolish();
		String res=nailPolish.getColor();
		System.out.println(res);
		
		nailPolish.setColor("Pink");
		String res1=nailPolish.getColor();
		System.out.println(res1);
		System.out.println("-----------------------------------------------");
		
		String res2=nailPolish.getBrandName();
		System.out.println(res2);
		
		nailPolish.setBrandName("LAKMÉ");
		String res3=nailPolish.getBrandName();
		System.out.println(res3);
		System.out.println("-----------------------------------------------");
		
		int res4=nailPolish.getPrice();
		System.out.println(res4);
		
		nailPolish.setPrice(100);
		int res5=nailPolish.getPrice();
		System.out.println(res5);
		System.out.println("-----------------------------------------------");
		
		String res6=nailPolish.getType();
		System.out.println(res6);
		
		nailPolish.setType("Liquid");
		String res7=nailPolish.getType();
		System.out.println(res7);
		System.out.println("-----------------------------------------------");
		
		String res8=nailPolish.getMaterial();
		System.out.println(res8);
		
		nailPolish.setMaterial("Organic");
		String res9=nailPolish.getMaterial();
		System.out.println(res9);
		System.out.println("-----------------------------------------------");
		
		// 2nd instance
		
		NailPolish nailPolish2=new NailPolish();
		nailPolish2.setBrandName("MyGlamm");
		String ans=nailPolish2.getBrandName();
		System.out.println(ans);
		
		nailPolish2.setColor("Purple");
		String ans2=nailPolish2.getColor();
		System.out.println(ans2);
		
		nailPolish2.setMaterial("Organic");
		String ans3=nailPolish2.getMaterial();
		System.out.println(ans3);
		
		nailPolish2.setPrice(100);
		int ans4=nailPolish2.getPrice();
		System.out.println(ans4);
		
		nailPolish2.setType("Gel");
		String ans5=nailPolish2.getType();
		System.out.println(ans5);
		System.out.println("-----------------------------------------------");
		
		boolean bool=nailPolish.equals(nailPolish2);
		System.out.println(bool);
		
		
		
		
		
		
	}

}
