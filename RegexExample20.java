import java.util.regex.*;
import java.util.*;

class RegexExample20
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Driveing Licence :");
		String drive=sc.next();

		Pattern pt=Pattern.compile("[A-Z]{2}[0-9]{9}");
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