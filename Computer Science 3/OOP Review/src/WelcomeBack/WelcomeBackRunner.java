package WelcomeBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author MatthewSheldon
 */
public class WelcomeBackRunner {
	public static void main(String[] args) {
		WelcomeBack obj1 = new WelcomeBack();
		// q3
		System.out.println("method getMiddle:");
		System.out.println(obj1.getMiddle("odd"));
		System.out.println(obj1.getMiddle("even"));
		// q4
		System.out.println("\nmethod sumNumbers:");
		System.out.println(Arrays.toString(obj1.sumNumbers(5)));
		// q5
		System.out.println("\nmethod sumDigits:");
		System.out.println(obj1.sumDigits(234));
		// q6
		System.out.println("\nmethod keepSummingDigits:");
		System.out.println(obj1.keepSummingDigits(29));
		// q7
		System.out.println("\nmethod getIntersection:");
		System.out.println(obj1.getIntersection(new int[] {1,2,3,4}, new int[] {9,0,4,3,4,1}));
		// q8
		System.out.println("\nmethod mapLengths:");
		System.out.println(obj1.mapLengths(new String[] {"a", "b", "hello", "hi", "yo", "I"}).toString());
		// q9
		System.out.println("\nRiddle:");
		System.out.println("The roman numeral for four (IV) can be cut in half to make the roman numeral for five (V).");
		// q10
		System.out.println("\nmethod sumDigitsRecur:");
		System.out.println(obj1.sumDigitsRecur(29126));
		// q11
		System.out.println("\nmethod sumWithoutCarry:");
		System.out.println(obj1.sumWithoutCarry(861, 450));
		// q12
		System.out.println("\nmethod buySell1:");
		System.out.println(obj1.buySell1(new int[] {3, 4, 3, 2, 1, 5}));
		System.out.println(obj1.buySell1(new int[] {5, 4, 3, 2, 1, 1}));
	}
}
class WelcomeBack {
	/**
	 * @param str == the String object to get the middle character(s) from.
	 * @return the middle character of an odd length String 
	 *  or the middle two characters of an even length String.
	 */
	public String getMiddle(String str) {
		if(str.length() % 2 == 0) {
			int start = (str.length()/2) - 1;
			return str.substring(start, start+2);
		}
		else {
			return "" + (str.charAt((str.length()/2)));
		}
	}
	/**
	 * @param n == number of consecutive numbers to populate.
	 * @return numbers == an array containing the sum of all consecutive 
	 * numbers from 0 to n (inclusive). 
	 * The array should have a length of abs(n) + 1.
	 */
	public int[] sumNumbers(int n) {
		int[] numbers = new int[n+1];
		int start = 0;
		for(int i = 0; i < n+1; i++) {
			numbers[i] = start;
			start += i+1;
		}
		return numbers;
	}
	/**
	 * @param num == the number to sum up all of the individual digits.
	 * @return sum == the sum of all of the individual digits.
	 */
	public int sumDigits(int num) {
		String asString = "" + num;
		int sum = 0;
		for(int i = 0; i < asString.length(); i++) {
			sum += Integer.parseInt("" + asString.charAt(i));
		}
		return sum;
	}
	/**
	 * @param num == the number to iteratively sum up all of the digits 
	 * until only one digit remains.
	 * @return a number with only one digit that is the sum of all previous 
	 * instances of the sumDigits method.
	 */
	public int keepSummingDigits(int num) {
		String asString = "" + num;
		while(asString.length() != 1) {
			asString = "" + sumDigits(Integer.parseInt(asString));
		}
		return Integer.parseInt(asString);
	}
	/**
	 * @param a == a list of numbers
	 * @param b == a list of numbers
	 * @return output == a String representation of a list of shared, 
	 * unique numbers between the lists of a and b
	 */
	public String getIntersection(int[] a , int[] b) {
		ArrayList<Integer> uniqueNums = new ArrayList<Integer>();
		String output = "";
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j] && !uniqueNums.contains(a[i])) {
					uniqueNums.add(a[i]);
					output += a[i];
				}
			} 
		}
		if(output.equals("")) {
			return "no intersection between a and b";
		}
		return output;
	} 
	/**
	 * @param words == a list of words to count the number of 
	 * occurrences of the same length
	 * @return map == a Map where the key will be the length of the String
	 * and the value will be the number of times it occurs. 
	 */
	public Map<Integer, Integer> mapLengths(String[] words) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < words.length; i++) {
			int currLength = words[i].length();
			if(map.containsKey(currLength)) {
				int currValue = map.get(currLength) + 1;
				map.replace(currLength, currValue);
			}
			else {
				map.put(currLength, 1);
			}
		}
		return map;
	}
	/**
	 * @param num == the number to recursively sum up all of the digits 
	 * until only one digit remains.
	 * @return a number with only one digit that is the sum of all previous 
	 * instances of the sumDigits method.
	 */
	public int sumDigitsRecur(int num) {
		return ("" + num).length() == 1 ? num : sumDigitsRecur(sumDigits(num));
	}
	/**
	 * @param a == first integer to add without carrying
	 * @param b == second integer to add without carrying
	 * @return the sum of a and b without "carrying"
	 */
	public int sumWithoutCarry(int a, int b) {
		String asString = "";
		do {
			int remainderA = a % 10;
			int remainderB = b % 10;
			int remainderAB = (remainderA + remainderB) % 10;
			asString =  remainderAB + asString;
			a /= 10;
			b /= 10;
		} while(a != 0 || b != 0); 
		return Integer.parseInt(asString);
	}
	/**
	 * @param stock == list where the element at index i represents 
	 * the price of a share of a particular stock on day i.
	 * @return the maximum potential profit, assuming you 
	 * only made one transaction (i.e. one purchase, one sale).
	 */
	public int buySell1(int[] stock) {
		int diff = 0;
		for(int i = 0; i < stock.length - 1; i++) {
			for (int j = i + 1; j < stock.length; j++) {
				diff = Integer.max(diff, stock[j] - stock[i]);
			}
		}
		return diff;
	}
}