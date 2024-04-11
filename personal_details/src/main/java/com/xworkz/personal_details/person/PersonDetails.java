package com.xworkz.personal_details.person;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/details", loadOnStartup = 1)

public class PersonDetails extends HttpServlet {
	public PersonDetails() {
		System.out.println("No-agrument constructor of personDetails");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service method running in personDetails...");
		
		String email=req.getParameter("email");
		String phoneNo=req.getParameter("phone");
		
		String randomValue = getCookieValue(req, "Xworkz");

		if (randomValue == null) {

			/*
			 * randomValue = generateRandomValue();
			 * 
			 * Cookie cookie = new Cookie("Xworkz", randomValue);
			 * 
			 * cookie.setMaxAge(60 * 60);
			 * 
			 * resp.addCookie(cookie);
			 */
			resp.sendRedirect("Error.jsp");
			return ;
			

		}

		req.setAttribute("randomValue", randomValue);

		RequestDispatcher dispatcher = req.getRequestDispatcher("Details.jsp");

		req.setAttribute("Email",email);
		req.setAttribute("PhoneNumber",phoneNo);

		dispatcher.forward(req, resp);

		}

		/*
		 * private String generateRandomValue() {
		 * 
		 * String uuid = UUID.randomUUID().toString();
		 * 
		 * return uuid.substring(0, 20);
		 * 
		 * }
		 */

		private String getCookieValue(HttpServletRequest req, String cookieName) {

		Cookie[] cookies = req.getCookies();

		if (cookies != null) {

		for (Cookie cookie : cookies) {

		if (cookie.getName().equals(cookieName)) {
			
			

		return cookie.getValue();

		}

		}

		}

		return null;

		}

	}


