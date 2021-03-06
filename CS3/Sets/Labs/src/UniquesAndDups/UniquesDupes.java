package UniquesAndDups;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class UniquesDupes {
	/**
	 * Take advantage of the Overloaded constructor of a TreeSet and initialize 
	 * the values of unique to be equal to the unique elements in the input.
	 * @param input	A String that represents the input.
	 * @return		A TreeSet that contains all of the unique elements
	 */
	public static Set<String> getUniques(String input) {
		Set<String> uniques = new TreeSet<String>();
		List<String> asList = asList(input);
		uniques = new TreeSet<String>(asList);
		return uniques;
	}
	/**
	 * Using a ListIterator to iterate through the elements in the input and initialize the 
	 * uniques and dupes TreeSets to be unique and duplicate elements, respectively.
	 * @param input	A String that represents the input.
	 * @return		A TreeSet that contains all of the duplicate elements
	 */
	public static Set<String> getDupes(String input) {
		Set<String> uniques = new TreeSet<String>();
		Set<String> dupes = new TreeSet<String>();
		ListIterator<String> temp = asList(input).listIterator();
		while(temp.hasNext()) {
			String curr = temp.next();
			// We already have this element before now
			if(uniques.contains(curr)) {
				dupes.add(curr);
			}
			// We don't have this element before now
			else {
				uniques.add(curr);
			}
		}
		return dupes;
	}
	/**
	 * Helper method to take in the String input and parse it into a List Object
	 * for the Stack to be instantiated
	 * @param input	A String that represents the input
	 * @return		A List that represents the input as a List
	 */
	private static List<String> asList(String input) {
		String[] arr = input.split(" ");
		List<String> asList = new ArrayList<String>();
		for(String temp : arr) {
			asList.add(temp);
		}
		return asList;
	}
}