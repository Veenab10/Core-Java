package com.xworkz.tomcat_server.servlet;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="beetroot", urlPatterns = "/beetroot" , loadOnStartup = 1)

public class BeetRoot extends HttpServlet {
	
	public BeetRoot() {
		System.out.println("No-arguments constructor of beetroot...");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service running in beetroot....");
		
		System.out.println(request.getRemoteAddr());
		System.out.println("service request is made by:"+request.getRemoteAddr());
		String path=request.getPathInfo();
		String method=request.getMethod();
		String headerAccept=request.getHeader("Accept");
		System.out.println("sec-ch-Us-platform"+request.getHeader("sec-ch-Us-platform"));
		System.out.println("User-Agent"+request.getHeader("User-Agent"));
		
		response.setContentType("text/plgin"); //set the content type
		
		PrintWriter writer=response.getWriter();
		writer.print("The is first response text from service");
	}
	
	

}
