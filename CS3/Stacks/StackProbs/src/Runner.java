import java.util.Stack;

public class Runner {
	public static void main(String[] args) {
		Stack<Integer> test1 = makeStack(new int[] {1,3,5,0,-1});
		Stack<Integer> test2 = makeStack(new int[] {2,9,-4,3,-1,0,-6});
		Stack<Integer> test3 = makeStack(new int[] {7,23,-7,0,22,-8,4,5});
		String test4 = "hello how are you";
		StackProbs tester = new StackProbs();
		System.out.println(tester.doubleUp(test1));
		System.out.println(tester.posAndNeg(test2));
		System.out.println(tester.shiftByN(test3, test3.size()-3));
		System.out.println(tester.reverseVowels(test4));
	}
	public static Stack<Integer> makeStack(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int num: nums) {
			stack.push(num);
		}
		return stack;
	}
	
}
