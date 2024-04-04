package com.xxworkz.example_interface.runner;

import com.xworkz.example_interface.admin.Poojari;
import com.xworkz.example_interface.rules.KrishanaTempleRulesImpl;
import com.xworkz.example_interface.rules.TempleRules;

public class TempleRunner {

	public static void main(String[] args) {
		TempleRules temple = new KrishanaTempleRulesImpl();

		Poojari p = new Poojari(temple);
		p.openTime();
		p.closeTime();
		p.specialEntry();
		
		
	}

}
