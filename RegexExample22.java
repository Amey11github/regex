import java.util.*;
import java.util.regex.*;

class RegexExample22
{
	public static void main(String[] args) {
		String mob="8080656048";

		Pattern pattern=Pattern.compile("[6-9]{1}[0-9]{9}");
		Matcher matcher="+91 "+pattern.matcher(mob);

		if(matcher.find())
		{
			System.out.println(mob+" is valid");
		}
		else
		{
			System.out.println(mob+" is Invalid");
          

		}
		
	}
}