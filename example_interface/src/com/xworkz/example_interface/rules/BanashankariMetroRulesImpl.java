package com.xworkz.example_interface.rules;

public class BanashankariMetroRulesImpl implements MetroRules {

	@Override
	public int buyTicket() {
		System.out.println("buyticket running...");
		return 100;
	}

	@Override
	public boolean accessLuagagge() {
	System.out.println("accessluagagge running...");
		return true;
	}

	@Override
	public boolean cleaniness() {
		System.out.println("cleanniness running...");
		return true;
	}

	@Override
	public String getLine() {
		System.out.println("getline running...");
		return MetroRules.GREEN_LINE;
	}
	

}
