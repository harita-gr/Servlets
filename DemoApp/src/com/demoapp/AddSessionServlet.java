package com.demoapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddSessionServlet extends HttpServlet {
	
	public void  doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
		
		/**Using Session**/
		
//		HttpSession session=req.getSession();
//		session.setAttribute("k", sum);
	
		/**Using Cookie**/
		
		Cookie cookie = new Cookie("k", sum+""); //Cookie value should be String. Hence appending sum with "" to make int to string
		res.addCookie(cookie);
		
		res.sendRedirect("sqsession");
		
		
	}

}
