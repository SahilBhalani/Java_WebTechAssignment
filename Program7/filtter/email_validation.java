package filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_validation {

	public static boolean emailcheck(String email) {
		boolean b = false;

		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

		Matcher match = pattern.matcher(email);

		b = match.matches();
		
		return b;

	}

}
