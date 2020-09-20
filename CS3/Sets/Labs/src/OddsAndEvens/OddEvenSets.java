package OddsAndEvens;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets {
	private Set<Integer> odds;
	private Set<Integer> evens;
	/**
	 * Default constructor that simply constructs the odds and evens 
	 * TreeSets to their default values.
	 */
	public OddEvenSets() {
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
	}
	/**
	 * Overloaded constructor that takes in a String of input and initializes the values
	 * of odds and evens TreeSets to be odd and even elements from the input.
	 * @param line	A String that represents the input
	 */
	public OddEvenSets(String line) {
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
		List<Integer> asList = asList(line);
		ListIterator<Integer> temp = asList.listIterator();
		while(temp.hasNext()) {
			Integer curr = temp.next();
			if(curr % 2 == 0) {
				evens.add(curr);
			}
			else {
				odds.add(curr);
			}
		}
	}
	/**
	 * Helper method to take in the String input and parse it into a List Object
	 * for the Stack to be instantiated
	 * @param input	A String that represents the input
	 * @return		A List that represents the input as a List
	 */
	private List<Integer> asList(String input) {
		String[] arr = input.split(" ");
		List<Integer> asList = new ArrayList<Integer>();
		for(String temp : arr) {
			asList.add(Integer.parseInt(temp));
		}
		return asList;
	}
	public String toString() {
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}