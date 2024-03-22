package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deathPerson", loadOnStartup = 1)

public class DeathServlet extends HttpServlet {
	
	public DeathServlet() {
		System.out.println("no-argument constructor of DeathServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in deathServlet..");
		String name=req.getParameter("name");
		System.out.println(name);
		String age=req.getParameter("age");
		System.out.println(age);
		String deathDate=req.getParameter("deathDate");
		System.out.println(deathDate);
		String place=req.getParameter("place");
		System.out.println(place);
		String city=req.getParameter("city");
		System.out.println(city);
		String state=req.getParameter("state");
		System.out.println(state);
		String country=req.getParameter("country");
		System.out.println(country);
		String gender=req.getParameter("gender");
		System.out.println(gender);
		String cause=req.getParameter("cause");
		System.out.println(cause);
		String relationship=req.getParameter("relationship");
		System.out.println(relationship);
		
		
		
		PrintWriter write=resp.getWriter();
		resp.setContentType("text/plain");
		write.write("Death certificate is processing....");
		
		write.write("Name:"+name+"\n"+"Age:"+age+"\n"+"Death Date:"+deathDate+"\n"+"Place:"+place+"city:"+city+"\n"+"state:"+state+"\n"+"country:"+country+"\n"+"gender:"+gender+"cause:"+cause+"\n"+"relationship:"+relationship);
		
	}

}
