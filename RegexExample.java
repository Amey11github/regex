import java.util.regex.*;
class RegexExample
{
	public static void main(String[] args) {
		String str="java is prg lang java is HLL JAVA is platform independent";

		// Pattern pattern=Pattern.compile("java",Pattern.CASE_INSENSITIVE);
        // Pattern pattern=Pattern.compile("is");
           Pattern pattern=Pattern.compile("a");
		Matcher matcher=pattern.matcher(str);

		System.out.println("String :"+str);
		System.out.println("regex :"+pattern.toString());

		while(matcher.find())
		{
			System.out.println(matcher.start()+" : "+matcher.end()+" : "+matcher.group());

		}

	}
}