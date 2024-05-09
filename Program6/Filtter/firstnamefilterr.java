package Filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstnamefilterr 
{
	
	public static boolean firstnamecheck(String fname)
	{
		boolean b=false;
		
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		
		Matcher match=pattern.matcher(fname);
		
		b=match.matches();		
		return b;
	}
	
}
