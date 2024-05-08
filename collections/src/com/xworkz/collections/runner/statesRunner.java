package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import javax.print.attribute.standard.PresentationDirection;

import com.xworkz.collections.dto.Direction;
import com.xworkz.collections.dto.StatesDTO;

public class statesRunner {

	public static void main(String[] args) {

		StatesDTO state1 = new StatesDTO("Karnataka", 34628000l, Direction.SOUTH, "siddaramaiah", 10.3, 68273981l);
		StatesDTO state2 = new StatesDTO("Andhara Pradesh", 5678902100l, Direction.EAST, "Shri YS Jagan Reddy", 12.4,
				23910910l);
		StatesDTO state3 = new StatesDTO("Arunachal Pradesh", 739898000l, Direction.SOUTH, "Shri Pema Khandu", 10d,
				83798219l);
		StatesDTO state4 = new StatesDTO("Assam", 380840900l, Direction.NORTH, "Shri Himanta Biswa Sarma", 12.4d,
				9378280919l);
		StatesDTO state5 = new StatesDTO("Bihar", 908989283800l, Direction.WEST, "Shri Nitish Kumar", 8d, 38780190l);
		StatesDTO state6 = new StatesDTO("Chattisgarh", 8738091803l, Direction.SOUTH, "Shri Bhupesh Baghel", 7.5d,
				283728910l);
		StatesDTO state7 = new StatesDTO("Delhi", 734821309300l, Direction.EAST, "Shri Arvind Kejriwal", 6.6d,
				88920192l);
		StatesDTO state8 = new StatesDTO("Goa", 34878900l, Direction.SOUTH, "Shri pramod Sawant", 5.2d, 82178291892l);
		StatesDTO state9 = new StatesDTO("Gujarat", 7849198130l, Direction.NORTH, "Shri Bhupendra Patel", 3.6d,
				76182912019l);
		StatesDTO state10 = new StatesDTO("Haryana", 876239281938l, Direction.WEST, "Shri Manohar Lal", 9d, 76288190l);
		StatesDTO state11 = new StatesDTO("Himachal Pradesh", 74690183000l, Direction.SOUTH, "Shri Jairam Thakur",
				11.4d, 23281892109l);
		StatesDTO state12 = new StatesDTO("Jharkhand", 729130198309l, Direction.EAST, "Shri Hemant Soren", 14d,
				3782098402l);
		StatesDTO state13 = new StatesDTO("Kerala", 376120380130l, Direction.WEST, "Shri pinarayi Vijayan", 15d,
				739208019l);
		StatesDTO state14 = new StatesDTO("Madhya Pradesh", 7836498401l, Direction.SOUTH, "Shri Shivraj Singh Chouhan",
				20d, 879328109301l);
		StatesDTO state15 = new StatesDTO("Maharashtra", 7360190920121l, Direction.NORTH, "Shri Uddhav Thackeray", 24d,
				239729801l);
		StatesDTO state16 = new StatesDTO("Manipur", 92301901092l, Direction.SOUTH, "Shri N.Biren Singh", 30d,
				87390931093l);
		StatesDTO state17 = new StatesDTO("Meghalaya", 7492309001l, Direction.NORTH, "Shri Conrad Kongkal Sangma", 34d,
				876837918l);
		StatesDTO state18 = new StatesDTO("Mizoram", 98983928l, Direction.WEST, "Shri Pu Zoramthaga", 19d, 39809109l);
		StatesDTO state19 = new StatesDTO("Nagaland", 8912891892l, Direction.EAST, "Shri Neiphiu Rio", 26d,
				7893193801l);
		StatesDTO state20 = new StatesDTO("Odisha", 1219283928l, Direction.SOUTH, "Shri Naveen Patnaik", 29d,
				379130139l);
		StatesDTO state21 = new StatesDTO("Puducheerry", 82983912121l, Direction.WEST, "Shri V.Narayanasamy", 31d,
				7219813801l);
		StatesDTO state22 = new StatesDTO("Punjab", 8898989121l, Direction.NORTH, "Shri Charanjit Singh", 28d,
				8739091l);
		StatesDTO state23 = new StatesDTO("Rajasthan", 98729182l, Direction.SOUTH, "Shri Ashok Gehlot", 34d, 8772981l);
		StatesDTO state24 = new StatesDTO("Sikkim", 87291021l, Direction.EAST, "Shri PS Golay", 34d, 78319301l);
		StatesDTO state25 = new StatesDTO("Tamil Nadu", 78891829819l, Direction.WEST, "R.N Ravi", 18d, 872371983l);
		StatesDTO state26 = new StatesDTO("Telangana", 87891201101l, Direction.SOUTH, "Shri K Chandrasekhar", 9d,
				872913091l);
		StatesDTO state27 = new StatesDTO("Tripura", 878239289192l, Direction.NORTH, "Shri Yogi Aditya Nath", 12d,
				892309128039l);
		StatesDTO state28 = new StatesDTO("Uttar Pradesh", 8792819921092l, Direction.SOUTH, "Shri pushkar Singh", 8d,
				8281938l);
		StatesDTO state29 = new StatesDTO("West Bengal", 7892019201297l, Direction.WEST, "Km.Mamata Banrjee", 9d,
				872391039l);

		Collection<StatesDTO> statesCollection = new ArrayList<StatesDTO>();
		statesCollection.add(state1);
		statesCollection.add(state2);
		statesCollection.add(state3);
		statesCollection.add(state4);
		statesCollection.add(state5);
		statesCollection.add(state6);
		statesCollection.add(state7);
		statesCollection.add(state8);
		statesCollection.add(state9);
		statesCollection.add(state10);
		statesCollection.add(state11);
		statesCollection.add(state12);
		statesCollection.add(state13);
		statesCollection.add(state14);
		statesCollection.add(state15);
		statesCollection.add(state16);
		statesCollection.add(state17);
		statesCollection.add(state18);
		statesCollection.add(state19);
		statesCollection.add(state20);
		statesCollection.add(state21);
		statesCollection.add(state22);
		statesCollection.add(state23);
		statesCollection.add(state24);
		statesCollection.add(state25);
		statesCollection.add(state26);
		statesCollection.add(state27);
		statesCollection.add(state28);
		statesCollection.add(state29);

		System.out.println("Fix default sorting by name ascending");

		statesCollection.stream().sorted().forEach(n -> System.out.println(n));

		System.out.println("___________________________________________");

		System.out.println("Sort all states by name in descending");

		statesCollection.stream().sorted((s1, s2) -> s2.getName().compareTo(s1.getName()))
				.forEach(state -> System.out.println(state));

		System.out.println("___________________________________________");

		// System.out.println("Get all states by each EAST direction");

		System.out.println("Get all states with direction EAST");

		statesCollection.stream().filter(state -> state.getDirection() == Direction.EAST)
				.forEach(state -> System.out.println(state));

		System.out.println("______________________________________");

		System.out.println("Get all states with direction NORTH");

		statesCollection.stream().filter(state -> state.getDirection() == Direction.NORTH)
				.forEach(state -> System.out.println(state));

		System.out.println("______________________________________");

		System.out.println("Get all states with direction WEST");

		statesCollection.stream().filter(state -> state.getDirection() == Direction.WEST)
				.forEach(state -> System.out.println(state));

		System.out.println("______________________________________");

		System.out.println("Get all states with direction SOUTH");

		statesCollection.stream().filter(state -> state.getDirection() == Direction.SOUTH)
				.forEach(state -> System.out.println(state));

//		statesCollection
//		.stream()
//		.filter(d -> d.getDirection().equals(Direction.EAST))
//
//		.forEach(di -> System.out.println(di));

		System.out.println("___________________________________________");

		System.out.println("get all population only by ascending");

		statesCollection.stream().sorted((p1, p2) -> p1.getPopulation().compareTo(p2.getPopulation()))
				.forEach(p -> System.out.println(p));

		System.out.println("___________________________________________");

		System.out.println("Get population only by state name");

		statesCollection.stream().map(name -> name.getName()).forEach(n -> System.out.println(n));

		System.out.println("_________________________________________");

		System.out.println("get state by minimum budget");
		Optional<StatesDTO> stateWithMinBudget = statesCollection.stream()
				.min((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Check if the Optional is present and print the minimum budget number
		stateWithMinBudget.ifPresent(state -> System.out.println("Minimum budget: " + state.getBudget()));

		System.out.println("________________________________________");
		System.out.println("get state maximum Budget");
		Optional<StatesDTO> stateWithMaxBudget = statesCollection.stream()
				.max((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Check if the Optional is present and print the minimum budget number
		stateWithMaxBudget.ifPresent(state -> System.out.println("Maximum budget: " + state.getBudget()));

		System.out.println("______________________________________");

		System.out.println("Get second maximum budget");

		// Get the maximum budget if present
		double maxBudget = stateWithMaxBudget.map(StatesDTO::getBudget).orElse(Long.MIN_VALUE);

		// Find the second maximum budget by filtering out the maximum budget
		Optional<StatesDTO> stateWithSecondMaxBudget = statesCollection.stream()
				.filter(state -> state.getBudget() < maxBudget)
				.max((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Print the second maximum budget if present
		stateWithSecondMaxBudget.ifPresent(state -> System.out.println("Second maximum budget: " + state.getBudget()));

		System.out.println("___________________________________________");

		System.out.println("Get ChiftMinister name by state name");

		statesCollection.stream().filter(minister -> minister.getName().equals("Karnataka"))
				.map(c -> c.getChieftMinsiterName()).forEach(n -> System.out.println(n));

		System.out.println("___________________________________________");

		System.out.println("Get all by revennue greater than 10");

		statesCollection
		.stream()
		.filter(r -> r.getRevenue() > 10)
		.forEach(n -> System.out.println(n));

	}

}
