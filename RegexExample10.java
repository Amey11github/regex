import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexExample10
{
	public static void main(String[] args) {
		String str="sfhgbd5564776f8887hgyu3y73bt474";
		// Pattern pattern = Pattern.compile("\\d?");
		// Pattern pattern = Pattern.compile("\\d+");
		Pattern pattern = Pattern.compile("\\d*");

		Matcher matcher = pattern.matcher(str);

		while(matcher.find())
		{
			System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
		}
	}
}