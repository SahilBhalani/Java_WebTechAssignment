package controller;

import java.io.IOException;

import Model.user;
import dao.userdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class registrationcontroller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		user u = new user();
		u.setFname(fname);
		u.setLname(lname);
		u.setMobile(mobile);
		u.setEmail(email);
		u.setPass(pass);

		userdao dao = new userdao();

		if (id.equals(null) || id.equals("")) {
			int i = dao.reguser(u);

			if (i > 0) {
				req.setAttribute("msg", "Registration Successfully");
				req.getRequestDispatcher("Registartion.jsp").forward(req, resp);
			}
		}
		
		else
		{
			int uid=Integer.parseInt(id);
			u.setId(uid);
			
			int i=dao.updateuser(u);
			
			if(i>0)
			{
				req.setAttribute("msg", "Update Successfully");
				req.getRequestDispatcher("Registartion.jsp").forward(req, resp);
			}
			
		}

	}

}
