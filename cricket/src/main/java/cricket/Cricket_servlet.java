package cricket;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cricket", loadOnStartup = 1)

public class Cricket_servlet extends HttpServlet {
	
	public Cricket_servlet() {
		System.out.println("No-agrument constructor of cricket servlet");
	}
	
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("service method running in cricket servlet class...");
	
	String name=req.getParameter("name");
	System.out.println("Name:"+name);
	req.setAttribute("Name",name);//key-value(use key in response(result) jsp file)
	boolean cookieExists = false;
    Cookie[] cookies = req.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("my_cookie")) {
                cookieExists = true;
                break;
            }
        }
    }

    if (cookieExists) {
        // If the cookie already exists, send a message
        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Cookie 'my_cookie' already exists!</h1>");
        resp.getWriter().println("</body></html>");
    } else {
        // If the cookie doesn't exist, create and set it
    	String cookieValue = generateRandomAlphaNumeric(100);
        Cookie cookie = new Cookie("my_cookie", cookieValue);
        cookie.setMaxAge(24 * 60 * 60); // Cookie will expire in 1 day
        resp.addCookie(cookie);

        // Send a response
        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Cookie 'my_cookie' Set!</h1>");
        resp.getWriter().println("</body></html>");
    }
}

// Method to generate a random alphanumeric string of a specified length
private String generateRandomAlphaNumeric(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
        int index = random.nextInt(characters.length());
        sb.append(characters.charAt(index));
    }
    return sb.toString();
}

}
	RequestDispatcher dispatcher=req.getRequestDispatcher("CricketResult.jsp");
		
	dispatcher.forward(req, resp);

}
}
