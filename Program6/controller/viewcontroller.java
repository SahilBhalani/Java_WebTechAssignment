package controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.user;
import dao.userdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class viewcontroller extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		userdao dao=new userdao();
		ArrayList<user> users=dao.viewuser();
		
		req.setAttribute("data", users);
		req.getRequestDispatcher("userview.jsp").forward(req, resp);
		
		
	}
	
}
