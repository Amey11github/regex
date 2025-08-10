import java.util.regex.*;
import java.util.Scanner;
class RegexExample18
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter GST NO :");
		String gst=sc.next();

		Pattern pt=Pattern.compile("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[0-9]{1}Z[0-9]{1}");
		Matcher mt=pt.matcher(gst);

		if(mt.find())
		{
			System.out.println("GST NO :"+gst+" is valid");
		}
		else{
			System.out.println("GST NO :"+gst+" is Invalid");
		}

	}
}