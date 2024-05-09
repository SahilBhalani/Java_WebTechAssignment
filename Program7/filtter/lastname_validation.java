package filtter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lastname_validation 
{
	
	public static boolean lastnamecheck(String lname)
	{
		boolean b =false;
		
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		
		Matcher match =pattern.matcher(lname);
		
		b=match.matches();
		
		return b;
		
	}
	
}
