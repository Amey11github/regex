//aadhar no validation using regex

import java.util.regex.*;

class RegexExample8
{
	public static void main(String[] args) {
		System.out.println("VALIDATE YOUR AADHAR CARD NO ...............");
		System.out.print("ENTER AADHAR CARD NO :");
		String str=new java.util.Scanner(System.in).nextLine();
		System.out.println(str);

		Pattern pattern =Pattern.compile("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}");
		Matcher matcher=pattern.matcher(str);

		if(matcher.matches())
		{
			System.out.println(str+" :  VALID AADHAR NO");
		}
		else{
			System.out.println(str+" :  INVALID AADHAR NO");

		}
		

	}
}