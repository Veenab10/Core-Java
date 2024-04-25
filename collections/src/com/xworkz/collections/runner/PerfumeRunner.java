package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.dto.PerfumeDTO;

public class PerfumeRunner {

	public static void main(String[] args) {
	PerfumeDTO perfume1=new PerfumeDTO("Park Avenue","Black",600,"Ambrosia",12);
	PerfumeDTO perfume2=new PerfumeDTO("Engage","White",500,"Blissful Breeze.",10);
	PerfumeDTO perfume3=new PerfumeDTO("Yardley ","Pink",1000,"Blossom",12);
	PerfumeDTO perfume4=new PerfumeDTO("FOGG","Black",600,"Ambrosia",10);
	PerfumeDTO perfume5=new PerfumeDTO("Plum","Black",600,"Ambrosia",15);
	PerfumeDTO perfume6=new PerfumeDTO("Ajmal","Black",600,"Ambrosia",14);
	PerfumeDTO perfume7=new PerfumeDTO("Denver","Black",600,"Ambrosia",7);
	PerfumeDTO perfume8=new PerfumeDTO("AXE","Black",600,"Ambrosia",6);
	PerfumeDTO perfume9=new PerfumeDTO("Azzaro","Black",600,"Ambrosia",8);
	PerfumeDTO perfume10=new PerfumeDTO("Park Avenue","Black",600,"Ambrosia",9);
	
	Collection<PerfumeDTO> perfumeCollection=new ArrayList<PerfumeDTO>();
	perfumeCollection.add(perfume1);
	perfumeCollection.add(perfume2);
	perfumeCollection.add(perfume3);
	perfumeCollection.add(perfume4);
	perfumeCollection.add(perfume5);
	perfumeCollection.add(perfume6);
	perfumeCollection.add(perfume7);
	perfumeCollection.add(perfume8);
	perfumeCollection.add(perfume9);
	perfumeCollection.add(perfume10);
	
	System.out.println("Total Perfumes:"+perfumeCollection.size());
	
	Iterator<PerfumeDTO> itr=perfumeCollection.iterator();
	
	while(itr.hasNext())
	{
		PerfumeDTO perfume=itr.next();
		
		if(perfume.getBrand().equals("Park Avenue"))
		{
			itr.remove();
		}
	}
	System.out.println("Afer Removing");
	System.out.println("Total Perfumes:"+perfumeCollection.size());
	for(PerfumeDTO perfume:perfumeCollection)
	{
		System.out.println(perfume);
	}
	
	

	}

}
