package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class registration extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		ServletConfig cf=getServletConfig();
		String uname=cf.getInitParameter("uname");
		String pass=cf.getInitParameter("pass");
		
		pw.append("Username is :  "+uname);
		
		pw.append(" Password is : "+pass);
		
		
	}

}
