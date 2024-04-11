package computer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pg", loadOnStartup = 1)

public class PgFormServlet extends HttpServlet {
	
	public PgFormServlet() {
	System.out.println("no-agrument constructor of pgformservlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service running in pgFormServlet");
		String name=req.getParameter("name");
		System.out.println(name);
		
		String number=req.getParameter("number");
		System.out.println(number);
		
		String language=req.getParameter("language");
		System.out.println(language);
		
		String documents=req.getParameter("documents");
		System.out.println(documents);
		
		String share=req.getParameter("share");
		System.out.println(share);
		
		String checkbox=req.getParameter("checkbox");
		System.out.println(checkbox);
		
		PrintWriter write=resp.getWriter();
		resp.setContentType("text/html");
		
		write.write("<html>");
		write.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		write.write("<body>");
		write.write("<nav class=\"navbar navbar-dark bg-primary\"><div><a class=\"navbar-brand\" href=\"index.html\">Home </a> <a class=\"navbar-brand\" href=\"ComputerPart.html\">ComputerPart </a></div></nav>");
		write.write("<b>");
		write.write("Thank you"+"<br>");
		write.write("name:"+name+"<br>");
		write.write("number:"+number+"<br>");
		write.write("language:"+language+"<br>");
		write.write("documents:"+documents+"<br>");
		write.write("share:"+share+"<br>");
		write.write("checkbox:"+checkbox+"<br>");
		write.write("</b>");
		write.write("</body>");
		write.write("</html>");
		
		
	}

}
