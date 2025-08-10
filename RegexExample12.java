// example 1

import java.util.regex.*;
import java.util.*;

class RegexExample12
{
	public static void main(String[] args) {
		String str="rchyr8t657655bcy77482jd8h89cbr0yf3f980";
		Pattern pt=Pattern.compile("\\d+");
		Pattern pt1=Pattern.compile("[0-9]+");

		Pattern pt2=Pattern.compile("\\d*");
		Pattern pt3=Pattern.compile("[0-9]*");

		Pattern pt4=Pattern.compile("\\d?");
		Pattern pt5=Pattern.compile("[0-9]?");
		Matcher mt=pt5.matcher(str);

		while(mt.find())
		{
			System.out.println(mt.group()+" : "+mt.start()+" : "+mt.end());
		}
	}
}