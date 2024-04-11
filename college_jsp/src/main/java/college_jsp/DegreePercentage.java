package college_jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/degree", loadOnStartup = 1)

public class DegreePercentage extends HttpServlet{
	
	public DegreePercentage() {
		System.out.println("no-agrument constructor of degree percentage");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service method running in  degree percentage");
		String name =req.getParameter("name");
		String email =req.getParameter("email");
		String college =req.getParameter("college");
		String degree =req.getParameter("degree");
		String branch =req.getParameter("branch");
		String percentage =req.getParameter("percentage");
		
		
		req.setAttribute("Name", name);
		req.setAttribute("Email", email);
		req.setAttribute("College", college);
		req.setAttribute("Degree", degree);
		req.setAttribute("Branch", branch);
		req.setAttribute("Percentage", percentage);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("DegreeResult.jsp");
		dispatcher.forward(req, resp);
		
	}

}
