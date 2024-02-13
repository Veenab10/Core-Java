package com.xworkz.inheritance.single_inheritance;

public class AndroidPhone {
	
	public AndroidPhone()
	{
		System.out.println("No parameter constructor of Android Phone");
	}
	
	public void androidRunner(CellPhone cellPhone)
	{
		System.out.println(cellPhone.brandName);
		cellPhone.calling();
		
		if(cellPhone instanceof SmartPhone)
		{
			SmartPhone smartPhone=(SmartPhone)cellPhone;
			System.out.println(smartPhone.resolution);
			smartPhone.accessInformation();
		}
		if(cellPhone instanceof FlipPhone)
		{
			FlipPhone flipPhone=(FlipPhone)cellPhone;
			System.out.println(flipPhone.durability);
			flipPhone.folding();
		}
		if(cellPhone instanceof SliderPhone)
		{
			SliderPhone sliderPhone=(SliderPhone)cellPhone;
			System.out.println(sliderPhone.keyboardType);
			sliderPhone.transport();
		}
	
		if(cellPhone instanceof QwertyPhone)
		{
			QwertyPhone qwertyPhone=(QwertyPhone)cellPhone;
			System.out.println(qwertyPhone.displayInch);
			qwertyPhone.text();
		}
	}

}
