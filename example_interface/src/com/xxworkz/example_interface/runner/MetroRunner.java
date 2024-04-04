package com.xxworkz.example_interface.runner;

import com.xworkz.example_interface.admin.MetroAdmin;
import com.xworkz.example_interface.rules.BanashankariMetroRulesImpl;
import com.xworkz.example_interface.rules.MetroRules;

public class MetroRunner {
	
	public static void main(String[] args) {
		MetroRules metro=new BanashankariMetroRulesImpl();
		//metro.buyTicket();// here we get 13 methods
		metro.getLine();
		
		/*
		 * BanashankariMetroRulesImpl metro1=new BanashankariMetroRulesImpl();
		 * metro1.accessLuagagge();// here we get 13 methods
		 * 
		 * Object metro3=new BanashankariMetroRulesImpl(); metro3.getClass(); //here we
		 * get 9 methods
		 */		
		
		MetroAdmin metro4=new MetroAdmin(metro);
		metro4.MetroAdmin();
		
		//BanashankariMetroRulesImpl ref=new MetroAdmin(metro);
		
		
	}
	
	



	
	}
