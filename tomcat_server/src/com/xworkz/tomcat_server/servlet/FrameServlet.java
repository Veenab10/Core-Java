package com.xworkz.tomcat_server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="frameServlet",urlPatterns = "/frame", loadOnStartup = 1)

public class FrameServlet extends  HttpServlet {
	
	public FrameServlet() {
		System.out.println("No-argument constructor of FrameServlet..");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service running in FrameServlet....");
	}
	
	
	
	

}
