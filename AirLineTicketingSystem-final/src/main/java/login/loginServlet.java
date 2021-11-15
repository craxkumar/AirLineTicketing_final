package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import signup.*;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			PrintWriter out = res.getWriter();
			Connection con = Signup_Dao.getConnection();
			PreparedStatement pStatement = con.prepareStatement("select * from  Users");
			ResultSet rs = pStatement.executeQuery();
			String userName = req.getParameter("username");
			String pass = req.getParameter("password");
			HashMap<String, String> userMap = new HashMap<String, String>();
			while(rs.next()) {
				userMap.put(rs.getString(2), rs.getString(3));
			}
			if(userMap.containsKey(userName) && userMap.get(userName).equals(pass)) {
				out.print("<p><b>User logged in  Successfully !!!!</b></p>");
				req.getRequestDispatcher("main.jsp").forward(req, res);
			}
			else {
				out.print("<p><b>Invalid password !!!!</b></p>");
				req.getRequestDispatcher("index.jsp").forward(req, res);
				
			}
			con.close();
		} catch (Exception ex) {
			ex.getStackTrace();
		}
	}
}

