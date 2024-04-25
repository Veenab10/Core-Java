package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.fruit.PassBook;

public class PassBookRunner {

	public static void main(String[] args) {

		Collection<Integer> collection = PassBook.getPassBokNo();

		System.out.println("Total Pass Book Numbers:" + collection.size());
		//System.out.println(collection);
		System.out.println("PassBookNumber starts with 4");

		Iterator<Integer> itr = collection.iterator();

		while (itr.hasNext()) {
			Integer passBook = itr.next();

			String pass = String.valueOf(passBook);

			if (pass.startsWith("4")) {
				System.out.println(passBook);
			}

		}
		System.out.println("passbook number having 0");

//		while (itr.hasNext()) {
//			Integer passBook = itr.next();
//
//			String pass = String.valueOf(passBook);
//
//			if (pass.contains("0")) {
//
//				System.out.println(passBook);
//
//			}
//
//		}
		for(Integer pass:collection)
		{
			
			String pass1 = String.valueOf(pass);
			
			if(pass1.contains("0"))
			{
				System.out.println(pass);
			}
		}

	}

}
