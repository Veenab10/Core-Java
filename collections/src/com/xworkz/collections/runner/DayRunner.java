package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.DayDTO;

public class DayRunner {

	public static void main(String[] args) {
		DayDTO day1 = new DayDTO("Sunday", 1);
		DayDTO day2 = new DayDTO("Monday", 2);
		DayDTO day3 = new DayDTO("Tuesday", 3);
		DayDTO day4 = new DayDTO("Wednesday", 4);
		DayDTO day5 = new DayDTO("Thursday", 5);
		DayDTO day6 = new DayDTO("Friday", 6);
		DayDTO day7 = new DayDTO("Saturday", 7);

		Collection<DayDTO> dayCollection = new ArrayList<DayDTO>();
		dayCollection.add(day1);
		dayCollection.add(day2);
		dayCollection.add(day3);
		dayCollection.add(day4);
		dayCollection.add(day5);
		dayCollection.add(day6);
		dayCollection.add(day7);

		dayCollection.stream().sorted().collect(Collectors.toList()).forEach(d -> System.out.println(d));

	}

}
