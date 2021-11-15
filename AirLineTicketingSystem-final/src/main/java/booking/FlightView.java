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
		String cssTag = "<link rel='stylesheet' type='text/css' href='style.css'>";
		String css2 = "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">";
		out.println("<html>");
		out.println("<html>");
		out.println("<head><title>Title Name</title>" + cssTag+" "+css2+ "</head>");
		out.println("<body>" + " <center><span>coMake Airlines</span></center>" + "   <nav class=\"navbar navbar\">\r\n"
				+ "    <ul class=\"nav nav-tabs\">\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" aria-current=\"page\" href=\"index.jsp\">HOME</a>\r\n"
				+ "        </li>\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"abt.jsp\">ABOUT US</a>\r\n" + "        </li>\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"UserOption.jsp\">USER OPTIONS</a>\r\n" + "        </li>\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"signin.jsp\">SIGNUP</a>\r\n" + "        </li>\r\n"
				+ "      </ul>\r\n" + "    </nav>");
		out.print("<table border='1'");
		out.print(
				"<tr><th>BookID</th><th>Source</th><th>Destination</th><th>No of passengers</th><th>Date of journey</th></tr>");
		for (Book s : list) {
			out.print("<tr><td>" + s.getBookid() + "</td><td>" + s.getSource() + "</td><td>" + s.getDestination()
					+ "</td><td>" + s.getNoofpassengers() + "</td><td>" + s.getDateofjourney() + "</td></tr>");
		}
	}
}