//pan card validation using regex

import java.util.regex.*;

class RegexExample7
{
	public static void main(String[] args) {
		System.out.println("VALIDATE YOUR PAN CARD NO ...................");
		System.out.print("ENTER PAN-CARD NO :");
		String str=new java.util.Scanner(System.in).next();

		System.out.println(str);

		Pattern pattern=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher matcher=pattern.matcher(str);

		if(matcher.matches())
		{
			System.out.println(str+" : PAN CARD IS VALID");
		}
		else{
			System.out.println(str+" : PAN CARD IS INVALID");


		}

	}
}