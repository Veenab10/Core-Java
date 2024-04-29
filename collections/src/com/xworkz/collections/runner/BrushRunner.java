package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.BrushDTO;

public class BrushRunner {

	public static void main(String[] args) {
		BrushDTO brush1 = new BrushDTO("Oral-B", 50, "Plastic", "Toothbrush");
		BrushDTO brush2 = new BrushDTO("Colgate", 80, "Rubber", "Oscillate");
		BrushDTO brush3 = new BrushDTO("betaXp", 70, "Wooden", "Vibrate");
		BrushDTO brush4 = new BrushDTO("Sensodyne", 40, "Rubber", "Pulsate");
		BrushDTO brush5 = new BrushDTO("Agaro", 99, "Rubber", "Pulsate");
		BrushDTO brush6 = new BrushDTO("perfora", 50, "Plastic", "Oscillate");
		BrushDTO brush7 = new BrushDTO("xml", 10, "Plastic", "Pulsate");
		BrushDTO brush8 = new BrushDTO("justec", 35, "Rubber", "Oscillate");
		BrushDTO brush9 = new BrushDTO("digital shoppy", 55, "Wooden", "Vibrate");
		BrushDTO brush10 = new BrushDTO("stim", 65, "Plastic", "Pulsate");

		Collection<BrushDTO> brushCollection = new ArrayList<BrushDTO>();
		brushCollection.add(brush1);
		brushCollection.add(brush2);
		brushCollection.add(brush3);
		brushCollection.add(brush4);
		brushCollection.add(brush5);
		brushCollection.add(brush6);
		brushCollection.add(brush7);
		brushCollection.add(brush8);
		brushCollection.add(brush9);
		brushCollection.add(brush10);

		brushCollection.stream().sorted().collect(Collectors.toList()).forEach(b -> System.out.println(b));

		System.out.println("-----------------------");

		brushCollection.stream().sorted().filter(brush -> brush.getPrice() > 50).collect(Collectors.toList())
				.forEach(b -> System.out.println(b));

	}

}
