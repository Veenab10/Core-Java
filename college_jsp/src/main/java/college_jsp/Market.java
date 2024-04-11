package college_jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/market", loadOnStartup = 1)

public class Market  extends HttpServlet{
	
	public Market() {
		System.out.println("No-agrument constructor of market");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service method running in market..");
		String market=req.getParameter("market");
		String location=req.getParameter("location");
		String city=req.getParameter("city");
		String pincode=req.getParameter("pincode");
		String area=req.getParameter("area");
		String type=req.getParameter("type");
		String stallNo=req.getParameter("stallNo");
		String itemName=req.getParameter("itemName");
		String itemQuantity=req.getParameter("itemQuantity");
		String itemCost=req.getParameter("itemCost");
		String owner=req.getParameter("owner");
		String kebNo=req.getParameter("kebNo");
		String gst=req.getParameter("gst");
		String transaction=req.getParameter("transaction");
		
		req.setAttribute("MarketName", market);
		req.setAttribute("locationName",location);
		req.setAttribute("cityName",city);
		req.setAttribute("pincodeNumber",pincode);
		req.setAttribute("areaName",area);
		req.setAttribute("Markettype",type);
		req.setAttribute("stallNumber",stallNo);
		req.setAttribute("ItemName",itemName);
		req.setAttribute("ItemQuantity",itemQuantity);
		req.setAttribute("ItemCost",itemCost);
		req.setAttribute("ownerName",owner);
		req.setAttribute("kebNo",kebNo);
		req.setAttribute("gst",gst);
		req.setAttribute("transaction",transaction);
		
		/*
		 * RequestDispatcher dispatcher=req.getRequestDispatcher("MarketResult.jsp");
		 * dispatcher.forward(req, resp);
		 */
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("MarketResult.jsp");
		dispatcher.forward(req, resp);
		
		
		
		
	}

}
