package com.xworkz.accespecifier_method.inheritance;

public class Bed {
	
	public void bedrunner(Pillow pil)
	{
		pil.material="Fabric";
		System.out.println(pil.material);
		pil.support();
		//System.out.println((MicroFiberPillow)pil);ClassCastException
		
		
		
		if(pil instanceof MicroFiberPillow)
		{
			MicroFiberPillow microFiberPillow=(MicroFiberPillow)pil;
			microFiberPillow.brandName="JDK";
			System.out.println(microFiberPillow.brandName);
			microFiberPillow.clean();
			
		}
	
	
		if(pil instanceof AirPillow)
		{
		AirPillow airPillow=(AirPillow)pil;
		airPillow.fillMaterial="Rubber";
		System.out.println(airPillow.fillMaterial);
		airPillow.adjustable();
		}
	}
}
