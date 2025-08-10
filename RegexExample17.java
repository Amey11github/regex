import java.util.regex.*;
import java.util.*;

class RegexExample17
{
	public static void main(String[] args) {
		String str="rc hyr8t6576  55bcy77482   jd8h89cb r0yf3f9  80";
		Pattern pt=Pattern.compile("\\W+");
		Pattern pt1=Pattern.compile("[^a-zA-Z0-9]+");

		Pattern pt2=Pattern.compile("\\W*");
		Pattern pt3=Pattern.compile("[^a-zA-Z0-9]*");

		Pattern pt4=Pattern.compile("\\W?");
		Pattern pt5=Pattern.compile("[^a-zA-Z0-9]?");
		Matcher mt=pt5.matcher(str);

		while(mt.find())
		{
			System.out.println(mt.group()+" : "+mt.start()+" : "+mt.end());
		}
	}
}