package program_003;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/showdata")
public class show_data_inconsol extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		
		System.out.println("First Name : "+fname);
		System.out.println("Last Name : "+lname);
		System.out.println("Email : "+email);
		System.out.println("Password is : "+pass);
		System.out.println("Mobile number : "+mobile);
		System.out.println("Gender : "+gender);
		
		
		
		req.setAttribute("fname",fname);
		req.setAttribute("lname",lname);
		req.setAttribute("email",email);
		req.setAttribute("pass",pass);
		req.setAttribute("mobile",mobile);
		req.setAttribute("gender",gender);
		
		req.getRequestDispatcher("view.jsp").forward(req, resp);
		
	}

}
