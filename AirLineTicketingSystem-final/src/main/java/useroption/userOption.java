package useroption;
import passengers.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import signup.Signup;
import signup.Signup_Dao;

@WebServlet("/userOption")
public class userOption extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter ps = res.getWriter();
		String choice = req.getParameter("option");
		switch(choice) {
			case "1": req.getRequestDispatcher("booking.jsp").forward(req, res);
						break;
			case "2": req.getRequestDispatcher("/BookingView").forward(req, res);
						break;
			case "3": req.getRequestDispatcher("/PassengerView").forward(req, res);
						break;
			case "4": req.getRequestDispatcher("deletePassenger.jsp").forward(req, res);
						break;
			default : System.out.print("Inavlid Option");	
		}
	}
}
