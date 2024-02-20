package com.xowrkz.inheritance.encapsulation_runner;

import com.xworkz.inheritance.encapsulation.Box;

public class BoxRunner {

	public static void main(String[] args) {
		
		Box box=new Box();
		String res=box.getColor();
		System.out.println(res);
		
		box.setColor("Blue");
		String res1=box.getColor();
		System.out.println(res1);
		System.out.println("-----------------------------------------------");
		
		int res2=box.getHeight();
		System.out.println(res2);
		
		box.setHeight(20);
		int res3=box.getHeight();
		System.out.println(res3);
		System.out.println("-----------------------------------------------");
		
		int res4=box.getWidth();
		System.out.println(res4);
		
		box.setWidth(10);
		int res5=box.getWidth();
		System.out.println(res5);
		System.out.println("-----------------------------------------------");
	
		String res6=box.getShape();
		System.out.println(res6);
		
		box.setShape("Round");
		String res7=box.getShape();
		System.out.println(res7);
		System.out.println("-----------------------------------------------");
		
		String res8=box.getMaterial();
		System.out.println(res8);
		
		box.setMaterial("Carboard");
		String res9=box.getMaterial();
		System.out.println(res9);
		System.out.println("-----------------------------------------------");
		
		
		Box box2=new Box();
		box2.setColor("Blue");
		String result=box2.getColor();
		System.out.println(result);
		
		box2.setHeight(20);
		int result1=box2.getHeight();
		System.out.println(result1);
		
		box2.setWidth(10);
		int result2=box2.getWidth();
		System.out.println(result2);
		
		String result3=box2.getShape();
		System.out.println(result3);
		
		box2.setShape("Square");
		String result4=box2.getShape();
		System.out.println(result4);
		
		box2.setMaterial("Carboard");
		String result5=box2.getMaterial();
		System.out.println(result5);
		System.out.println("-----------------------------------------------");
		
		boolean bool=box.equals(box2);
		System.out.println(bool);
		
		

	}

}
