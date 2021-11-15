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
		String cssTag="<link rel='stylesheet' type='text/css' href='sty1.css'>";
		//String css2="<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css'"
		//		+"rel='stylesheet'>";
		String css2="<link href=\'https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\' rel=\'stylesheet\' integrity=\'sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\'crossorigin=\'anonymous\'>";
		
				out.println("<html>");
			    out.println("<head><title>Title Name</title>"+cssTag+""+css2+"</head>");
			    out.println("<body>"
			    		+" <h1 id='h'>CoMake AIRLINES</h1>" 
			            +"   <nav class=\"navbar navbar\">\r\n"
			    		+ "    <ul class=\"nav nav-tabs\">\r\n"
			    		+ "        <li class=\"nav-item\">\r\n"
			    		+ "          <a class=\"nav-link\" aria-current=\"page\" href=\"index.jsp\">HOME</a>\r\n"
			    		+ "        </li>\r\n"
			    		+ "        <li class=\"nav-item\">\r\n"
			    		+ "          <a class=\"nav-link\" href=\"abt.jsp\">ABOUT US</a>\r\n"
			    		+ "        </li>\r\n"
			    		+ "        <li class=\"nav-item\">\r\n"
			    		+ "          <a class=\"nav-link\" href=\"UserOption.jsp\">USER OPTIONS</a>\r\n"
			    		+ "        </li>\r\n"
			    		+ "        <li class=\"nav-item\">\r\n"
			    		+ "          <a class=\"nav-link\" href=\"signin.jsp\">SIGNUP</a>\r\n"
			    		+ "        </li>\r\n"
			    		+ "      </ul>\r\n"
			    		+ "    </nav>");
		out.print("<table border='1'>");
		out.print("<tr><th>Passenger Id</th><th>Name</th><th>Age</th><th>Gender</th></tr>");
		for (Passenger s : list) {
			out.print("<tr><td>" + s.getP_id() + "</td><td>" + s.getP_name() + "</td><td>" + s.getP_age() + "</td><td>"
					+ s.getP_gender() + "</td>" + "</tr>");
		}
		out.print("</table></body></html>");
	}
}
