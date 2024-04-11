package com.xworkz.functional_interface.runner;

import com.xworkz.functional_interface.interface_classes.Bag;
import com.xworkz.functional_interface.interface_classes.Ball;
import com.xworkz.functional_interface.interface_classes.Door;
import com.xworkz.functional_interface.interface_classes.Pencil;
import com.xworkz.functional_interface.interface_classes.Phone;
import com.xworkz.functional_interface.interface_classes.WaterBottle;

public class Runner {
	public static void main(String[] args) {
		Door door=()->{
			System.out.println("color method running in lamda function");
			
		};
		door.color();
		
		Pencil ref=(clr)->{
			System.out.println("write method running in lamda function");
			
		};
		ref.write("blue");
		
		WaterBottle bottle=(h,w)->{
			System.out.println("Storage method running in lamda function");
			
		};
		
		bottle.storage(2,2);
		
		Ball ball=(shape,clr)->{
			System.out.println("play method running in lamda function");
			
		};
		
		ball.play("Round","Yellow");
		
		Bag bag=(brand,price,clr)->{
			System.out.println("weightage method running in lamda function");
			
		};
		bag.weightage("Safari", 399, "Black");
		
		Phone phone=(b,p,s)->{
			 System.out.println("display method running in lamda function");
			
		};
		}
	
		
		
	}
	
	


