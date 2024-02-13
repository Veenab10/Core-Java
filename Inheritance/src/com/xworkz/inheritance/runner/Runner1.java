package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.builtin_methods.Battery;
import com.xworkz.inheritance.builtin_methods.Colgate;
import com.xworkz.inheritance.builtin_methods.Paint;
import com.xworkz.inheritance.builtin_methods.Ring;
import com.xworkz.inheritance.builtin_methods.SwitchBoard;
import com.xworkz.inheritance.builtin_methods.Table;
import com.xworkz.inheritance.builtin_methods.Tie;


public class Runner1 {

	public static void main(String[] args) {
		Ring ring=new Ring("Gold","Gold Platted","Oval");
		
		System.out.println(ring.toString());
		System.out.println(ring.hashCode());
		
		System.out.println("............................");
		ring. jewelleryType="Silver";
		ring.platedMetalType="Silver plate";
		ring.stoneShape="circle";
		System.out.println("Updated Values:");
		System.out.println(ring.toString());
		
		System.out.println(ring.hashCode());
		ring.wear();
		
		System.out.println("-----------------------------");
		
		Paint paint=new Paint("Wood","Liquid",40);
		System.out.println(paint);
		System.out.println(paint.hashCode());
		System.out.println("............................");
		paint.surfaceRecommendation="Metal";
		paint.itemForm="Wax";
		paint.size=60;
		System.out.println("Updated values:");
		System.out.println(paint);
		
		System.out.println("-----------------------------");
		
		
		SwitchBoard switchBoard=new SwitchBoard("Portronics",300,"India");
		System.out.println(switchBoard);
		System.out.println(switchBoard.hashCode());
		System.out.println("............................");
		switchBoard.brand="wipro";
		switchBoard.price=150;
		switchBoard.madeIn="America";
		System.out.println("Updated Value"+switchBoard);
		
		System.out.println("-----------------------------");

		Battery battery=new Battery();
		System.out.println(battery);
		System.out.println(battery.hashCode());
		System.out.println("............................");

		battery.weight=140;
		battery.voltage=1.4f;
		battery.batteryCell="Duracell";
		System.out.println("Updated Values");
		System.out.println(battery);
		
		System.out.println("-----------------------------");
		
		Colgate colgate=new Colgate();
		System.out.println(colgate);
		System.out.println(colgate.hashCode());
		System.out.println("............................");
		System.out.println("Updated Value");
		colgate.itemForm="paste";
		colgate.flavour="mint";
		colgate.price=100;
		System.out.println(colgate);
		
		System.out.println("-----------------------------");
		
		Table table=new Table();
		System.out.println(table);
		System.out.println(table.hashCode());
		System.out.println("............................");
		System.out.println("Updated Value");
		table.baseMaterial="Wood";
		table.finishType="Laminated";
		table.shape="Round";
		System.out.println(table);

		
		System.out.println("-----------------------------");
		
		Tie tie=new Tie();
		System.out.println(tie);
		System.out.println(tie.hashCode());
		System.out.println("............................");
		System.out.println("Updated Value");
		tie.apparelMaterial="Cotton";
		tie.brand="Axlon";
		tie.occasion="Casual";
		System.out.println(tie);

		
		

		
		
	}
}

