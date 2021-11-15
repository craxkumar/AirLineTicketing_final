package passengers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PassengerView")
public class PassengerView extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
 
		List<Passenger> list = PassengerDao.getAllPassengers();
//		String cssTag="<link rel='stylesheet' type='text/css' href='sty1.css'>";
			    out.println("<html>");
//			    out.println("<head><title>Title Name</title>"+cssTag+"</head>");
			    out.println("<body>");
//		out.print("<table>");
//		out.print("<tr><th>Passenger Id</th><th>Name</th><th>Age</th><th>Gender</th></tr>");
//		for (Passenger s : list) {
//			out.print("<tr><td>" + s.getP_id() + "</td><td>" + s.getP_name() + "</td><td>" + s.getP_age() + "</td><td>"
//					+ s.getP_gender() + "</td>" + "</tr>");
//		}
//		out.print("</table></body></html>");
	}
}
