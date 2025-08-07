//it return all pattern matched in string

import java.util.regex.*;

class RegexExample4
{
	public static void main(String[] args) {
		String str="JAVA is pl , \njava is hll ,\njava is multithreaded \nIt supports Java";
		Pattern pattern=Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(str);
		System.out.println(str);
		System.out.println("-----------------------------------------");

		while(matcher.find())
		{
			System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
		}
	}
}