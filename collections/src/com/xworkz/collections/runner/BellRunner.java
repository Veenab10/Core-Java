package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.BellDTO;

public class BellRunner {

	public static void main(String[] args) {
		BellDTO bell1 = new BellDTO("Copper", "TempleBell", 20, 20, 1200);
		BellDTO bell2 = new BellDTO("Tin", "Church Bell", 40, 40, 800);
		BellDTO bell3 = new BellDTO("Zinc", "Sleigh Bell", 10, 20, 750);
		BellDTO bell4 = new BellDTO("Iron", "Ship's Bell", 8, 4, 600);
		BellDTO bell5 = new BellDTO("Glass", "Dinner Bell", 88, 44, 1400);
		BellDTO bell6 = new BellDTO("Steel", "Cow Bell", 50, 45, 1200);
		BellDTO bell7 = new BellDTO("Cast Iron", "Bicycle Bell", 55, 33, 999);
		BellDTO bell8 = new BellDTO("Ceramic", "Carillon Bell ", 50, 40, 850);
		BellDTO bell9 = new BellDTO("Brass", "School Bell", 20, 40, 1000);
		BellDTO bell10 = new BellDTO("bronze", "Hand Bell", 10, 10, 950);

		Collection<BellDTO> bellCollection = new ArrayList<BellDTO>();
		bellCollection.add(bell1);
		bellCollection.add(bell2);
		bellCollection.add(bell3);
		bellCollection.add(bell4);
		bellCollection.add(bell5);
		bellCollection.add(bell6);
		bellCollection.add(bell7);
		bellCollection.add(bell8);
		bellCollection.add(bell9);
		bellCollection.add(bell10);

		for (BellDTO bell : bellCollection) {
			if (bell.getPrice() > 1000) {
				System.out.println("Bell Price Greater than 1000 price MetalUsed  Name:" + bell.getMetalUsed());
			}
		}

		for (BellDTO b : bellCollection) {
			if (b.getMetalUsed().equals("bronze")) {
				System.out.println("bronze Metalused:" + b.getMetalUsed());
			}
		}

		for (BellDTO bell : bellCollection) {
			if (bell.getHeight() == bell.getWeight()) {
				System.out.println("Same Height and Weight used for :" + bell.getType());
			}
		}

	}

}
