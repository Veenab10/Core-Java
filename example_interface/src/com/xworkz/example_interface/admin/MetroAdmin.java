package com.xworkz.example_interface.admin;

import com.xworkz.example_interface.rules.MetroRules;

public class MetroAdmin {
	
	private MetroRules metroRules;
	
	public MetroAdmin(MetroRules metroRules) {
		this.metroRules=metroRules;
		
	}
	public void MetroAdmin() {
		if(metroRules!=null)
		{
			if(metroRules.accessLuagagge() && metroRules.cleaniness())
			{
				System.out.println("metro rules are good");
			}
			else {
				System.err.println("metro rules are bad");
			}
			if(metroRules.buyTicket()>=100)
			{
				System.out.println("valid metro ticket");
			}
			else {
				System.out.println("invalid metro ticket");
			}
			if(metroRules.getLine().equals("green"))
			{
				System.out.println("green line");
			}
			
		}
		
	}

}
