package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.single_inheritance.OutdoorShoe;
import com.xworkz.inheritance.single_inheritance.Play;
import com.xworkz.inheritance.single_inheritance.Shoe;

public class Runner2 {
	
	public static void main(String[] args) {
		
		Play play=new Play();
		Object obj=new Shoe();
		play.playRunner(obj);
		
		System.out.println("-------------------------");
		
		
		Shoe shoe=new Shoe();
		play.playRunner(shoe);
		
		System.out.println("-------------------------");
		
		Shoe shoe1=new OutdoorShoe();
		play.playRunner(shoe1);
		
		System.out.println("-------------------------");
		
		OutdoorShoe outdoorShoe=new OutdoorShoe();
		play.playRunner(outdoorShoe);
		
		
		
		
	}

}
