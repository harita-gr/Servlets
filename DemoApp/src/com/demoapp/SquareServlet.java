package com.demoapp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int value=(int) req.getAttribute("sum");
		int sq=value*value;
		
		res.getWriter().println("Square is: "+sq);
		
		
	}

}
