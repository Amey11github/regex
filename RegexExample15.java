import java.util.regex.*;
import java.util.*;

class RegexExample15
{
	public static void main(String[] args) {
		String str="rc hyr8t6576  55bcy77482   jd8h89cb r0yf3f9  80";
		Pattern pt=Pattern.compile("\\S+");
		Pattern pt1=Pattern.compile("[^ ]+");

		Pattern pt2=Pattern.compile("\\S*");
		Pattern pt3=Pattern.compile("[^ ]*");

		Pattern pt4=Pattern.compile("\\S?");
		Pattern pt5=Pattern.compile("[^ ]?");
		Matcher mt=pt5.matcher(str);

		while(mt.find())
		{
			System.out.println(mt.group()+" : "+mt.start()+" : "+mt.end());
		}
	}
}