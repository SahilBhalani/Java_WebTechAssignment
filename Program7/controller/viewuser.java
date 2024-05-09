package controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.User;
import dao.userdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewuser")
public class viewuser extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		userdao dao=new userdao();
		ArrayList<User> user=dao.viewalluser();
		
		req.setAttribute("data", user);
		req.getRequestDispatcher("viewuser.jsp").forward(req, resp);
		
	}
	
}
