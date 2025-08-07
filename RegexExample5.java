import java.util.regex.*;
class RegexExample5
{
	public static void main(String[] args) {
		String str="ABDE8745YYT85YTUTY5U4579857BVHGHTGT557585";
		// Pattern pattern=Pattern.compile("[0-9]");
		Pattern pattern=Pattern.compile("[0-9]+");


		Matcher matcher=pattern.matcher(str);

		while(matcher.find())
		{
			System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
		}
	}
}