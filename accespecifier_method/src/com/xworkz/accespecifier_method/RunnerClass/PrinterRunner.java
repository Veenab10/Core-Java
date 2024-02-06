package com.xworkz.accespecifier_method.RunnerClass;

import com.xworkz.accespecifier_method.inheritance.CanonPrinter;
import com.xworkz.accespecifier_method.inheritance.Printer;
import com.xworkz.accespecifier_method.inheritance.SmartCanonPrinter;

public class PrinterRunner {

	public static void main(String[] args) {
		
		Printer printer=new Printer();
		printer.print();
		printer.scan();
		printer.copy();
		
		System.out.println("______________________________________");
		
		CanonPrinter  canonPrinter=new CanonPrinter();
		canonPrinter.copy();
		canonPrinter.print();
		canonPrinter.scan();
		canonPrinter.connectToWifi();
		
		
		
		System.out.println("______________________________________");
		
		Printer printer1=new CanonPrinter();
		printer1.print();
		printer1.scan();
		printer1.copy();
		
		System.out.println("______________________________________");
		
		CanonPrinter canonPrinter1=(CanonPrinter)printer1;
		canonPrinter1.print();
		canonPrinter1.copy();
		canonPrinter1.scan();
		canonPrinter1.connectToWifi();
		
		System.out.println("______________________________________");
		
		SmartCanonPrinter smartCanonPrinter=new SmartCanonPrinter();
		smartCanonPrinter.print();
		smartCanonPrinter.copy();
		smartCanonPrinter.scan();
		smartCanonPrinter.connectToWifi();
		smartCanonPrinter.connectToMobile();
		
		System.out.println("______________________________________");

		
		CanonPrinter canonPrinter2=new SmartCanonPrinter();
		canonPrinter2.print();
		canonPrinter2.scan();
		canonPrinter2.copy();
		canonPrinter2.connectToWifi();
		
		System.out.println("______________________________________");

		
		SmartCanonPrinter smartCanonPrinter1=(SmartCanonPrinter)canonPrinter2;
		smartCanonPrinter1.print();
		smartCanonPrinter1.copy();
		smartCanonPrinter1.scan();
		smartCanonPrinter1.connectToWifi();
		smartCanonPrinter1.connectToMobile();
		
		System.out.println("______________________________________");
		
		Printer printer2=new SmartCanonPrinter();
		printer2.print();
		printer2.scan();
		printer2.copy();
		
		System.out.println("______________________________________");
		
		SmartCanonPrinter smartCanonPrinter2=(SmartCanonPrinter)printer2;
		smartCanonPrinter2.copy();
		smartCanonPrinter2.print();
		smartCanonPrinter2.scan();
		smartCanonPrinter2.connectToWifi();
		smartCanonPrinter2.connectToMobile();
		
		
		
		
		
	}
}
		

