import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/**
 * @author MatthewSheldon
 * This class is the tester for solving the word chains
 */
public class WordChainRunner {
	public static void main(String[] args) throws IOException {
		double timer = System.currentTimeMillis();
		Scanner scan = new Scanner(new File("input.txt"));
		Dictionary dictionary = new Dictionary();
		while(scan.hasNextLine()) {
			// Take in the words
			String first = scan.next().toLowerCase();
			String second = scan.next().toLowerCase();
			// Test to see if the word even exists or if they are the same length
			boolean isDictionarySafe = dictionary.isDictionarySafe(first, second);
			if(!isDictionarySafe) {
				System.out.println("No ladder between " + first + " and " + second + "\n");
			}
			// If the two words are the same
			else if(first.equals(second)) {
				System.out.println("Found ladder between " + first + " and " + second + " >>> \n[" + first + "]\n");
			}
			else {
				// Create the object to test for the chain
				WordChain tester = new WordChain(first, second, dictionary);
				// Get the solution from the testing object
				Stack<String> solution = tester.solve();
				// If there are no solutions
				if(solution.size() == 0) {
					System.out.println("No ladder between " + first + " and " + second + "\n");
				}
				else {
					System.out.println("Found ladder between " + first + " and " + second + " >>> ");
					// Print out all of the possible shortest solutions
					System.out.println(solution.toString() + "\n");
				}
			}
		}
		System.out.println("Ran in " + (System.currentTimeMillis() - timer)/1000 + " seconds.");
	}
}
