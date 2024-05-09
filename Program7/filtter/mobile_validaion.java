package filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobile_validaion {

	public static boolean mobilecheck(String mobile) {

		boolean b = false;

		Pattern pattern = Pattern.compile("^\\d{10}$");

		Matcher match = pattern.matcher(mobile);

		b = match.matches();

		return b;

	}

}
