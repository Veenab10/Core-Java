package com.xworkz.example_interface.rules;

public class KrishanaTempleRulesImpl implements TempleRules {

	@Override
	public double openTime() {
	System.out.println("Temple opining timing");
	double time=7.45;
		return time;
	}

	@Override
	public double closeTime() {
		System.out.println("Temple close timimg");
		double time =9.45;
		return time;
	}

	@Override
	public double specialEntry() {
		System.out.println("Temple Special Entry price");
		double special=200;
		return special;
	}
	

}
