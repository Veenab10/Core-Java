package com.xworkz.encapsulation.encapsulation;

public class Prime {

	public static void main(String[] args) {
		int num=11;
		int count=0;
		
		if(num%1!=0)
		{
		  if(num%2!=0)
		{
			count++;
		}
		}
		
		
		if(count==2)
		{
			System.out.println("It is Prime Number");
		}
		else
			System.out.println("It is not  Prime Number");

	}

}
