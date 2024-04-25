package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.fruit.CollegeCode;

public class CollegeCodeRunner {

	public static void main(String[] args) {
		
		Collection<Integer> collection=CollegeCode.getCollegeCode();
		
		
		Iterator<Integer> iterator=collection.iterator();
		
		System.out.println("Total College Code:"+collection.size());
		
		while (iterator.hasNext())
		{
			Integer id=iterator.next();
			System.out.println("College Code:"+id);
			
			 if (id==578203) {
				 iterator.remove();
	            }
		}
		
		System.out.println("Ater College Code:"+collection.size());
		
		for(Integer id:collection)
		{
			System.out.println(id);
		}
		
	}
}
     
		
	

