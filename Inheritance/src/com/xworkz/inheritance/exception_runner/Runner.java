package com.xworkz.inheritance.exception_runner;

import com.xworkz.inheritance.exception.Movie;
import com.xworkz.inheritance.exception.InValidTicketNoException;

public class Runner {

	public static void main(String[] args) {
		Movie valid=new Movie();
		System.out.println("Before Event...");
		try {
			valid.ticketNo(4);
			System.out.println("After Event..");
		} 
		catch (InValidTicketNoException e) {
			System.err.println("Movie Ticket");
			System.err.println(e.getMessage());
			System.err.println(e.getStackTrace());
			System.err.println(e.getClass());
		}
		System.out.println("Ticker Running...");
	}

}
