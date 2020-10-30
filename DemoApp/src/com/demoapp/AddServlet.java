package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
		
		System.out.println("Result is: "+sum);
		
		/** Without creating Response Object **/
	
		res.getWriter().println("Result is: "+sum); 
		
		/** By creating separate object **/ 
		
//			PrintWriter out = res.getWriter();
//			out.println("Result is: "+sum);
		
		//Session Management. Set the attribute (K,V) of response to pass value to next Servlet
		req.setAttribute("sum", sum);		
		
		//Request Dispatch & Redirect
		RequestDispatcher rd = req.getRequestDispatcher("sq"); //next URL
		rd.forward(req,res); //Forwarding the request & response object to new Servlet
	}

}
