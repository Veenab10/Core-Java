package com.xworkz.functional_interface.runner;

import com.xworkz.functional_interface.interface_classes.Festival;

public class FestivalCheck {
	
	private Festival festival;
	
	public FestivalCheck(Festival festival) {
		this.festival=festival;
		
	}
	
	public void check()
	{
		System.out.println("check method running in festival check");
		boolean value=this.festival.prepare("Dress", "Sweet");
		if(value)
		{
			System.out.println("Prepared");
		}
		else
			System.out.println("not prepared");
	}

}
