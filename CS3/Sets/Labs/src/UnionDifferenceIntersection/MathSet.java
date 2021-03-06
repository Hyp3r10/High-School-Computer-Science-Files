package UnionDifferenceIntersection;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class MathSet {
	private Set<Integer> one;
	private Set<Integer> two;

	/**
	 * Default constructor that constructs the one and two Set objects to
	 * be empty TreeSet objects that hold Integer data structures.
	 */
	public MathSet() {
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}
	/**
	 * Overloaded constructed that initializes the one and two TreeSets to be 
	 * equal to the first and second inputs respectively.
	 * @param o	A String representing the first set of integers
	 * @param t	A String representing the second set of integers
	 */
	public MathSet(String o, String t) {
		one = new TreeSet(asList(o));
		two = new TreeSet(asList(t));
	}
	/**
	 * Calculates the union of set one and set two as A U B
	 * Uses the Set method addAll to carry out this operation
	 * @return	A TreeSet denoting A U B 
	 */
	public Set<Integer> union() {
		Set<Integer> union = new TreeSet<Integer>();
		union.addAll(one);
		union.addAll(two);
		return union;
	}
	/**
	 * Calculates the intersection of set one and set two as A n B
	 * Uses the Set method retainAll to carry out this operation
	 * @return	A TreeSet denoting A n B 
	 */
	public Set<Integer> intersection() {
		Set<Integer> intersection = new TreeSet<Integer>();
		intersection.addAll(one);
		intersection.retainAll(two);
		return intersection;
	}
	/**
	 * Calculates the difference of set one minus set two as A - B
	 * Uses the Set method removeAll method to carry out this operation
	 * @return A TreeSet denoting A - B
	 */
	public Set<Integer> differenceAMinusB() {
		Set<Integer> diffAB = new TreeSet<Integer>();
		diffAB.addAll(one);
		diffAB.removeAll(two);
		return diffAB;
	}
	/**
	 * Calculates the difference of set two minus set one as B - A
	 * Uses the Set method removeAll method to carry out this operation
	 * @return A TreeSet denoting B - A
	 */
	public Set<Integer> differenceBMinusA() {
		Set<Integer> diffBA = new TreeSet<Integer>();
		diffBA.addAll(two);
		diffBA.removeAll(one);
		return diffBA;
	}
	/**
	 * Calculates the symmetric difference of one and two denoted by (A - B) U (B - A)
	 * Uses the Set method removeAll method to carry out this operation
	 * @return A TreeSet denoting (A - B) U (B - A)
	 */
	public Set<Integer> symmetricDifference() {		
		Set<Integer> symmetricDiff = new TreeSet<Integer>();
		Set<Integer> diffAB = this.differenceAMinusB();
		Set<Integer> diffBA = this.differenceBMinusA();
		symmetricDiff.addAll(diffAB);
		symmetricDiff.addAll(diffBA);
		return symmetricDiff;
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
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}