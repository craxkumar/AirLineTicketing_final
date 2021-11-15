package booking;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import java.sql.*;
import java.util.List;
	@WebServlet("/BookingView")  
	public class FlightView extends HttpServlet {  
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			List<Book> list = BookDao.getAllBooks();
			out.print("<head><link rel=\"stylesheet\" href=\"index.css\" /></head>");
			out.print("<table border='1' width='100%'");
			out.print(
					"<tr><th>BookID</th><th>Source</th><th>Destination</th><th>No of passengers</th><th>Date of journey</th></tr>");
			for (Book s : list) {
				out.print("<tr><td>" + s.getBookid() + "</td><td>" + s.getSource() + "</td><td>" + s.getDestination() + "</td><td>"
						+ s.getNoofpassengers() + "</td><td>" + s.getDateofjourney() +"</td></tr>");
			}
		}  
	 }  