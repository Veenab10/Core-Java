package com.xworkz.example_interface.admin;

import com.xworkz.example_interface.rules.TempleRules;

public class Poojari {
	
	private TempleRules templeRules;
	
	public Poojari(TempleRules templeRules) {
		this.templeRules=templeRules;
		
	}
	
	public void openTime() {
		if (templeRules != null) {

			double time1 = templeRules.openTime();
			System.out.println("Open Time:" + time1);

		} 
		else {
			System.out.println("no");
		}
		
	}
	public void closeTime()
	{
		if(templeRules!=null)
		{
			double time2=templeRules.closeTime();
			System.out.println("Close time:"+time2);
		}
	}
	public void specialEntry()
	{
		if(templeRules!=null) {
		double st=templeRules.specialEntry();
		System.out.println("Special Entry:"+st);
		}
	}
}
		
	


