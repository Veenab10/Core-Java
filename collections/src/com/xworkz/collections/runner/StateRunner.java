package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collections.dto.StateDTO;

public class StateRunner {

	public static void main(String[] args) {
		
		StateDTO state1=new StateDTO("Karnataka");
		StateDTO state2=new StateDTO("TamilNadu");
		StateDTO state3=new StateDTO("Gova");
		StateDTO state4=new StateDTO("Aasam");
		StateDTO state5=new StateDTO("Bihar");
		
		Collection<StateDTO> stateCollection=new ArrayList<StateDTO>();
		stateCollection.add(state1);
		stateCollection.add(state2);
		stateCollection.add(state3);
		stateCollection.add(state4);
		stateCollection.add(state5);
		
		stateCollection.stream()
		.filter(state->state.getName().startsWith("K"))
		.collect(Collectors.toList())
		.forEach(s->System.out.println(s));
		
		

	}

}
