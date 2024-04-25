package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.dto.HouseDTO;

public class HouseRunner {

	public static void main(String[] args) {
		HouseDTO house1=new HouseDTO("Veena",8866,"Bagalkot",2);
		HouseDTO house2=new HouseDTO("Keerti",1122,"Badami",3);
		HouseDTO house3=new HouseDTO("Pallavi",5544,"Gadag",4);
		HouseDTO house4=new HouseDTO("Ganga",9980,"Dharwad",7);
		HouseDTO house5=new HouseDTO("Shana",1456,"Hubli",6);
		HouseDTO house6=new HouseDTO("Sangeeta",6745,"Haveri",4);
		HouseDTO house7=new HouseDTO("Ashwini",1311,"Banglore",5);
		HouseDTO house8=new HouseDTO("Geeta",6689,"Mysore",4);
		HouseDTO house9=new HouseDTO("Harsha",4321,"Hasaan",2);
		HouseDTO house10=new HouseDTO("Madhu",6023,"GLD",2);
		
		Collection<HouseDTO> houseCollection=new ArrayList<HouseDTO>();
		houseCollection.add(house1);
		houseCollection.add(house2);
		houseCollection.add(house3);
		houseCollection.add(house4);
		houseCollection.add(house5);
		houseCollection.add(house6);
		houseCollection.add(house7);
		houseCollection.add(house8);
		houseCollection.add(house9);
		houseCollection.add(house10);
		
		for(HouseDTO house:houseCollection)
		{
			System.out.println(house);
		}
		

	}

}
