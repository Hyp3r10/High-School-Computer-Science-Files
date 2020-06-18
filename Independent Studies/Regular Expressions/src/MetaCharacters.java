/**
 * @author MatthewSheldon
 *	
 *	The following meta characters have a pre-defined 
 *	meaning and make certain common patterns easier to use
 *
 *	These meta characters have the same first letter as their representation, 
 *	e.g., digit, space, word, and boundary. Upper-case symbols define the opposite.
 */
public class MetaCharacters {
	public static void main(String[] args) {
		/** "\d" Meta Character
		 * 	Short for Any digit -- [0-9]
		 */
		String metaTest1 = "th1s 1s l33t 5p3ak";
		String[] letters = metaTest1.split("\\d");
		
		System.out.println("\"\\d\" Meta Character");
		System.out.println(metaTest1);
		System.out.println(printArray(letters) + "\n");
		
		/** "\D" Meta Character
		 * 	Short for Anything except for digits -- [^0-9]
		 */
		String metaTest2 = "th1s 1s l33t 5p3ak";
		letters = metaTest2.split("\\D");
		
		System.out.println("\"\\D\" Meta Character");
		System.out.println(metaTest2);
		System.out.println(printArray(letters) + "\n");
		
		/** "\s" Meta Character
		 * 	Short for A whitespace character -- [\t\n\x0b\r\f]
		 */
		String metaTest3 = "th1s 1s l33t 5p3ak";
		letters = metaTest3.split("\\s");
		
		System.out.println("\"\\s\" Meta Character");
		System.out.println(metaTest3);
		System.out.println(printArray(letters) + "\n");
		
		/** "\S" Meta Character
		 * 	Short for Any non-whitespace character -- [^\t\n\x0b\r\f]
		 */
		String metaTest4 = "th1s 1s l33t 5p3ak";
		letters = metaTest4.split("\\S");
		
		System.out.println("\"\\S\" Meta Character");
		System.out.println(metaTest4);
		System.out.println(printArray(letters) + "\n");
		
		/** "\w" Meta Character
		 * 	Short for A word character -- [a-zA-Z_0-9]
		 */
		String metaTest5 = "th1s 1s l33t 5p3ak";
		letters = metaTest5.split("\\w");
		
		System.out.println("\"\\w\" Meta Character");
		System.out.println(metaTest5);
		System.out.println(printArray(letters) + "\n");
		
		/** "\W" Meta Character
		 * 	Short for Any non-word character -- [^\w] -- [^a-zA-Z_0-9]
		 */
		String metaTest6 = "th1s 1s l33t 5p3ak";
		letters = metaTest6.split("\\W");
		
		System.out.println("\"\\W\" Meta Character");
		System.out.println(metaTest6);
		System.out.println(printArray(letters) + "\n");
		
		/** "\S+" Meta Character
		 * 	Short for Several non-whitespace characters -- [^\t\n\x0b\r\f]+
		 */
		String metaTest7 = "th1s 1s l33t 5p3ak";
		letters = metaTest7.split("\\S+");
		
		System.out.println("\"\\S+\" Meta Character");
		System.out.println(metaTest7);
		System.out.println(printArray(letters) + "\n");
		
		/** "\b" Meta Character
		 * Matches a word boundary where a word character is [a-zA-Z0-9_]
		 */
		String metaTest8 = "th1s 1s l33t 5p3ak";
		letters = metaTest8.split("\\b");
		
		System.out.println("\"\\b\" Meta Character");
		System.out.println(metaTest8);
		System.out.println(printArray(letters) + "\n");
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
