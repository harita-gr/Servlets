package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//Create object of User,HttpSession
		
		User u = new User();
		HttpSession session = req.getSession();
		
		u.setFname(req.getParameter("fname"));
		u.setLname(req.getParameter("lname"));
		session.setAttribute("user", u); //key-value 
		resp.sendRedirect("Two.html");
		
		
		
	}

}
