package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginservlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		ServletContext context = req.getServletContext();
		
		String username=context.getInitParameter("uname");
		
		pw.print("Username is : "+username+" ");
		
		
		String password=context.getInitParameter("pass");
		pw.print(" Password Is : "+password);
		
		
		 
	}
	
	
}
