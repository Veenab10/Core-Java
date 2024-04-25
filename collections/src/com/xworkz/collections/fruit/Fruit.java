package com.xworkz.collections.fruit;

import java.util.ArrayList;
import java.util.Collection;

public class Fruit {

	public static Collection<String> getFruit() {
		Collection<String> fruitCollection = new ArrayList<String>();
		fruitCollection.add("Apple");
		fruitCollection.add("Banana");
		fruitCollection.add("Orange");
		fruitCollection.add("Graps");
		fruitCollection.add("Mango");
		fruitCollection.add("Sapota");
		return fruitCollection;

	}

}
