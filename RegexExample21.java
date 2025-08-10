import java.util.regex.*;
import java.util.*;

class RegexExample21
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter IFSC code :");
		String drive=sc.next();

		Pattern pt=Pattern.compile("[A-Z]{4}[0-9]{7}");
		Matcher mt=pt.matcher(drive);

		if(mt.find())
		{
			System.out.println(drive+" : is valid");
		}
		else{
			System.out.println(drive+" : is Invalid");
		}
	}
	
}