//phone no validation using regex

import java.util.regex.*;

class RegexExample6
{
	public static void main(String[] args) {
		System.out.println("VALIDATE YOUR PHONE NO ..................");
		System.out.println("Enter contact no :");
		String no="+91-"+new java.util.Scanner(System.in).next();
		System.out.println(no);

		Pattern pattern=Pattern.compile("\\+91-[6-9]{1}[0-9]{9}");
		Matcher matcher=pattern.matcher(no);
		
		if(matcher.matches())
		{
			System.out.println(no+" ia valid");
		}
		else{
			System.out.println(no+" is  Invalid");
		}

	}
}