package filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password_validation {

	public static boolean passcheck(String pass) {
		boolean b = false;

		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%_&])[A-Za-z\\d@#$%_&]{8,}$");

		Matcher match = pattern.matcher(pass);

		b = match.matches();

		return b;

	}

}
