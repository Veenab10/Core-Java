package com.xworkz.inheritance.exception;

public class Movie {
	
	public void ticketNo(int ticketNo) throws InValidTicketNoException  
	{
		if(ticketNo >0 && ticketNo<5000)
		{
			System.out.println("Valid Ticket");
		}
		else
		throw new InValidTicketNoException("Invalid Ticket Number");
		
	}

}
