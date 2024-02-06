package com.xworkz.accespecifier_method.RunnerClass;

import com.xworkz.accespecifier_method.inheritance.DellLaptop;
import com.xworkz.accespecifier_method.inheritance.Laptop;
import com.xworkz.accespecifier_method.inheritance.LenovoLaptop;
import com.xworkz.accespecifier_method.inheritance.TouchScreenLaptop;

public class LaptopRunner {
	
	public static void main(String[] args) {
		
		Laptop laptop=new Laptop();
		laptop.storage();
		laptop.run();
		laptop.execute();
		
		System.out.println("____________________");
		
		LenovoLaptop lenovo=new LenovoLaptop();
		lenovo.run();
		lenovo.execute();
		lenovo.storage();
		lenovo.shutDown();
		lenovo.powerOff();
		lenovo.powerOn();
		
		System.out.println("____________________");
		
		Laptop laptop1=new LenovoLaptop();
		laptop1.run();
		laptop1.execute();
		laptop1.storage();
		
		System.out.println("____________________");
		
		LenovoLaptop lenovoLaptop=(LenovoLaptop)laptop1;
		lenovoLaptop.execute();
		lenovoLaptop.run();
		lenovoLaptop.storage();
		lenovoLaptop.shutDown();
		lenovoLaptop.powerOn();
		lenovoLaptop.powerOff();
		
		System.out.println("____________________");

		DellLaptop dellLaptop=new DellLaptop();
		dellLaptop.powerOn();
		dellLaptop.powerOff();
		dellLaptop.shutDown();
		dellLaptop.restart();
		dellLaptop.sleep();
		dellLaptop.display();
		dellLaptop.execute();
		dellLaptop.run();
		dellLaptop.storage();
		
		System.out.println("____________________");
		
		LenovoLaptop lenovoLaptop1=new DellLaptop();
		lenovoLaptop1.run();
		lenovoLaptop1.execute();
		lenovoLaptop1.storage();
		lenovoLaptop1.shutDown();
		lenovoLaptop1.powerOff();
		lenovoLaptop1.powerOn();
		
		System.out.println("____________________");
		
		DellLaptop dellLaptop2=(DellLaptop)lenovoLaptop1;
		dellLaptop2.run();
		dellLaptop2.storage();
		dellLaptop2.execute();
		dellLaptop2.powerOff();
		dellLaptop2.powerOn();
		dellLaptop2.shutDown();
		dellLaptop2.sleep();
		dellLaptop2.restart();
		dellLaptop2.display();
		
		System.out.println("____________________");
		
		Laptop laptop2=new DellLaptop();
		laptop2.run();
		laptop2.execute();
		laptop2.storage();
		
		System.out.println("____________________");
		
		
		DellLaptop dellLaptop1=(DellLaptop)laptop2;
		dellLaptop1.run();
		dellLaptop1.execute();
		dellLaptop1.storage();
		dellLaptop1.display();
		dellLaptop1.sleep();
		dellLaptop1.restart();
		dellLaptop1.powerOff();
		dellLaptop1.powerOn();
		dellLaptop1.shutDown();
		
		System.out.println("____________________");
		
		TouchScreenLaptop touchScreenLaptop=new TouchScreenLaptop();
		touchScreenLaptop.execute();
		touchScreenLaptop.run();
		touchScreenLaptop.storage();
		touchScreenLaptop.powerOff();
		touchScreenLaptop.powerOn();
		touchScreenLaptop.shutDown();
		touchScreenLaptop.connectivity();
		touchScreenLaptop.zoomin();
		touchScreenLaptop.zoomout();
		touchScreenLaptop.display();
		touchScreenLaptop.sleep();
		touchScreenLaptop.restart();
		
		System.out.println("____________________");
		
		DellLaptop dellLaptop3=new TouchScreenLaptop();
		dellLaptop3.run();
		dellLaptop3.execute();
		dellLaptop3.storage();
		dellLaptop3.powerOff();
		dellLaptop3.powerOn();
		dellLaptop3.shutDown();
		dellLaptop3.display();
		dellLaptop3.sleep();
		dellLaptop3.restart();
		
		
		System.out.println("____________________");
		
		TouchScreenLaptop touchScreenLaptop1=(TouchScreenLaptop)dellLaptop3;
		touchScreenLaptop1.run();
		touchScreenLaptop1.execute();
		touchScreenLaptop1.storage();
		touchScreenLaptop1.powerOff();
		touchScreenLaptop1.powerOn();
		touchScreenLaptop1.shutDown();
		touchScreenLaptop1.display();
		touchScreenLaptop1.sleep();
		touchScreenLaptop1.restart();
		touchScreenLaptop1.connectivity();
		touchScreenLaptop1.zoomin();
		touchScreenLaptop1.zoomout();
		
		System.out.println("____________________");
		
		LenovoLaptop lenovoLaptop2=new TouchScreenLaptop();
		lenovoLaptop2.run();
		lenovoLaptop2.execute();
		lenovoLaptop2.storage();
		lenovoLaptop2.powerOn();
		lenovoLaptop2.powerOff();
		lenovoLaptop2.shutDown();
		
		System.out.println("____________________");
		
		TouchScreenLaptop touchScreenLaptop2=( TouchScreenLaptop)lenovoLaptop2;
		touchScreenLaptop2.run();
		touchScreenLaptop2.execute();
		touchScreenLaptop2.storage();
		touchScreenLaptop2.powerOff();
		touchScreenLaptop2.powerOn();
		touchScreenLaptop2.shutDown();
		touchScreenLaptop2.zoomin();
		touchScreenLaptop2.zoomout();
		touchScreenLaptop2.connectivity();
		touchScreenLaptop2.display();
		touchScreenLaptop2.sleep();
		touchScreenLaptop2.restart();
		
		System.out.println("____________________");
		
		Laptop laptop3=new TouchScreenLaptop();
		laptop3.run();
		laptop3.storage();
		laptop3.execute();
		
		System.out.println("____________________");
		
		
		TouchScreenLaptop touchScreenLaptop3=(TouchScreenLaptop)laptop3;
		touchScreenLaptop3.run();
		touchScreenLaptop3.execute();
		touchScreenLaptop3.storage();
		touchScreenLaptop3.powerOff();
		touchScreenLaptop3.powerOn();
		touchScreenLaptop3.shutDown();
		touchScreenLaptop3.display();
		touchScreenLaptop3.sleep();
		touchScreenLaptop3.restart();
		touchScreenLaptop3.zoomin();
		touchScreenLaptop3.zoomout();
		touchScreenLaptop3.connectivity();
		
		
		
		
		
		
		

		
		
		
	}

}
