package com.xworkz.collections.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PersonMapRunner {

	public static void main(String[] args) {
		// k-key - it will not allow duplicate values, it may be DTO,Collection, Wrapper
		// classes,Enum..etc
		// v-value- it will allow duplicate values
		//Map<String, String> map = new TreeMap<String, String>();// by default it maintains ascending order
		Map<String, String> map=new HashMap<String, String>();// it will not maintain any order
		map.put("Veena", "veenabaligeri@gmail.com");
		map.put("Pallavi", "pallavi@gmail.com");
		map.put("Keerti", "keerti@gmail.com");
		map.put("Ganga", "ganga12@gmail.com");
		map.put("Komal", "komal12@gmail.com");
		map.put("Anu", "anu01@gmail.com");
		map.put("Veena", "veenabaligeri@gmail.com");
		map.put(null, "veenabaligeri@gmail.com");
		map.put(null, "veena@gmail.com");// key will take null latest value

		System.out.println("Person with Email ID");
		map.forEach((name, emailId) -> System.out.println(name + ":" + emailId));

	}

}
