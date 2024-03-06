package com.xworkz.runner;

import com.xworkz.abstraction.ATM;
import com.xworkz.abstraction.Bag;
import com.xworkz.abstraction.Building;
import com.xworkz.abstraction.Canara_ATM;
import com.xworkz.abstraction.CollegeBag;
import com.xworkz.abstraction.HomeBuilding;
import com.xworkz.abstraction.PgBuilding;
import com.xworkz.abstraction.Phone;
import com.xworkz.abstraction.Redmi;

public class Runner {
	public static void main(String[] args) {
		
		//Phone phone=new Phone(); // cannot instatiate for abstract class
		Phone phone=new Redmi();
		Redmi redmi=new Redmi();
		
		//ATM atm=new ATM();
		ATM atm=new Canara_ATM();
		atm.balanceChecking();
		atm.withDraw();
		
		System.out.println("_________________________________________");
		
		Canara_ATM canara_ATM=new Canara_ATM();
		canara_ATM.balanceChecking();
		canara_ATM.withDraw();
		
		System.out.println("__________________________________________");
		
		//Building building=new Building();
		Building building=new HomeBuilding();
		building.color();
		building.size();
		System.out.println("__________________________________________");
		
		HomeBuilding homeBuilding=new HomeBuilding();
		homeBuilding.color();
		homeBuilding.size();
		
		System.out.println("_____________________________________________");
		
		PgBuilding pgBuilding=new PgBuilding();
		pgBuilding.color();
		pgBuilding.size();
		
		//Bag bag=new Bag();
		Bag bag=new CollegeBag(200);
		System.out.println(bag.price);
		bag.storage();
		System.out.println("_____________________________________________");
		
		CollegeBag collegeBag=new CollegeBag("Safari","Leather");
		collegeBag.storage();
		System.out.println(collegeBag.brand);
		System.out.println(collegeBag.material);
		
		
		
		
		
		
				
			
			
		
		
		
	}

}
