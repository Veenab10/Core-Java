package com.xxworkz.example_interface.runner;

import com.xworkz.example_interface.admin.Association;
import com.xworkz.example_interface.admin.User;
import com.xworkz.example_interface.rules.Freezer;
import com.xworkz.example_interface.rules.LgFreezer;
import com.xworkz.example_interface.rules.SamsungFreezer;
import com.xworkz.example_interface.rules.TeslaFreezerImpl;

public class FreezerRunner 
{
	
	public static void main(String[] args) {
		Freezer freezer=new TeslaFreezerImpl();
		
		LgFreezer lg=new TeslaFreezerImpl();
		
		Association a=new Association(lg);
		a.autoCool();
		a.temperatureControl();
		
		SamsungFreezer samsung=new TeslaFreezerImpl();
		
		User user=new User(samsung);
		user.autoCool();
		
	}

}
