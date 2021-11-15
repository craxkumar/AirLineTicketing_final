package signup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Sign_Up_Servlet")
public class Sign_Up_Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter ps = res.getWriter();

		String unameString = req.getParameter("newuser");
		String passString = req.getParameter("newpass");
		String conPass = req.getParameter("conpass");

		Signup s = new Signup();
		s.setUsername(unameString);
		s.setPassword(passString);

		if (passString.equals(conPass)) {
			int status = Signup_Dao.save(s);
			if (status > 0) {
				ps.print("<script>alert('User Created Successfully !!!!')</script>");
				req.getRequestDispatcher("login.jsp").include(req, res);
			} else {
				ps.print("<p><b>User not Created!</b></p>");
			}
		}
		else {
//			
			ps.print("<script>alert('User could not be Created !!!!')</script>");
			req.getRequestDispatcher("signin.jsp").include(req, res);
		}
	}
}
