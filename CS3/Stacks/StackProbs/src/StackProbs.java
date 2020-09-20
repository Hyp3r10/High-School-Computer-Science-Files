import java.util.Collections;
import java.util.Stack;

public class StackProbs {
	/**
	 * Takes a Stack and repeats the elements in the order that they appeared
	 * @param nums	A stack containing the elements that need to be duplicated
	 * @return		A Stack containing the elements that have been duplicated
	 */
	public Stack<Integer> doubleUp(Stack<Integer> nums) {
		Stack<Integer> curr = new Stack<Integer>();
		Stack<Integer> toReturn = new Stack<Integer>();
		while(!nums.isEmpty()) {
			curr.push(nums.pop());
		}
		while(!curr.isEmpty()) {
			Integer current = curr.pop();
			toReturn.push(current);
			toReturn.push(current);
		}
		return toReturn;
	}
	/**
	 * Takes a Stack and splits the elements into positive and negative values
	 * puts the negative values at the bottom and the positive ones at the top
	 * @param nums	A Stack containing the elements that need to be split
	 * @return		A Stack containing the elements that have been sorted based off of positve and negative values
	 */
	public Stack<Integer> posAndNeg(Stack<Integer> nums) {
		Stack<Integer> neg = new Stack<Integer>();
		Stack<Integer> pos = new Stack<Integer>();
		while(!nums.isEmpty()) {
			int curr = nums.pop();
			if(curr < 0) {
				neg.push(curr);
			}
			else {
				pos.push(curr);
			}
		}
		Stack<Integer> toReturn = new Stack<Integer>();
		while(!neg.isEmpty()) {
			toReturn.push(neg.pop());
		}
		while(!pos.isEmpty()) {
			toReturn.push(pos.pop());
		}
		return toReturn;
	}
	/**
	 * Takes a Stack and rotates the elements n number of times.
	 * @param nums	A Stack containing the elements that need to be rotated
	 * @param n		An integer denoting the number of elements that need to be rotated
	 * @return		A Stack where the elements have been rotated n times
	 */
	public Stack<Integer> shiftByN(Stack<Integer> nums, int n) {
		Collections.rotate(nums, n);
		return nums;
	}
	/**
	 * Takes a String containing letters and rotates the vowels while maintaining the order of the consonants
	 * @param str	A String containing all of the letters that either need to be rotated or maintain order
	 * @return		A String where all of the vowels in a String have been rotated while consonants have maintained order.
	 */
	public String reverseVowels(String str) {
		Stack<Character> vowels = new Stack<Character>();
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			Character curr = str.charAt(i);
			if(isVowel(curr)) {
				vowels.add(curr);
				temp += "_";
			}
			else {
				temp += curr;
			}
		}
		String toReturn = "";
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == '_' ) {
				toReturn += vowels.pop();
			}
			else {
				toReturn += temp.charAt(i);
			}
		}
		
		return toReturn;
	}
	private boolean isVowel(Character c) {
		return c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u');
	}
}
