import java.util.regex.*;
import java.util.*;

class RegexExample19
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter DATE :");
		String date=sc.next();

		Pattern pt=Pattern.compile("[0-3]{1}[0-9]{1}:[0-9]{1}[0-9]{1}:[0-9]{4}");
		Matcher mt=pt.matcher(date);

		if(mt.find())
		{
			System.out.println("Date :"+date+" is valid");
		}
		else{
			System.out.println("Date :"+date+" is Invalid");
		}

	}
}