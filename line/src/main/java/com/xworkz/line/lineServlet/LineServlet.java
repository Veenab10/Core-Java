package com.xworkz.line.lineServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="lineServlet", urlPatterns ="/click", loadOnStartup = 1)

public class LineServlet extends HttpServlet{
	
	public LineServlet() {
		System.out.println("No-agrument constructor of LineServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   System.out.println("service running in lineservlet");
	   resp.setContentType("text/plain");
	   PrintWriter writer=resp.getWriter();
	   writer.write("message written from servlet");
	   
	   
	}

}
