package com.xworkz.accespecifier_method.RunnerClass;

import com.xworkz.accespecifier_method.inheritance.AirPillow;
import com.xworkz.accespecifier_method.inheritance.Bed;
import com.xworkz.accespecifier_method.inheritance.MicroFiberPillow;
import com.xworkz.accespecifier_method.inheritance.Pillow;

public class PillowRunner {

	public static void main(String[] args) {
		
		Bed bed=new Bed();
		Pillow pillow=new Pillow();
		bed.capacity(pillow);
		
		
		Pillow pillow1=new MicroFiberPillow();
		bed.capacity(pillow1);
		
		Pillow pillow2=new AirPillow();
		bed.capacity(pillow2);
	
		
	}

}
