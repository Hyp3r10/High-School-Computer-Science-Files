import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
	/**
	 * Use a Set of Strings to represent the elements in a dictionary.
	 */
	public Set<String> dictionary;
	/**
	 * Default constructor that instantiates the dictionary global variable.
	 * This constructor should only be used when testing to see if two words
	 * even able to be solved. 
	 */
	public Dictionary() {
		this.dictionary = new HashSet<String>();
		try {
			this.populateDictionary(0);
		} catch (IOException e) {
			System.out.println("Error: File not found, please try again with a valid filename.");
		}
	}
	/**
	 * Overloaded constructor that instantiates the dictionary global variable.
	 */
	public Dictionary(int length) {
		this.dictionary = new HashSet<String>();
		try {
			this.populateDictionary(length);
		} catch (IOException e) {
			System.out.println("Error: File not found, please try again with a valid filename.");
		}
	}
	/**
	 * Instantiates the dictionary to be equal to all words of length size.
	 * Will allow the program to run in a shorter run time because we only ever have to 
	 * @param length	The length of the words we are searching for.
	 */
	public void populateDictionary(int length) throws IOException {
		Scanner scan = new Scanner(new File("dictionary.txt"));
		while(scan.hasNextLine()) {
			String curr = scan.nextLine().toLowerCase();
			if(length == 0) {
				this.dictionary.add(curr);
			}
			else if(curr.length() == length) {
				this.dictionary.add(curr);
			}
		}
	}
	/**
	 * Returns the number of characters that differ from the global variable word 
	 * and the parameter other.
	 * @param one	The first word that is being compared to.
	 * @param two	The second word that is being compared to.
	 * @return		The number of characters that differ from the first string and the second string
	 */
	public static int getDifference(String one, String two) {
		String[] first = one.split("");
		String[] second = two.split("");
		int difference = 0;
		for(int i = 0; i < first.length; i++) {
			if(!first[i].equals(second[i])) {
				difference++;
			}
		}
		return difference;
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
