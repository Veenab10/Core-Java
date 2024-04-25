package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.dto.BoxDTO;

public class BoxRunner {

	public static void main(String[] args) {
		BoxDTO box1=new BoxDTO(300,"Black",1,"Cardboard");
		BoxDTO box2=new BoxDTO(250,"White",1,"Paperboard");
		BoxDTO box3=new BoxDTO(200,"Orange",1,"Kraft paper");
		BoxDTO box4=new BoxDTO(160,"Pink",1,"Wood");
		BoxDTO box5=new BoxDTO(300,"Blue",1,"Plastic ");
		BoxDTO box6=new BoxDTO(450,"Green",1,"Metal ");
		BoxDTO box7=new BoxDTO(35,"Red",1,"Fabric ");
		BoxDTO box8=new BoxDTO(600,"Purple",1,"Leather");
		BoxDTO box9=new BoxDTO(180,"Gray",1,"Glass");
		BoxDTO box10=new BoxDTO(120,"Yellow",1,"Ceramic");
		
		Collection<BoxDTO> boxCollection=new ArrayList<BoxDTO>();
		boxCollection.add(box1);
		boxCollection.add(box2);
		boxCollection.add(box3);
		boxCollection.add(box4);
		boxCollection.add(box5);
		boxCollection.add(box6);
		boxCollection.add(box7);
		boxCollection.add(box8);
		boxCollection.add(box9);
		boxCollection.add(box10);
		
		for(BoxDTO box:boxCollection)
		{
			if(box.getColor().equals("Red"))
			{
				System.out.println("Box having Red Color:"+box);
			}
		}
		
		Iterator<BoxDTO> itr=boxCollection.iterator();
		
		while(itr.hasNext())
		{
			BoxDTO box=itr.next();
			if(box.getColor().equals("Green"))
			{
				itr.remove();
				//System.out.println("Removed box:"+box.getColor());
			}
		}
		System.out.println("Ater Removing Green Box");
		
		for(BoxDTO box:boxCollection)
		{
			System.out.println(box);
		}

	}

}
