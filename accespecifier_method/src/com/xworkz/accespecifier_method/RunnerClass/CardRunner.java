package com.xworkz.accespecifier_method.RunnerClass;

import com.xworkz.accespecifier_method.inheritance.AadhaarCard;
import com.xworkz.accespecifier_method.inheritance.AtmCard;
import com.xworkz.accespecifier_method.inheritance.Card;
import com.xworkz.accespecifier_method.inheritance.PanCard;

public class CardRunner {

	public static void main(String[] args) {
		
		PanCard panCard=new PanCard();
		
		
		Card card1=new Card();
		panCard.taxation(card1);
		
		System.out.println("-----------------------------");
		
//		AtmCard atmCard=new AtmCard();
//		panCard.taxation(atmCard);
		
		Card card2=new AtmCard();
		panCard.taxation(card2);
		
				
		System.out.println("-----------------------------");
		
//		AadhaarCard aadhaarCard=new AadhaarCard();
//		panCard.taxation(aadhaarCard);
		
		Card card3=new AadhaarCard();
		panCard.taxation(card3);
	}
}
