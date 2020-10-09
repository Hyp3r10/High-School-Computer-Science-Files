import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
/**
 * @author MatthewSheldon
 * This class is handles solving and 
 */
public class WordChain {
	/**
	 * A Dictionary Object that will store all only the words that are of the same size as the starting and ending word
	 */
	private Dictionary dictionary;
	/**
	 * Word Objects that hold the start and the end of the chain (used for determining when a path is complete)
	 */
	private String first, second;
	/**
	 * A List of Word Objects indicating what words have been used already (Prevents infinite loops) 
	 */
	private Set<String> alreadyUsed;
	/**
	 * A Queue of Stacks of Words that indicated the paths that need to still be searched for a solution to be found.
	 */
	private Queue<Stack<String>> toSearch;
	/**
	 * An integer used to store the size of the current smallest size. 
	 * This will be equal to the actual smallest size at the end of the solve method  
	 */
	private int shortest;
	/**
	 * Constructs a WordChain Object that will handle the word chain puzzle
	 * @param one	The starting word
	 * @param two	The ending word
	 */
	public WordChain(String one, String two, Dictionary dictionary) {
		// Create the Dictionary object with size of one
		this.dictionary = dictionary;
		// Create the two words
		this.first = one;
		this.second = two;
		this.shortest = Integer.MAX_VALUE;

		// PREPERATION FOR SOLVING
		this.toSearch = new LinkedList<Stack<String>>();
		alreadyUsed = new HashSet<String>();
		alreadyUsed.add(this.first);
		Stack<String> tempStack = new Stack<String>();
		tempStack.add(this.first);
		// Creates the first set of words to search 
		this.addNewNeighbors(tempStack);
	}
	/**
	 * Populate toSearch with new paths of Words that can be created from child
	 * @param curr	The current Stack that we are adding new words to the path
	 */
	public void addNewNeighbors(Stack<String> curr) {
		StringBuilder parent = new StringBuilder(curr.peek());
		// Iterate trough all indexes of the given word
		for(int i = 0; i < parent.length(); i++) {
			// get the original character at the given index
			char original = parent.charAt(i);
			// iterate trough all letters of at the given index
			for(char change = 'a'; change <= 'z'; change++) {
				if(change != original) {
					parent.setCharAt(i, change);
					// Only add the element to toSearch if the word hasn't been used and if it is in the dictionary.
					if(!this.alreadyUsed.contains(parent.toString()) && this.dictionary.dictionary.contains(parent.toString())) {
						Stack<String> copy = new Stack<String>();
						copy.addAll(curr);
						copy.add(parent.toString());
						this.toSearch.add(copy);
						this.alreadyUsed.add(parent.toString());
					}
				}
			}
			// set the parent to be back to the original letter at the given index
			parent.setCharAt(i, original);
		}
	}
	/**
	 * Solves the Word Chain by searching in a BFS way into the paths unless the new path size is 
	 * too large. It will find the shortest path if it exists. If there is no path, then it 
	 * will return an empty Stack of Words indicating that no path was found.
	 * @return	A Stack of Words indicating the path from the start word to the end word.
	 */
	public Stack<String> solve() {
		// START SOLVING!
		while(!toSearch.isEmpty()) {
			// Dequeue the first element from toSearch
			Stack<String> curr = toSearch.poll();
			String child = curr.peek();
			// if the current element is the word we are searching for, return the stack
			if(child.equals(this.second)) {
				// If this current path is shorter than the shortest variable, make this the new shortest path size and 
				// get rid of all paths greater than this current one
				if(curr.size() <= this.shortest) {
					return curr;
				}
			}
			// Else, we need to get the "neighbors" of the child word.
			else {
				// Only add the the new word to the stack if it will not surpass the currently smallest path
				if(curr.size()+1 <= this.shortest) {
					// Add the new words to the queue
					this.addNewNeighbors(curr);
				}
				// Ignore further paths with this object if the path is too long
			}
		}
		// Return a stack of size zero to indicate that the word has no chains
		return new Stack<String>();
	}
}
