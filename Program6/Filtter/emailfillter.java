package Filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailfillter 
{
	
	public static boolean emailcheck(String email) {
		
		boolean b = false;
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+@[a-z]+\\.[a-z]+$");
		
		Matcher matcher = pattern.matcher(email);
		
		b =matcher.matches();
		
		return b;
		
	}

}
