import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class WordChain {
	/**
	 * A Dictionary Object that will store all only the words that are of the same size as the starting and ending word
	 */
	private Dictionary dictionary;
	/**
	 * Word Objects that hold the start and the end of the chain (used for determinign when a path is complete)
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
	 * A Queue of Stacks of Words that are only the paths that solve the chain and are of the smallest size.
	 * This is what will be returned as the solution at the end of the solve method
	 */
	private Queue<Stack<String>> shortestPaths;
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
	public WordChain(String one, String two) {
		// Create the Dictionary object with size of one
		this.dictionary = new Dictionary(one.length());
		// Create the two words
		this.first = one;
		this.second = two;
		this.shortestPaths = new LinkedList<Stack<String>>();
		this.shortest = Integer.MAX_VALUE;
	}
 	/**
 	 * Determines what words that are unused are off by one character from the current word.
 	 * @param alreadyUsed	A Queue indicating words that have already been used
 	 * @param compare		The word that we are comparing the dictionary to
 	 * @return				A Queue containing words that are off by one character from the current word
 	 */
	public Queue<String> getDiffByOne(String compare) {
		Queue<String> diffByOne = new LinkedList<String>();
		Set<String> words = this.dictionary.asList();
		words.removeAll(this.alreadyUsed);
		for(String temp : words) {
			if(Dictionary.getDifference(compare, temp) == 1) {
				diffByOne.add(temp);
			}
		}
		return diffByOne;
	}
	/**
	 * Removes all of the paths that are greater than the currently smallest path size
	 * @param toSearch	The toSearch object from the solve method
	 */
	public void removeLarger() {
		Queue<Stack<String>> queue = new LinkedList<Stack<String>>();
		for(Stack<String> temp : this.toSearch) {
			// Only add paths that are less than or equal to the current shortest path
			if(temp.size() <= this.shortest) {
				queue.add(temp);
			}
		}
		this.toSearch = queue;
	}
	/**
	 * Populate toSearch with new paths of Words that can be created from child
	 * @param curr	The current Stack that we are adding new words to the path
	 */
	public void addNewNeighbors(Stack<String> curr) {
		Queue<Stack<String>> queue = new LinkedList<Stack<String>>();
		Queue<String> diffByOne = this.getDiffByOne(curr.peek());
		for(String temp : diffByOne) {
			Stack<String> copy = new Stack<String>();
			copy.addAll(curr);
			// Add the new word to the stack
			copy.push(temp);
			// Add the new stack to the toSearch
			this.toSearch.add(copy);
			// add the elements to the already used list
			this.alreadyUsed.add(temp);
			// remove the word from the dictionary so we never use it or compare it again
			this.dictionary.dictionary.remove(temp);
		}
	}
	/**
	 * Solves the Word Chain by searching deeply into the paths unless the new path size is 
	 * too large. It should find the shortest path if it exists. If there is no path, then it 
	 * will return an empty Queue of Stacks of Words indicating that no path was found.
	 * @return	A Queue of Stacks of Words indicating the path from the start word to the end word.
	 */
	public Queue<Stack<String>> solve() {
		// PREPERATION FOR SOLVING
		this.shortest = Integer.MAX_VALUE;
		this.toSearch = new LinkedList<Stack<String>>();
		String start = this.first;
		String end = this.second;
		alreadyUsed = new HashSet<String>();
		alreadyUsed.add(start);
		// Creates the first set of words to search 
		Queue<String> diffByOne = this.getDiffByOne(start);
		// Create the toSearch Queue by putting the starting word first and then the first word to search
		this.toSearch = new LinkedList<Stack<String>>();
		for(String temp : diffByOne) {
			// Add the starting word and the first path word to the current stack 
			Stack<String> stack = new Stack<String>();
			stack.push(start);
			stack.push(temp);
			toSearch.add(stack);
			// add the elements to the already used list
			this.alreadyUsed.add(temp);
			// remove the word from the dictionary so we never use it or compare it again
			this.dictionary.dictionary.remove(temp);
		}
		
		// START SOLVING!
		while(!toSearch.isEmpty()) {
			// Dequeue the first element from toSearch
			Stack<String> curr = toSearch.poll();
			String child = curr.peek();
			// if the current element is the word we are searching for, return the stack
			if(child.equals(end)) {
				// If this current path is shorter than the shortest variable, make this the new shortest path size and 
				// get rid of all paths greater than this current one
				if(curr.size() < this.shortest) {
					this.shortest = curr.size();
					this.shortestPaths = new LinkedList<Stack<String>>();
					this.shortestPaths.add(curr);
					// Remove all paths from the toSearch that are larger than the current smallest path
					this.removeLarger();
				}
				// Assuming that this is the shortest size of paths, add the current path to the list of shortest paths.
				else if(curr.size() == this.shortest) {
					this.shortestPaths.add(curr);
				}
				// If the solved path is of a greater size than the current path, then there is no reason to add it to the list. 
				// Theoretically this should not happen but just in case, ignore this path.
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
		return this.shortestPaths;
	}
}
