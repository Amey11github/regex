import java.util.regex.*;
import java.util.*;

class RegexExample13
{
	public static void main(String[] args) {
		String str="rchyr8t657655bcy77482jd8h89cbr0yf3f980";
		Pattern pt=Pattern.compile("\\D+");
		Pattern pt1=Pattern.compile("[^0-9]+");

		Pattern pt2=Pattern.compile("\\D*");
		Pattern pt3=Pattern.compile("[^0-9]*");

		Pattern pt4=Pattern.compile("\\D?");
		Pattern pt5=Pattern.compile("[^0-9]?");
		Matcher mt=pt1.matcher(str);

		while(mt.find())
		{
			System.out.println(mt.group()+" : "+mt.start()+" : "+mt.end());
		}
	}
}