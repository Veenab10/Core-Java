package com.xworkz.collections.fruit;

import java.util.ArrayList;
import java.util.Collection;

public class Temperature {
	public static Collection<Integer> getTemp()
	{
		Collection<Integer> tempCollection=new ArrayList<Integer>();
		tempCollection.add(20);
		tempCollection.add(35);
		tempCollection.add(30);
		tempCollection.add(33);
		tempCollection.add(26);
		tempCollection.add(16);
		tempCollection.add(28);
		tempCollection.add(31);
		tempCollection.add(14);
		tempCollection.add(24);
		return tempCollection;
	}

}
