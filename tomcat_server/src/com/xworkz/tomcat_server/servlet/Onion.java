package com.xworkz.tomcat_server.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="onion", urlPatterns = "/onion", loadOnStartup = 3)

public class Onion extends HttpServlet{
	public Onion() {
		System.out.println("no-parameter constructor of onion...");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service running in onion....");
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
