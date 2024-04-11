package college_jsp;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookieServlet")
public class SetCookieServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Check if the cookie with ID "my_cookie" already exists
        boolean cookieExists = false;
        Cookie[] cookies = request.getCookies();
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
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h1>Cookie 'my_cookie' already exists!</h1>");
            response.getWriter().println("</body></html>");
        } else {
            // If the cookie doesn't exist, create and set it
        	String cookieValue = generateRandomAlphaNumeric(100);
            Cookie cookie = new Cookie("my_cookie", cookieValue);
            cookie.setMaxAge(24 * 60 * 60); // Cookie will expire in 1 day
            response.addCookie(cookie);

            // Send a response
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h1>Cookie 'my_cookie' Set!</h1>");
            response.getWriter().println("</body></html>");
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
