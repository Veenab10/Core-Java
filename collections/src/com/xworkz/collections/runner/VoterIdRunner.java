package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collections.fruit.VoterId;

public class VoterIdRunner {

	public static void main(String[] args) {
	
		Collection<String> list=VoterId.getvoterId();
		System.out.println(list);
		System.out.println("Total Number of Voter Id:"+list.size());
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			String id=itr.next();
			if(id.equals("VBRK1267"))
			{
				itr.remove();
				System.out.println(id);
			}
			
		}
		System.out.println("Total Number of Voter Id:"+list.size());
		

	}

}
