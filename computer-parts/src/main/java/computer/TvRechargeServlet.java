package computer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="TvRechargeServlet",urlPatterns = "/tv", loadOnStartup = 1)

public class TvRechargeServlet extends HttpServlet{
	
	public TvRechargeServlet() {
		System.out.println("no-agrument constructor of tv recharge servlet");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in tv recharge servlet");
		String customerId=req.getParameter("customerId");
		String vendor=req.getParameter("vendor");
		String amount=req.getParameter("amount");
		String rechargeType=req.getParameter("rechargeType");
		String check=req.getParameter("check");
		
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		
		
		writer.write("<html>");
		writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		writer.write("<body>");
		writer.write("<nav class=\"navbar navbar-dark bg-primary\"><div><a class=\"navbar-brand\" href=\"index.html\">Home </a> <a class=\"navbar-brand\" href=\"ComputerPart.html\">ComputerPart </a></div></nav>");
		writer.write("<b>");
		writer.write("Thanks for recharging");
		writer.write("customerId:"+customerId);
		writer.write("</b>");
		writer.write("</body>");
		writer.write("</html>");
		
		
	}

}
