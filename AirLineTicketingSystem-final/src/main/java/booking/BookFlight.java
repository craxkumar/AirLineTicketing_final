package booking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.*;
@WebServlet("/BookFlight")
public class BookFlight extends HttpServlet  {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		        throws ServletException, IOException { 
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
         
        int  bookid=(int)((Math.random()*123)%1000);
        String source=request.getParameter("source");  
        String destination=request.getParameter("destination");  
        int noofpassengers= Integer.parseInt(request.getParameter("noofpassengers")); 
        String dateofjourney=request.getParameter("date");  
        
        
       
        
        Book b=new Book();
        
        
        b.setSource(source);
        b.setDestination(destination);
        b.setDateofjourney(dateofjourney);
        b.setBookid(bookid);
        b.setNoofpassengers(noofpassengers);
        
        
        BookDao br = new BookDao();
        
        try{
            int s1=br.save(b);
        if(s1>=1){
//        	System.out.println(noofpassengers);
        	out.print("<script>alert('Saved')</script>");
        	request.setAttribute("noofp", noofpassengers);
//        	
        	request.getRequestDispatcher("passengerBooking.jsp").include(request,response);
        }
        else 
        {
           
        out.print("Cannot send to database");
        }
    
        out.close();  

        }catch(Exception e){out.println(e);}
    }  
	
	}


