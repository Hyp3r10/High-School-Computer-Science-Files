public class IndexOf101 {
	public static void main(String[] args) {
		String word = "bobcat";
		// Index       012345
		String find0 = "b";
		// Index        0
		char find1 = 'c';
		// Index      0
		char find2 = 'x';
		// Index      0
		String find3 = "cat";
		// Index        012
		String find4 = "car";
		// Index        012
		String find5 = "bob";
		// Index        012
		String find6 = "Waldo";
		// Index        012
		
		System.out.println("Word :: " + word + "\n");
		
		System.out.println("The first instance of " + find0 + " is at :: " + word.indexOf(find0));
		System.out.println("The first instance of " + find1 + " is at :: " + word.indexOf(find1));
		System.out.println("The first instance of " + find2 + " is at :: " + word.indexOf(find2));
		System.out.println("The first instance of " + find3 + " is at :: " + word.indexOf(find3));
		System.out.println("The first instance of " + find4 + " is at :: " + word.indexOf(find4));
		System.out.println("The first instance of " + find5 + " is at :: " + word.indexOf(find5));
		System.out.println("The first instance of " + find6 + " is at :: " + word.indexOf(find6));
	}
}