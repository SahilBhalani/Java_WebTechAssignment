package controller;

import java.io.IOException;

import Model.User;
import dao.userdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class registrationcontroller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String gender = req.getParameter("gender");
		String pass = req.getParameter("pass");

		User user = new User();
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setGender(gender);
		user.setPass(pass);

		userdao dao = new userdao();

		if (id.equals("")) {

			int i = dao.adduser(user);
			if (i > 0) {
				req.setAttribute("msg", "Registartion successfully");
				req.getRequestDispatcher("Registartion.jsp").forward(req, resp);
				
			}
		}

		else {
			
			int uid = Integer.parseInt(id);
			user.setId(uid);
			
			int i = dao.updateuser(user);
			
			if (i > 0) {
				req.setAttribute("msg", "Update Successfully");
				req.getRequestDispatcher("Registartion.jsp").forward(req, resp);
			}

		}

	}

}
