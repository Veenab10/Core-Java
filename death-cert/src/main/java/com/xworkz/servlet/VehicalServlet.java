package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/vehicalForm", loadOnStartup = 2)

public class VehicalServlet extends HttpServlet {
	
	public VehicalServlet() {
		System.out.println("no-argument constructor of vehicalservlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in Vehical servlet");
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String number=req.getParameter("number");
		String date=req.getParameter("date");
		String cost=req.getParameter("cost");
		String desc=req.getParameter("desc");
		String task=req.getParameter("task");
		String model=req.getParameter("model");
		String numberPlate=req.getParameter("numberPlate");
		String year=req.getParameter("year");
		String type=req.getParameter("type");
		
		PrintWriter write=resp.getWriter();
		resp.setContentType("text/plain");
		write.write("Vehicle service is processing....");
		write.write("name:"+name+"\n"+"address:"+address+"\n"+"email:"+email+"\n"+"number:"+number+"\n"+"date:"+date+"\n"+"cost:"+cost+"\n"+"desc:"+desc+"\n"+"task:"+task+"\n"+"model:"+model+"\n"+"numberPlate:"+numberPlate+"year:"+year+"\n"+"type:"+type);
	}

}
