import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * @author MatthewSheldon
 * This class is a HashSet representation of the dictionary with a couple of extra methods for testing purposes
 */
public class Dictionary {
	/**
	 * Use a Set of Strings to represent the elements in a dictionary.
	 */
	public Set<String> dictionary;
	/**
	 * Default constructor that instantiates the dictionary global variable.
	 */
	public Dictionary() {
		this.dictionary = new HashSet<String>();
		try {
			this.populateDictionary();
		} catch (IOException e) {
			System.out.println("Error: File not found, please try again with a valid filename.");
		}
	}
	/**
	 * Instantiates the dictionary to be equal to all words.
	 */
	public void populateDictionary() throws IOException {
		Scanner scan = new Scanner(new File("dictionary.txt"));
		while(scan.hasNextLine()) {
			String curr = scan.nextLine().toLowerCase();
			this.dictionary.add(curr);
		}
	}
	/**
	 * Checks to see if the possibility for a word chain even exists. Checks that:
	 * 	-The first word is contained within the dictionary
	 * 	-The second word is contained within the dictionary
	 * 	-The lengths of the two words are equal to each other
	 * @param word1	The starting word
	 * @param word2	The ending word
	 * @return		If the word chain even has the ability to possibly be found
	 */
	public boolean isDictionarySafe(String word1, String word2) {
		return this.dictionary.contains(word1) && 
				this.dictionary.contains(word2) && 
				word1.toString().length() == word2.toString().length();
	}
	/**
	 * Returns the Dictionary's global variable of dictionary
	 * @return	The global variable, dictionary
	 */
	public Set<String> asList() {
		return this.dictionary;
	}
	@Override
	public String toString() {
		return this.dictionary.toString();
	}
}
