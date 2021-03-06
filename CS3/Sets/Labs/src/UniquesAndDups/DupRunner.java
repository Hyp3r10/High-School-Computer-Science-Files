package UniquesAndDups;

import static java.lang.System.*;
import java.util.*;

public class DupRunner {
	public static void main( String args[] ) {
		String test1 = "a b c d e f g h a b c d e f g h i j k";
		String test2 = "one two three one two three siz seven one two";
		String test3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		UniquesDupes tester = new UniquesDupes();
		
		System.out.println("Original List: " + test1);
		System.out.println("Uniques: " + tester.getUniques(test1));
		System.out.println("Dupes: " + tester.getDupes(test1));
		System.out.println("\n\nOriginal List: " + test2);
		System.out.println("Uniques: " + tester.getUniques(test2));
		System.out.println("Dupes: " + tester.getDupes(test2));
		System.out.println("\n\nOriginal List: " + test3);
		System.out.println("Uniques: " + tester.getUniques(test3));
		System.out.println("Dupes: " + tester.getDupes(test3));
	}
}