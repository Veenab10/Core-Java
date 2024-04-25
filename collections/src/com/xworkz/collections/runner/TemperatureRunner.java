package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.fruit.Temperature;

public class TemperatureRunner {

	public static void main(String[] args) {
		Collection<Integer> collection = Temperature.getTemp();
		System.out.println("Total Number of temperatures:" + collection.size());

		// System.out.println("After Removing:"+collection.size());
		System.out.println("Number Greater Than 20");
		for (Integer temper : collection) {
			if (temper > 20) {
				System.out.println(temper);

			}

		}

		System.out.println("Number Less Than 20");
		for (Integer temper : collection) {
			if (temper < 20) {
				System.out.println(temper);

			}

		}

		// System.out.println(collection);
		System.out.println("Removing Elements");
		Iterator<Integer> itr = collection.iterator();
		while (itr.hasNext()) {
			Integer temp = itr.next();
			if (temp < 15) {
				itr.remove();
				System.out.println(temp);
			}
		}

	}

}
