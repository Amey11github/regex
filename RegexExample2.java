//it returns only pattern matched which is at the start of newline

import java.util.regex.*;

class RegexExample2
{
	public static void main(String[] args) {
		String str="JAVA is pl , \njava is hll ,\njava is multithreaded \nIt supports Java";
		Pattern pattern=Pattern.compile("^java",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher matcher=pattern.matcher(str);
		System.out.println(str);
		System.out.println("-----------------------------------------");

		while(matcher.find())
		{
			System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
		}
	}
}