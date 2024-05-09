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

@WebServlet("/delete_data")
public class deleted_data_controller extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		userdao dao=new userdao();
		
		ArrayList<User> user=dao.deleted_data();
		
		req.setAttribute("d_data", user);
		req.getRequestDispatcher("delete_data.jsp").forward(req, resp);
		
		
	}
	
}
