package filtter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class Registartionfiltter extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		//String gender = request.getParameter("gender");
		String pass = request.getParameter("pass");

		RequestDispatcher rd = request.getRequestDispatcher("Registartion.jsp");

		if (fname.equals(null) || fname.equals("")) {
			request.setAttribute("fnameerr", "Firstname Required");
			rd.forward(request, response);
		} else if (!firstname_validation.firstnamecheck(fname)) {
			request.setAttribute("fnameerr", "Invalid Firstname format");
			rd.forward(request, response);
		}

		if (lname.equals(null) || lname.equals("")) {
			request.setAttribute("lnameerr", "Lastname Required");
			rd.forward(request, response);
		}

		else if (!lastname_validation.lastnamecheck(lname)) {
			request.setAttribute("lnameerr", "Invalid lastname format");
			rd.forward(request, response);
		}

		if (email.equals(null) || email.equals("")) {
			request.setAttribute("emailerr", "Email Required");
			rd.forward(request, response);
		}

		else if (!email_validation.emailcheck(email)) {
			request.setAttribute("emailerr", "Invalid email format");
			rd.forward(request, response);
		}

		if (mobile.equals(null) || mobile.equals("")) {
			request.setAttribute("mobileerr", "Mobile number Required");
			rd.forward(request, response);
		}

		else if (!mobile_validaion.mobilecheck(mobile)) {
			request.setAttribute("mobileerr", "Invalid Mobile format");
			rd.forward(request, response);
		}

		if (pass.equals(null) || pass.equals("")) {
			request.setAttribute("passerr", "Password Required");
			rd.forward(request, response);
		}

		else if (!password_validation.passcheck(pass)) {
			request.setAttribute("passerr", "Invalid password Format");
			rd.forward(request, response);
		}

		chain.doFilter(request, response);
	}

}
