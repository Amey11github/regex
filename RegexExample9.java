// GST NO validation using regex

import java.util.regex.*;

class RegexExample9
{
	public static void main(String[] args) {
		System.out.println("VALIDATE YOUR GST NO ................");
		System.out.print("ENTER GST NO :");
		String str=new java.util.Scanner(System.in).next();

		System.out.println(str);

		Pattern pattern=Pattern.compile("[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[0-9A-Z]{1}Z[0-9A-Z]{1}");
		Matcher matcher=pattern.matcher(str);

		if(matcher.matches())
		{
			System.out.println(str+" : VALID GST NO");
		}
		else{
			System.out.println(str+" : INVALID GST NO");

		}
	}
}