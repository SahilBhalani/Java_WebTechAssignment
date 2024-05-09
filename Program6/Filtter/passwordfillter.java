package Filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordfillter 
{
	
	public static boolean passwordcheck(String password) {
		
		boolean b =false;
		
		Pattern pattern =Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%_&])[A-Za-z\\d@#$%_&]{8,}$");
		
		Matcher matcher = pattern.matcher(password);
		
		b=matcher.matches();
		
		return b;
		
	}
	
}
