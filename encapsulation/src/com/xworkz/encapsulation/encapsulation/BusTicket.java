package com.xworkz.encapsulation.encapsulation;

public class BusTicket {
	
	public void invalidBusTicket(int busTicketNo) throws BusTicketException
	{
		if(busTicketNo>0 && busTicketNo<7000)
		{
			System.out.println("Valid Bus Ticket Number...");
		}
		else
		throw new BusTicketException("Invalid Bus Ticket Number...");
	}
	
	public void invalidSleeperTicketNo(int invalidSleeperTicketNo) throws InvalidSleeperTicketNoException
	{
		if(invalidSleeperTicketNo==1999)
		{
			System.out.println("Valid sleeper Bus Ticket Number");
		}
		else
		throw new InvalidSleeperTicketNoException("Invalid Sleeper Bus Ticket Number...");
	}
	
	public void invalidSeaterTicketNo(String gender) throws InvalidSeaterBusTicketNoException
	{
		if(gender.equals("female"))
		{
			System.out.println(" Valid Seater Bus Number");
		}
		else
		
		throw new InvalidSeaterBusTicketNoException(" Gender is not match");
	}

}
