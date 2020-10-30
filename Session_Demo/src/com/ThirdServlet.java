package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
         HttpSession session = request.getSession(false); // Passing false to indicate no need to create new session. use existing one.
		
		if(session!=null) // If session is already existing
		{
			User u= (User) session.getAttribute("user");
			u.setCity(request.getParameter("city"));
			u.setContact(Integer.parseInt(request.getParameter("contact")));
		
			session.setAttribute("user", u); //key-value 
			
			PrintWriter out = response.getWriter();
			out.println("<h2> Hello "+u.getFname()+" "+u.getLname() +"</h2>");
			out.println("Please Verify your details: \n");
			out.println(u.toString());
			out.println("<h4> Session ID: "+session.getId()+"</h4>");
			out.println("<h4>Created at: "+session.getCreationTime()+"</h4>");
			session.invalidate(); //Destroys/Delete Session similar to Log off
		}
		
		
	}

}
