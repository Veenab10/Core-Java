package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Student implements Serializable{

	public static Collection<String> getStudentName()
	{
		Collection<String> studentCollection=new ArrayList<String>();
		studentCollection.add("Veena");
		studentCollection.add("Ganga");
		studentCollection.add("Pallavi");
		studentCollection.add("Keerti");
		studentCollection.add("Komal");
		return studentCollection;
	}
}
