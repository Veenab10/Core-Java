package com.xworkz.inheritance.builtin_methods;

public class Battery {
	
	public Battery()
	{
		System.out.println("No parameter constructor of Battery");
	}
	
	public int weight=161;
	public String batteryCell="Alkaline";
	public float voltage=1.6f;
	
	@Override
	public String toString() {
		
		return "Battery:"+"\n"+"Weight:"+weight+"\n"+"Battery Cell:"+batteryCell+"\n"+"Voltage:"+voltage;
	}
	

}
