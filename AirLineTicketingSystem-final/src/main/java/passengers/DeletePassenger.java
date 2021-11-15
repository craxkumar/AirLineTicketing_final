package passengers;

import booking.*;
import passengers.PassengerDao;
import signup.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.swing.text.AbstractDocument.BranchElement;

@WebServlet("/DeletePassenger")
public class DeletePassenger extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int p_id = Integer.parseInt(req.getParameter("pid"));
		int status=0;
		try {
			status = PassengerDao.DeletePassenger(p_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(status>0) {
			out.print("<script>alert('User Deleted succesfully!')</script>");
			req.getRequestDispatcher("/PassengerView").include(req,res);
		}
		else {
			out.print("<script>alert('Invalid user ID!')</script>");
			req.getRequestDispatcher("deletePassenger.jsp").include(req,res);
			
		}
		out.close();
	}
	

}
