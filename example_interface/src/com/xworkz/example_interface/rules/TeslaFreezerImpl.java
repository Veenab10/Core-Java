package com.xworkz.example_interface.rules;

public class TeslaFreezerImpl implements TeslaFreezer {

	@Override
	public void authoCool() {
		System.out.println("autocool method running in teslafreezerimpl");
		
	}

	@Override
	public void temperatureControl() {
		System.out.println("running temperaturecontrol method..");
		
	}

}
