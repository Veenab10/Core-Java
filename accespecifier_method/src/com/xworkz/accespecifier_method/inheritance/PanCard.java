package com.xworkz.accespecifier_method.inheritance;

public class PanCard   {
	
	public void taxation(Card card)
	{
		card.cardName="ATM card";
		System.out.println(card.cardName);
		card.print();
		
		if(card instanceof AtmCard)
		{
			AtmCard atmCard=(AtmCard)card;
			atmCard.atmNumber=45678910;
			System.out.println(atmCard.atmNumber);
			atmCard.withDraw();
		}
		if(card instanceof AadhaarCard)
		{
			AadhaarCard aadhaarCard=(AadhaarCard)card;
			aadhaarCard.issueDate="sep2022";
			System.out.println(aadhaarCard.issueDate);
			aadhaarCard.indentification();
		}
		
	}

}
