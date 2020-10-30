package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username=req.getParameter("uname");
		String password=req.getParameter("password");
		
		RequestDispatcher rd= null;
		// FORWARD()
		if(username.equalsIgnoreCase("tom") && password.equals("jerry")) {
			rd=req.getRequestDispatcher("SuccessServlet");
			rd.forward(req, resp);	
		// INCLUDE()
		}else {
			rd=req.getRequestDispatcher("login.html");
			PrintWriter out=resp.getWriter();
			rd.include(req, resp); // HTML page output + output of else condition will be printed
			out.println("<center><span style = 'color:red'> Invalid Credentials!! </span> </center>");
			
		}
		
	}

}
