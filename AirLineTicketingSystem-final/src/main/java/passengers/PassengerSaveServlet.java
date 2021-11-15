package passengers;

import booking.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.swing.text.AbstractDocument.BranchElement;

@SuppressWarnings("serial")
@WebServlet("/PassengerSaveServlet")
public class PassengerSaveServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String p_name = req.getParameter("p_name");
		int p_age = Integer.parseInt(req.getParameter("p_age")); 
		String p_gender = req.getParameter("p_gender");			
		
		Passenger p=new Passenger();
		p.setP_name(p_name);
		p.setP_age(p_age);
		p.setP_gender(p_gender);
		
		
		int status=PassengerDao.save(p);
		int count=0;
		if(req.getParameter("noofp") != null) {
			count = Integer.parseInt(req.getParameter("noofp"));
			HttpSession session=req.getSession(false);  
			session.setAttribute("count",count); 
		}
		HttpSession session1=req.getSession(false);
		int n=(int)session1.getAttribute("count");
		if(status>0) {
			n--;
			session1.setAttribute("count",n); 
			if(n==0) {
				out.print("<script>alert('Saved')</script>");
				req.getRequestDispatcher("/PassengerView").include(req,res);
			}
			else {
			out.print("<script>alert('Saved')</script>");
			req.getRequestDispatcher("pb2.jsp").include(req,res);
			}
		}
		else {
			out.print("<h4>Sorry! Unable to save record</h4>");
		}
		out.close();
	}
	

}