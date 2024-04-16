package com.xworkz.functional_interface.runner;

import com.xworkz.functional_interface.interface_classes.Bag;
import com.xworkz.functional_interface.interface_classes.Ball;
import com.xworkz.functional_interface.interface_classes.Book;
import com.xworkz.functional_interface.interface_classes.Camera;
import com.xworkz.functional_interface.interface_classes.Charger;
import com.xworkz.functional_interface.interface_classes.Door;
import com.xworkz.functional_interface.interface_classes.Dress;
import com.xworkz.functional_interface.interface_classes.Pencil;
import com.xworkz.functional_interface.interface_classes.Phone;
import com.xworkz.functional_interface.interface_classes.WaterBottle;
import com.xworkz.functional_interface.interface_classes.Window;

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
		phone.display("Redmi", 19000, "64");
		
		Charger charger=()->{
			System.out.println("charge storage method running in lamda function");
			return true;
			
		};
		boolean res1=charger.storage();
		System.out.println(res1);
		
		Book book=()->{
			System.out.println("Read method running in lamda function");
			return  100;
			
			
		};
		int res=book.read();
		System.out.println(res);
		
		Window window=()->{
			System.out.println("close method running in lamda function");
			return "window is closed";
			
		};
		String res5=window.close();
		System.out.println(res5);
		
		Dress dress=(price)->{
			System.out.println("Wear method running in lamda function");
			return price>50?true :false;
			
		};
		boolean res2=dress.wear(60);
		System.out.println(res2);
		
		
		Camera camera=(brandName,price)->{
			System.out.println("click method running in lamda function");
			return 1000d;
			
		};
		double res4= camera.click("Sony",1000);
		System.out.println(res4);
		}
	
	}
	
	


