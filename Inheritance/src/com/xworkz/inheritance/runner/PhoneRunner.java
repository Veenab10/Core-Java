package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.single_inheritance.AndroidPhone;
import com.xworkz.inheritance.single_inheritance.CellPhone;
import com.xworkz.inheritance.single_inheritance.FlipPhone;
import com.xworkz.inheritance.single_inheritance.QwertyPhone;
import com.xworkz.inheritance.single_inheritance.SliderPhone;
import com.xworkz.inheritance.single_inheritance.SmartPhone;

public class PhoneRunner {
	
	public static void main(String[] args) {
		
		AndroidPhone androidPhone=new AndroidPhone();
		
		CellPhone cellPhone=new CellPhone();
		androidPhone.androidRunner(cellPhone);
		
		System.out.println("----------------------------------");
		
		CellPhone cellPhone2=new SmartPhone();
		androidPhone.androidRunner(cellPhone2);
		
		System.out.println("----------------------------------");
		
		CellPhone cellPhone3=new FlipPhone();
		androidPhone.androidRunner(cellPhone3);
		
		System.out.println("----------------------------------");
		
		CellPhone cellPhone4=new SliderPhone();
		androidPhone.androidRunner(cellPhone4);
		
		System.out.println("----------------------------------");
		
		CellPhone cellPhone5=new QwertyPhone();
		androidPhone.androidRunner(cellPhone5);
		

	}

}
