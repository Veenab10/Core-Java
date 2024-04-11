package college_jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/college", loadOnStartup = 1)

public class Message_Servlet extends HttpServlet {
	
	public Message_Servlet() {
		System.out.println("no-agrument constructor of college_servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Service method running in college servlet...");
	String messages=req.getParameter("messages");
	RequestDispatcher dispatcher=req.getRequestDispatcher("Message.jsp");
	//RequestDispatcher dispatcher=req.getRequestDispatcher("SetCookiesServlet.jsp");
	req.setAttribute("messages1",messages);
	dispatcher.forward(req, resp);
	}
	

}
