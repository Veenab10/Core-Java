package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.RubberDTO;

public class RubberRunner {

	public static void main(String[] args) {
		RubberDTO rubber1=new RubberDTO("Good Year","Blue","Round","jan-20");
		RubberDTO rubber2=new RubberDTO("Michelin","Pink","rectange","dec-31");
		RubberDTO rubber3=new RubberDTO("Firestone","green","square","july-1");
		RubberDTO rubber4=new RubberDTO("pirelli","red","triangle","may-10");
		RubberDTO rubber5=new RubberDTO("Dunlop","yellow","Round","jan-22");
		RubberDTO rubber6=new RubberDTO("Firestone","black","square","jan-20");
		RubberDTO rubber7=new RubberDTO("Toyo","Blue","rectangle","oct-1");
		RubberDTO rubber8=new RubberDTO("Yokochama","gray","Round","oct-2");
		RubberDTO rubber9=new RubberDTO("Dunlop","white","rectangle","nov-11");
		RubberDTO rubber10=new RubberDTO("Good year","Blue","square","dec-31");
		
		Collection<RubberDTO> rubberCollection=new ArrayList<RubberDTO>();
		rubberCollection.add(rubber1);
		rubberCollection.add(rubber2);
		rubberCollection.add(rubber3);
		rubberCollection.add(rubber4);
		rubberCollection.add(rubber5);
		rubberCollection.add(rubber6);
		rubberCollection.add(rubber7);
		rubberCollection.add(rubber8);
		rubberCollection.add(rubber9);
		rubberCollection.add(rubber10);
		
		rubberCollection
		.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach(r->System.out.println(r));
		
		System.out.println("________________________________________________");
		
		rubberCollection
		.stream()
		.filter(rubber->rubber.getColor().equals("Blue"))
		.collect(Collectors.toList())
		.forEach(r->System.out.println(r));
		
		
		
		

	}

}
