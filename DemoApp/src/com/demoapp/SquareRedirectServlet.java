package com.demoapp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SquareRedirectServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int value=Integer.parseInt(req.getParameter("k"));
		int sq=value*value;
		
		res.getWriter().println("Square is: "+sq);	
		
	}

}
