package Filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lastnamefiltter 
{
	
	public static boolean lastnamecheck(String lname) 
	{
		
		boolean b=false;
		
		
		Pattern pattern =Pattern.compile("^[a-zA-Z]+$");
		
		Matcher match=pattern.matcher(lname);
		
		b=match.matches();
		
		
		return b;
	}
	
}
