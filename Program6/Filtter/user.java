package Filtter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/add")
public class user extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		RequestDispatcher rd = req.getRequestDispatcher("Registartion.jsp");

		if (fname.equals(null) || fname.equals("")) {
			req.setAttribute("fnameerr", "Firstname required");
			rd.forward(req, resp);
		} else if (!firstnamefilterr.firstnamecheck(fname)) 
		{
			req.setAttribute("fnameerr", "Firstname format is Invalid");
			rd.forward(req, resp);
		}
		if (lname.equals(null) || lname.equals("")) {
			req.setAttribute("lnameerr", "Lastname format is Invalid");
			rd.forward(req, resp);
		}
		else if (!lastnamefiltter.lastnamecheck(lname)) 
		{
			req.setAttribute("lnameerr", "Lastname format is invalid");
			rd.forward(req, resp);
		}
		if (mobile.equals(null) || mobile.equals("")) {
			req.setAttribute("mobileerr", "Mobile number is required");
			rd.forward(req, resp);
		}
		else if (!mobilefillter.mobilecheck(mobile)) {
			req.setAttribute("mobileerr", "Invalid Mobile format");
			rd.forward(req, resp);

		}
		
		if (email.equals(null) || email.equals("")) {
			req.setAttribute("emailerr", "Email required");
			rd.forward(req, resp);
		}
		
		else if (!emailfillter.emailcheck(email)) 
		{
				
			req.setAttribute("emailerr", "Invalid email format");
			rd.forward(req, resp);

		}
		if (pass.equals(null) || pass.equals("")) {
			req.setAttribute("passerr", "Password format is Invalid");
			rd.forward(req, resp);
		}
		
		else if (!passwordfillter.passwordcheck(pass)) {
			
			req.setAttribute("passerr", "Invalid password format");
			rd.forward(req, resp);
		}

		chain.doFilter(req, resp);

	}

}
