package Filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobilefillter 
{
	
	public static boolean mobilecheck(String mobile) {
		
		boolean b=false;
		
		Pattern pattern = Pattern.compile("^\\d{10}$");
		
		Matcher matcher = pattern.matcher(mobile);
		
		b=matcher.matches();
		
		return b;
		
	}
	
}
