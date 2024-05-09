package controller;

import java.io.IOException;

import Model.user;
import dao.userdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class updatecontroller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("action");
		int id = Integer.parseInt(req.getParameter("id"));

		userdao dao = new userdao();

		if (action.equals("edit")) {
			
			user user=dao.getalluserbyid(id);
			
			req.setAttribute("edata", user);
			req.getRequestDispatcher("Registartion.jsp").forward(req, resp);
			

		} else if (action.equals("delete")) {

			int i = dao.deleteuser(id);

			if (i > 0) {
				req.getRequestDispatcher("display").forward(req, resp);
			}

		}

	}

}
