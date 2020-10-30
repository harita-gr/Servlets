package com.demoapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddRedirectServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int num1 = Integer.parseInt(req.getParameter("num1")); // From Browser URL - getParameter
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
		
		res.sendRedirect("sqredirect?k="+sum); // URL Rewrite
		
		
	}

}
