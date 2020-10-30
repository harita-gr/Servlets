package com.demoapp;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareSessionServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		/**Using Session**/
//		HttpSession session = req.getSession();
//		int value = (int) session.getAttribute("k");	
		
		/**Using Cookie**/
		int value = 0;
		Cookie[] cookies = req.getCookies();
		for(Cookie c:cookies)
		{
			if (c.getName().equals("k"))	
				value=Integer.parseInt(c.getValue());
		}
			
		int sq=value*value;
		
		res.getWriter().println("Square is: "+sq);
		
		
	}

}
