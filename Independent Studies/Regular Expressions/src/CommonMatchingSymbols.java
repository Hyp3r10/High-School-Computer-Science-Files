/**
 * @author MatthewSheldon
 * 		
 * 	This is a program that will include many of the common
 * 	matching symbols. This will serve as a reference to how some
 * 	of the more common types of "regex" work
 */
public class CommonMatchingSymbols {
	public static void main(String[] args) {
		/** The "." Regular Expression
		 * 	Matches any character
		 */
		String regexTest1 = "abcdefgh";
		String[] letters = regexTest1.split("[.]");
		
		System.out.println(regexTest1);
		System.out.println(printArray(letters) + "\n");
		
		/** The "^regex" Regular Expression
		 * 	Finds regex that must match at the beginning of the line
		 * 	The "^" specifies that is has to be at the beginning of 
		 * 	the line.
		 */
		String regexTest2 = "th1s 1s l33t 5p3ak";
		letters = regexTest2.split("[^0-9]");
		
		System.out.println(regexTest2);
		System.out.println(printArray(letters) + "\n");
		
		/** The "regex$" Regular Expression
		 * 	Finds regex that must match at the end of the line.
		 * 	The "$" specifies that is has to be at the end of 
		 * 	the line.
		 */
		
		/** The "[char(s)]" Regular Expression
		 * 	Set definition
		 * 	Whatever is inside of the brackets will be what it is
		 * 	searching for.
		 * 	Ex: [abc] -- can match the letter a or b or c.
		 */
		String regexTest4 = "whyareapplesthebestforyourcolon?";
		letters = regexTest4.split("[abc]");
		
		System.out.println(regexTest4);
		System.out.println(printArray(letters) + "\n");
		
		/** The "[char(s)][char(s)]" Regular Expression
		 * 	Set definition
		 * 	Searches for whatever is in the brackets first followed by
		 * 	anything in the second brackets.
		 * 	Ex: [abc][vz] -- can match a or b or c followed by either v or z.
		 */
		String regexTest5 = "thisazwillbvsplitcvhereavbut zb not va here";
		letters = regexTest5.split("[abc][vz]");
		
		System.out.println(regexTest5);
		System.out.println(printArray(letters) + "\n");
		
		/** The "[^char(s)]" Regular Expression
		 * 	When a caret appears as the first character inside 
		 * 	square brackets, it negates the pattern.
		 * 	Ex: [^abc] -- This pattern matches any character
		 *  except a or b or c.
		 */
		String regexTest6 = "this will split at all of the characters except for a b or c";
		letters = regexTest6.split("[^abc]");
		
		System.out.println(regexTest6);
		System.out.println(printArray(letters) + "\n");
		
		/** The "[char-char]" Regular Expression
		 * 	Ranges: checks for anything within the range given.
		 * 	Ex: [a-d1-7] -- matches a letter between a and d 
		 * 	and figures from 1 to 7, but not d1.
		 */
		String regexTest7 = "this will split at any character that is a through d or 1 through 7";
		letters = regexTest7.split("[a-d1-7]");
		
		System.out.println(regexTest7);
		System.out.println(printArray(letters) + "\n");
		
		/** The "|" Regular Expression
		 * 	Acts like the "or" operator
		 * 	Ex: X|Z -- Finds X or Z.
		 */
		String regexTest8 = "this will split X";
		letters = regexTest8.split("X|Z");
		
		System.out.println(regexTest8);
		System.out.println(printArray(letters));
		
		regexTest8 = "this will split Z";
		letters = regexTest8.split("X|Z");
		
		System.out.println(regexTest8);
		System.out.println(printArray(letters) + "\n");
		
		/** No space between chars Regular Expression
		 * 	Finds the first character followed directly by the second
		 * 	Ex: XZ -- Finds X directly followed by Z.
		 */
		String regexTest9 = "XZ this will split XZ at any occurance XZ of XZ";
		letters = regexTest9.split("XZ");
		
		System.out.println(regexTest9);
		System.out.println(printArray(letters) + "\n");
		
		/**	The "$" Regular Expression
		 * Checks id a line end follows
		 * Ex: See "regex$"
		 */
		
	}
	public static String printArray(String[] array) {
		String output = "[";
		
		for(int i = 0; i < array.length; i++) {
			if(i != array.length-1) {
				output += (array[i].toString() + ", ");	
			}
			else {
				output += (array[i].toString() + "]");
			}
		}
		
		return output;
	}
}
