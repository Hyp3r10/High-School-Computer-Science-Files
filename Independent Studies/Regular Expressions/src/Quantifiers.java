
public class Quantifiers {
	public static void main(String[] args) {
		/**	"*" Quantifier
		 * 	Occurs zero or more times -- {0,}
		 */
		String quantTest1 = "this is a test string that has a lot of t's int it";
		String[] letters = quantTest1.split("t*");
		
		System.out.println("\"*\" Quantifier");
		System.out.println(quantTest1);
		System.out.println(printArray(letters) + "\n");
		
		/**	"+" Quantifier
		 * 	Occurs one or more times -- {1,}
		 */
		String quantTest2 = "tttttttthis has a lottttt of recurring ttttttttt's in ittttt";
		letters = quantTest2.split("t+");
		
		System.out.println("\"+\" Quantifier");
		System.out.println(quantTest2);
		System.out.println(printArray(letters) + "\n");
		
		/**	"?" Quantifier
		 * 	Occurs no or one times -- {0,1}
		 */
		String quantTest3 = "this is a test string that has only one 'x'";
		letters = quantTest3.split("x?");
		
		System.out.println("\"?\" Quantifier");
		System.out.println(quantTest3);
		System.out.println(printArray(letters) + "\n");
		
		/**	"{X}" Quantifier
		 * 	Occurs X number of times, 
		 * 	{} describes the order of the preceding liberal
		 */
		String quantTest4 = "th1s 1s l33t 5p3ak";
		letters = quantTest4.split("[.{3}]");
		
		System.out.println("\"{X}\" Quantifier");
		System.out.println(quantTest4);
		System.out.println(printArray(letters) + "\n");
		
		/**	"{X,Y}" Quantifier
		 * 	Occurs between X and Y times 
		 */
		String quantTest5 = "th1s 1s l33t 5p3ak";
		letters = quantTest5.split("[.{2,3}]");
		
		System.out.println("\"{X,Y}\" Quantifier");
		System.out.println(quantTest5);
		System.out.println(printArray(letters) + "\n");
		
		/**	"*?" Quantifier
		 * 	? after a quantifier makes it a reluctant quantifier. 
		 * 	It tries to find the smallest match. 
		 * 	This makes the regular expression stop at the first match.
		 */
		String quantTest6 = "th1s 1s l33t 5p3ak";
		letters = quantTest6.split("[.{2,3}?]");
		
		System.out.println("\"*?\" Quantifier");
		System.out.println(quantTest5);
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
