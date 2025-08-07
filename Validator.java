//validate pan-no,aadhar-no,gst-no,phone-no,etc.

import java.util.regex.*;
import java.util.*;

class Validator
{
	public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN="\u001B[36m";

	static Scanner sc=new Scanner(System.in);

	public static void valPhone()
	{
		System.out.println("VALIDATE YOUR PHONE NO.. ");
		System.out.println("----------------------------");
		System.out.print("ENTER PHONE NO :");
		String str="+91-"+sc.next();
		Pattern pattern =Pattern.compile("\\+91-[6-9]{1}[0-9]{9}");
		Matcher matcher=pattern.matcher(str);
		if(matcher.matches())
			System.out.println(GREEN+str+" phone no is valid"+RESET);
		else
			System.out.println(RED+str+" phone no is not valid"+RESET);
		
		System.out.println("----------------------------");

	}

	public static void valEmail()
	{
		System.out.println("VALIDATE YOUR EMAIL...");
		System.out.print("ENTER EMAIL :");
		String str=sc.next();

		Pattern pattern=Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		Matcher matcher=pattern.matcher(str);
		if(matcher.matches())
			System.out.println(GREEN+str+" Email is valid"+RESET);
		else
			System.out.println(RED+str+" Email is Invalid"+RESET);

       System.out.println("----------------------------");
	}

	public static void valPan()
	{
		System.out.println("VALIDATE YOUR PAN CARD NO ...................");
		System.out.print("ENTER PAN-CARD NO :");
		String str=sc.next();

		Pattern pattern=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher matcher=pattern.matcher(str);

		if(matcher.matches())
			System.out.println(GREEN+str+" : PAN CARD IS VALID"+RESET);
		else
			System.out.println(RED+str+" : PAN CARD IS INVALID"+RESET);
		System.out.println("----------------------------");

	}

	public static void valGst()
	{
		System.out.println("VALIDATE YOUR GST NO ................");
		System.out.print("ENTER GST NO :");
		String str=new java.util.Scanner(System.in).next();

		System.out.println(str);

		Pattern pattern=Pattern.compile("[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[0-9A-Z]{1}Z[0-9A-Z]{1}");
		Matcher matcher=pattern.matcher(str);

		if(matcher.matches())
			System.out.println(GREEN+str+" : VALID GST NO"+RESET);
		else
			System.out.println(RED+str+" : INVALID GST NO"+RESET);
        System.out.println("----------------------------");
	}

	public static void valAadhar()
	{
        System.out.println("VALIDATE YOUR AADHAR CARD NO ...............");
		System.out.print("ENTER AADHAR CARD NO :");
		String str=new java.util.Scanner(System.in).nextLine();
		System.out.println(str);

		Pattern pattern =Pattern.compile("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}");
		Matcher matcher=pattern.matcher(str);

		if(matcher.matches())
			System.out.println(GREEN+str+" :  VALID AADHAR NO"+RESET);
		else
			System.out.println(RED+str+" :  INVALID AADHAR NO"+RESET);
         System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		
		int ch=0;

		do{
			System.out.println(YELLOW+"VALIDATOR MENU "+RESET);
			System.out.println("----------------------------");
			System.out.println(YELLOW+"1.Validate Phone No \n2.Validate Email \n3.Validate PAN-NO \n4.Validate GST-NO \n5.Validate aadhar no \n6.Exit"+RESET);
			System.out.println("----------------------------");
			System.out.print(CYAN+"Enter your choice :"+RESET);
			ch=sc.nextInt();

			switch(ch)
			{
			case 1:valPhone();break;
			case 2:valEmail();break;
			case 3:valPan();break;
			case 4:valGst();break;
			case 5:valAadhar();break;
			default:System.out.println("enter valid choice...");
			}
		}while(ch!=6);
		
	}
}