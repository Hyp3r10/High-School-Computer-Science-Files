import java.util.Arrays;

public class RegularExpressionsWithStrings {
	public static void main(String[] args) {
		/**	"matches" method -- s.matches("regex")
		 * 	Evaluates if "regex" matches s.
		 *  Returns only true if the WHOLE string can be matched.
		 */
		String regex = "\\w.*";
		String exampleString = "This is my small example "
	            + "string which I'm going to " + "use for pattern matching.";
		
		System.out.println("the \"matches()\" method");
		System.out.println(exampleString.matches(regex));
		
		/**	"split" method -- s.split("regex")
		 * 	Creates an array with substrings of s divided at occurrence of "regex". 
		 * 	"regex" is not included in the result.
		 */
		regex = "\\s+";
		
		System.out.println("\nthe \"split()\" method");
		System.out.println(Arrays.toString(exampleString.split(regex)));
		
		/**	"replaceFirst" method -- s.replaceFirst("regex", "replacement")
		 *	 Replaces first occurrence of "regex" with "replacement.
		 */
		regex = "\\s+";
		String replacement = "\t";
		
		System.out.println("\nthe \"replaceFirst()\" method");
		System.out.println(exampleString.replaceFirst(regex, replacement));
		
		/**	"replaceAll" method -- s.replaceAll("regex", "replacement")
		 * 	Replaces all occurrences of "regex" with "replacement"
		 */
		regex = "\\s+";
		replacement = "\t";
		
		System.out.println("\nthe \"replaceAll()\" method");
		System.out.println(exampleString.replaceAll(regex, replacement));
		
	}
}
