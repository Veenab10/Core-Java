package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/gym", loadOnStartup = 3)

public class GymServlet extends HttpServlet {
	
	public GymServlet() {
		System.out.println("no-agrument constructor of gymservlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("service running in gymservlet");
	 String name=req.getParameter("name");
	 System.out.println(name);
	 String age=req.getParameter("age");
	 System.out.println(age);
	 String address=req.getParameter("address");
	 System.out.println(address);
	 String gender=req.getParameter("gender");
	 System.out.println(gender);
	 String height=req.getParameter("height");
	 System.out.println(height);
	 
	 PrintWriter write=resp.getWriter();
	resp.setContentType("text/plain");
	write.write("Gym form is processing");
	write.write("name:"+name+"\n"+"age:"+age+"\n"+"address:"+address+"\n"+"gender:"+gender+"\n"+"height:"+height);
	}

}
