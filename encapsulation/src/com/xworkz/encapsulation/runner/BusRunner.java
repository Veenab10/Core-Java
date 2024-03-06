package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.encapsulation.BusTicket;
import com.xworkz.encapsulation.encapsulation.BusTicketException;
import com.xworkz.encapsulation.encapsulation.InvalidSeaterBusTicketNoException;
import com.xworkz.encapsulation.encapsulation.InvalidSleeperTicketNoException;

public class BusRunner {

	public static void main(String[] args) {
		
		BusTicket busTicket=new BusTicket();
		
		try {
			busTicket.invalidBusTicket(8000);
			busTicket.invalidSleeperTicketNo(1999);
			busTicket.invalidSeaterTicketNo("male");
		} 
		catch (BusTicketException  | InvalidSleeperTicketNoException  | InvalidSeaterBusTicketNoException e) {
			System.err.println(e);
			//e.printStackTrace();
		}
		
		catch (Exception e) {
			
			//e.printStackTrace();
			System.err.println(e);
		}
		System.out.println("Bus Ticker Runner.....");

	}

}


