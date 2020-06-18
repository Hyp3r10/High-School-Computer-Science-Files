import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
	public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching."; ;
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		
		// Checks all occurrences of the pattern with the matcher
		while(matcher.find()) {
			System.out.print("Start Index: " + matcher.start());
			System.out.print("	End Index: " + matcher.end() + " ");
		 	System.out.println(matcher.group());
		}
		
		Pattern replace = Pattern.compile("\\s+");
		Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
		System.out.println(matcher2.replaceAll("\t"));
	}
}	
