package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ColorRunner {
	public static void main(String[] args) {
		Collection<String> color=new LinkedList<String>();
		color.add("Blue");
		color.add("Pink");
		color.add("Green");
		color.add("Red");
		color.add("Yellow");
		color.add("White");
		color.add("Gray");
		color.add("Black");
		color.add("Orange");
		color.add("Brown");
		
		System.out.println("Number of Colors:"+color.size());
		
		for (String clr : color) {
			System.out.println(clr);
					
		}
		System.out.println("----------------------------------");
			
		Collection<String> president=new ArrayList<String>();
		president.add("Shri Ram Nath Kovind");
		president.add("Shri Pranab Mukherjee");
		president.add("Smt Pratibha Devisingh");
		president.add("Dr.A.P.J.Abdul Kalam");
		president.add("Dr Shankar Dayal Sharma");
		president.add("Shri R Venkataraman");
		president.add("Giani Zail Singh");
		president.add("Shri Neelam Sanjiva Reddy");
		president.add("Dr.Fakhruddin Aliahmed");
		president.add("Shri Varahagiri venkata Giri");
		president.add("Dr.Zakir Husain");
		president.add("Dr. Sarvepalli Radhakrishnan");
		
		System.out.println("Number of Presidents:"+president.size());
		
		for (String pr : president) {
			System.out.println(pr);
			
		}
		System.out.println("-------------------------------------");
		
		Collection<String> address=new ArrayList<String>();
		address.add("BTM");
		address.add("MicoLayout");
		address.add("RR Nagar");
		address.add("Kormangala");
		address.add("Banashankari");
		address.add("JayNagar");
		address.add("J P Nagra");
		address.add("Water Tank");
		address.add("BTM 2nd Stage");
		address.add("BTM 1st Stage");
		
		
		System.out.println("Number of Address:"+address.size());
		
		for (String location : address) {
			System.out.println(location);
			
		}
			
		}
		
	}
	


