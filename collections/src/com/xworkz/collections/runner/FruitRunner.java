package com.xworkz.collections.runner;

import java.util.Collection;

import com.xworkz.collections.fruit.Fruit;

public class FruitRunner {

	public static void main(String[] args) {
		Collection<String> collection = Fruit.getFruit();
		System.out.println("Total Number of Fruits:"+collection.size());
		//System.out.println("Removed ele is:"+collection.remove("Apple"));//removed ele
		for(String fruit:collection)
		{
			System.out.println(fruit);
//			if(fruit.startsWith("A"))
//			{
//				collection.remove(fruit);//ConcurrentModificationException(unchecked exception)
			//in for each we cannot access and modify(remove or add) at a time, in that situation concurrent exception is occur
//			}
			
		}
		//System.out.println("After Total Number of Fruits:"+collection.size());

	}

}
