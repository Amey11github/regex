import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class RegexExample11
{
	public static void main(String[] args) {
		String str="hie hello java in the world hie helloooo hie";

		Pattern pattern = Pattern.compile("h.e");
		Matcher matcher=pattern.matcher(str);

		while(matcher.find())
		{
			System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
		}
	}
}