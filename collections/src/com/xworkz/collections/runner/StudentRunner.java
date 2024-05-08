package com.xworkz.collections.runner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

import com.xworkz.collections.dto.Student;

public class StudentRunner {

	public static void main(String[] args) {

		Collection<String> collection = Student.getStudentName();
		System.out.println(collection.size());

		Collection<String> collection1 = Student.getStudentName();
		collection1.add("Aishu");
		collection1.add("Teju");
		System.out.println("ADD Method");
		System.out.println(collection1);

		System.out.println("addAll Method");
		collection.addAll(collection1);

		System.out.println(collection);

		System.out.println("Remove Method");

		Iterator<String> itr = collection1.iterator();

		while (itr.hasNext()) {
			String name = itr.next();

			if (name.equals("Veena")) {
				itr.remove();
			}
		}

		System.out.println("Ater Removing");
		for (String n : collection1) {
			System.out.println(n);
		}

		System.out.println("RemoveAll Method");

		Collection<String> collection2 = Student.getStudentName();

		System.out.println("Collection" + collection);
		System.out.println("Collection2" + collection2);

		collection.removeAll(collection2);

		System.out.println("After RemovAll");
		System.out.println(collection);
		
		System.out.println("Removeif Method");
		
		collection2.removeIf(c->c.charAt(0)=='K');
		
		for (String c : collection2) {
			System.out.println(c);
			
		}
		
		System.out.println("Contains Method");
		
		Collection<String> collection5 = Student.getStudentName();
		
		for(String n:collection5)
		{
			if(n.contains("Veena"))
			{
				System.out.println(n);
			}
		}
		
		System.out.println("ContainsAll Method");//return type boolean
		
		Collection<String> collection7 = Student.getStudentName();
		//collection7.add("pavan");
		
		
		System.out.println(collection5.containsAll(collection7));
		
		System.out.println("Hashcode Method");
		
		
		System.out.println(collection.hashCode());
		
	
	
		System.out.println("Stream method");
		Stream<String> stream=collection1.stream();
		stream.forEach(System.out::println);
		
		
		System.out.println("isEmpty Method");
		System.out.println("Is Empty:"+collection.isEmpty());
		
		System.out.println("Clear Method");
		System.out.println("Before Clear");
		System.out.println(collection7);
		collection7.clear();
		System.out.println("After Clear");
		System.out.println(collection7);
		
		System.out.println("toArray method");
		Object[] arr=collection1.toArray();
		System.out.println("Elements of ArrayList"+Arrays.toString(arr));
		
		System.out.println("RetainAll method");
		//The retainAll() method of ArrayList is used to remove all the array list’s elements that are not contained in the specified collection 
		
		Collection<String> collection8 = Student.getStudentName();
		System.out.println("Before Applying retailAll");
		System.out.println(collection1);
		System.out.println(collection8);
		
		System.out.println("After Applying retailAll");
		
		collection8.retainAll(collection1);
		
		System.out.println(collection1);
		System.out.println(collection8);
		
		
		
		
		
		
		
		

	}

}
