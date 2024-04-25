package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.dto.MarkerDTO;

public class MarkerRunner {
	public static void main(String[] args) {
		MarkerDTO marker1=new MarkerDTO("Sharpie","Pink",50,10);
		MarkerDTO marker2=new MarkerDTO("Copic","White",60,4);
		MarkerDTO marker3=new MarkerDTO("Prismacolor","Yellow",70,6);
		MarkerDTO marker4=new MarkerDTO("Posca","Red",80,8);
		MarkerDTO marker5=new MarkerDTO("Molotow","White",90,3);
		MarkerDTO marker6=new MarkerDTO("Sakura","Green",100,9);
		MarkerDTO marker7=new MarkerDTO("Pentel","Blue",99,6);
		MarkerDTO marker8=new MarkerDTO("Zig","Orange",45,5);
		MarkerDTO marker9=new MarkerDTO("Touch Twin Marker","Black",55,10);
		MarkerDTO marker10=new MarkerDTO("Copic","Pink",60,20);
		
		Collection<MarkerDTO> markerCollection=new ArrayList<MarkerDTO>();
		markerCollection.add(marker1);
		markerCollection.add(marker2);
		markerCollection.add(marker3);
		markerCollection.add(marker4);
		markerCollection.add(marker5);
		markerCollection.add(marker6);
		markerCollection.add(marker7);
		markerCollection.add(marker8);
		markerCollection.add(marker9);
		markerCollection.add(marker10);
		
		System.out.println("Total Markers Numbers:"+markerCollection.size());
		
		Iterator<MarkerDTO> itr=markerCollection.iterator();
		
		while(itr.hasNext())
		{
			MarkerDTO marker=itr.next();
			if(marker.getBrand().equals("Copic"))
			{
				itr.remove();
			}
		}
		
		System.out.println("After Remving");
		
		System.out.println("Total Markers Numbers:"+markerCollection.size());
		
		for(MarkerDTO markers:markerCollection)
		{
			System.out.println(markers);
		}
		
	}

}
