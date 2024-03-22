package computer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/computer", loadOnStartup = 1)

public class ComputerServlet extends HttpServlet{
	
	public ComputerServlet() {
	System.out.println("no-agrument constructor of ComputerServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service running in Computer Servlet");
		String brand=req.getParameter("brand");
		System.out.println(brand);
		
		String model=req.getParameter("model");
		System.out.println(model);
		
		String color=req.getParameter("color");
		System.out.println(color);
		
		//String type=req.getParameter(color);
		//System.out.println(type);
		
		String ram=req.getParameter("ram");
		System.out.println(ram);
		
		String disk=req.getParameter("disk");
		System.out.println(disk);
		
		String processor=req.getParameter("processor");
		System.out.println(processor);
		
		String generation=req.getParameter("generation");
		System.out.println(generation);
		
		String cache=req.getParameter("cache");
		System.out.println(cache);
		
		String cost=req.getParameter("cost");
		System.out.println(cost);
		
		Long cost1=Long.parseLong(cost);
		System.out.println(cost1);
		
						
		String quantity=req.getParameter("quantity");
		System.out.println(quantity);
		
		Integer quantity1=Integer.parseInt(quantity);
		System.out.println(quantity1);
		
		long total=cost1*quantity1;
		System.out.println("Total Cost:"+total);
		
						
		PrintWriter write=resp.getWriter();
		resp.setContentType("text/html");
		//write.write("Total Cost:"+total);
		write.write("<html>");
		write.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		
		write.write("<body>");
		//write.write("<div>");
		write.write("<nav class=\"navbar navbar-dark bg-primary\"><div><a class=\"navbar-brand\" href=\"index.html\">Home </a> <a class=\"navbar-brand\" href=\"ComputerPart.html\">ComputerPart </a></div></nav>");
		
		
		
		//write.write("</div>");
		write.write("<div>");
		write.write("<h1>"+ "Computer parts is under processing"+"</h>"+"<br>");
		write.write("<b>"+"Total Cost:"+total+"</b>");
		write.write("</div>");
		write.write("</body>");
		write.write("</html>");
		//write.write("Brand:"+brand+"\n"+"model:"+model+"\n"+"color:"+color+"\n"+"ram:"+ram+"\n"+"processor:"+processor+"\n"+"generation:"+generation+"\n"+"cache:"+cache+"\n"+"cost:"+cost+"\n"+"quantity:"+quantity);
	}

}
