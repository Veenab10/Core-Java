package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.dto.CollegeDTO;

public class CollegeRunner {

	public static void main(String[] args) {

		CollegeDTO college1 = new CollegeDTO("JSS", 1311, 50, 1500);

		CollegeDTO college2 = new CollegeDTO("SMI", 1311, 80, 2000);

		CollegeDTO college3 = new CollegeDTO("PRISM", 7856, 40, 1900);

		CollegeDTO college4 = new CollegeDTO("BVB", 1024, 30, 1200);
		
		System.out.println("ADD Method");
		
		Collection<CollegeDTO> collection1=new ArrayList<CollegeDTO>();
		collection1.add(college1);
		collection1.add(college2);
		collection1.add(college3);
		collection1.add(college4);
		System.out.println("Add Method:"+college4);
		
		System.out.println("ADDAll Method");
		Collection<CollegeDTO> collection2=new ArrayList<CollegeDTO>();
		//System.out.println("collection2"+collection2);
		collection2.addAll(collection1);
		System.out.println("collection1"+collection1);
		//System.out.println("collection2"+collection2);
		
		System.out.println("Remove Method");
		
//		Iterator<CollegeDTO> itr=collection2.iterator();
//		
//		while(itr.hasNext())
//		{
//			CollegeDTO college=itr.next();
//			
//			if(college.equals("JSS"))
//			{
//				itr.remove();
//			}
//		}
		//System.out.println("collection2"+collection2.remove("JSS"));
		System.out.println("Before Removing..");
		System.out.println(collection2);
		System.out.println(collection2.remove(college1));
		System.out.println("Ater Removing..");
		System.out.println(collection2);
		
		
		System.out.println("RemoveAll Method");
		System.out.println(collection2.removeAll(collection2));
		System.out.println("Ater Removing all..");
		System.out.println(collection2);
		
		System.out.println("Removeif Method");
		//collection1.removeIf();
		System.out.println("Before removeif");
		System.out.println(collection1);
		System.out.println(collection1.removeIf(n->n.getCollegeID()==1311));
		System.out.println("After removeif");
		System.out.println(collection1);
		
//		System.out.println("Contains Method");
//		for(CollegeDTO n:collection1)
//		{
//			if(n.contains("JSS"))
//			{
//				System.out.println(n);
//			}
//		}
		
	}

}
