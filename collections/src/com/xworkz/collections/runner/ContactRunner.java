package com.xworkz.collections.runner;

import java.util.Collection;

import com.xworkz.collections.fruit.ContactNumber;

public class ContactRunner {

	public static void main(String[] args) {
		Collection<Long>collection=ContactNumber.getContactNumber();
		System.out.println("Total contact numbers:"+collection.size());
		for(Long contact:collection)
		{
			System.out.println(contact);
		}

	}

}
