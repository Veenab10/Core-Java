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
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = "/person", loadOnStartup = 1)

public class PersonServlet extends HttpServlet {
	
	public PersonServlet() {
		System.out.println("No-agrument constructor of personservlet..");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service method running in person servlet..");
		
		String firsName=req.getParameter("name1");
		String lastName=req.getParameter("name2");
		HttpSession session=req.getSession();
		
		
		
		String randomValue = getCookieValue(req, "Xworkz");

		if (randomValue == null) {

		randomValue = generateRandomValue();

		Cookie cookie = new Cookie("Xworkz", randomValue);

		cookie.setMaxAge(60 * 60);

		resp.addCookie(cookie);

		}

		req.setAttribute("randomValue", randomValue);

		RequestDispatcher dispatcher = req.getRequestDispatcher("ContactDetails.jsp");

		req.setAttribute("FirstName",firsName);
		req.setAttribute("LastName",lastName);
		
		session.setAttribute("FirstName",firsName);
		session.setAttribute("LastName",lastName);

		dispatcher.forward(req, resp);

		}

		private String generateRandomValue() {

		String uuid = UUID.randomUUID().toString();

		return uuid.substring(0, 20);

		}

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

		
		/*RequestDispatcher dispatcher=req.getRequestDispatcher("ContactDetails.jsp");
		dispatcher.forward(req, resp);*/
	}


