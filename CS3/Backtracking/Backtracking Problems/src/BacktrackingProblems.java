import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BacktrackingProblems {
	public static void main(String[] args) {
		BacktrackingProblems tester = new BacktrackingProblems();
		System.out.println("Climb Stairs: ");
		System.out.println("----------------------------");
		tester.climbStairs(4);
		System.out.println("\n\nCampsite: ");
		System.out.println("----------------------------");
		tester.campsite(2, 1);
		System.out.println("\n\ngetMax: ");
		System.out.println("----------------------------");
		System.out.println(tester.getMax(Arrays.asList(30, 2, 8, 22, 6, 4, 20), 19));
		System.out.println("\n\nMake Change: ");
		System.out.println("----------------------------");
		System.out.println(tester.makeChange(25)); 
		System.out.println(tester.makeChange(100));	
		System.out.println("\n\nMake Change Coin Count: ");
		System.out.println("----------------------------");
		tester.makeChangeCoinCount(11); 
		System.out.println("\n\nLongest Common Substring: ");
		System.out.println("----------------------------");
		System.out.println(tester.longestCommonSub("ABCDEFGF", "BGCEHAF"));
		System.out.println(tester.longestCommonSub("12345", "54321 21 54321"));
	}
	/**
	 * Public method that calls the recursive cimbStairsHelper
	 * method that determines the different combinations that 
	 * you can go up a given number of steps with 1 and 2 step
	 * increments. 
	 * @param steps	The number of steps needed to climb
	 */
	public void climbStairs(int steps) {
		this.climbStairsHelper(0, steps, "");
	}
	/**
	 * Private helper method that recursively checks to see if the 
	 * current iteration of steps is valid or invalid. If the current
	 * number of steps equals the target number of steps, print out 
	 * the current "path" of how many stairs to climb.
	 * @param currSteps		This iteration's current number of steps climbed
	 * @param totalSteps	The total number of steps needed to climb to be at the top
	 * @param steps			The "path" of steps that have been taken to get to the current iteration
	 */
	private void climbStairsHelper(int currSteps, int totalSteps, String steps) {
		if(currSteps == totalSteps) {
			System.out.println(steps.substring(0, steps.length()-2));
		}
		if(currSteps < totalSteps) {
			this.climbStairsHelper(currSteps + 1, totalSteps, steps + "1, ");
			this.climbStairsHelper(currSteps + 2, totalSteps, steps + "2, ");
		}
	}
	/**
	 * Public method that calls the recursive campsiteSolver method
	 * which determines the different potential paths to take to 
	 * reach the point (x,y). 
	 * @param x	The x coordinate of the camp-site
	 * @param y	The y coordinate of the camp-site
	 */
	public void campsite(int x, int y) {
		this.campsiteSolver(x, y, 0, 0, "");
	}
	/**
	 * Recursively search all different potential paths to reach the
	 * point (targetX,targetY) from the starting point (currX,currY).
	 * @param targetX	The x coordinate of the camp-site
	 * @param targetY	The y coordinate of the camp-site
	 * @param currX		The current x coordinate of the search
	 * @param currY		The current y coordinate of the search
	 * @param path		The current path that has been taken to be at (currX,currY)
	 */
	private void campsiteSolver(int targetX, int targetY, int currX, int currY, String path) {
		if(currX == targetX && currY == targetY) {
			System.out.println(path.trim());
		}
		else if(currX <= targetX && currY <= targetY) {
			this.campsiteSolver(targetX, targetY, currX+1, currY, path + "E ");
			this.campsiteSolver(targetX, targetY, currX, currY+1, path + "N ");
			this.campsiteSolver(targetX, targetY, currX+1, currY+1, path + "NE ");
		}
		else {
			return;
		}
	}
	/**
	 * Determines the subset of nums that has the largest
	 * sum without going over the limit.
	 * @param nums	The list of potential numbers to pull from
	 * @param limit	The maximum number that the sum cannot go over
	 * @return		The sum of the largest subset of nums
	 */
	public int getMax(List<Integer> nums, int limit) {
		this.maxTotal = Integer.MIN_VALUE;
		for(int i = 0; i < nums.size(); i++) {
			this.knapsack(nums, limit, i, 0);
		}
		return this.maxTotal;
	}
	private int maxTotal;	// A private global variable that keeps track of the current highest total
	/**
	 * Recursively takes the permutations of the list of nums and determines
	 * the largest sum of the given subset without going over the limit.
	 * @param nums		The list of potential numbers to pull from
	 * @param limit		The maximum number that the sum cannot go over
	 * @param index		The index of the current number being tested
	 * @param currTotal	The current total of this iteration
	 * @return			The greatest sum starting at the original index of this given iteration
	 */
	private int knapsack(List<Integer> nums, int limit, int index, int currTotal) {
		currTotal += nums.get(index);
		if(currTotal > limit) {
			return currTotal;
		}
		else {
			 index++;
			 for(int i = index; i < nums.size(); i++) {
				 int iterationTotal = knapsack(nums, limit, i, currTotal);
				 if(iterationTotal > maxTotal && iterationTotal <= limit) {
					 maxTotal = iterationTotal;
				 }
			 }
		}
		return currTotal;
	}
	/**
	 * Determines the total number of combinations of pennies,
	 * nickels, dimes, and quarters that can make up the passed amount
	 * @param amount	The amount that is being made into change
	 * @return			The number of different combinations of amount that can be made up in change
	 */
	public int makeChange(int amount) {
		return this.count(new int[] {1,5,10,25}, 4, amount);
	} 
	/**
	 * Recursively checks the number of combinations that can be made with the given coins
	 * @param coins	The list of different subdivisions of change that can be made into a single coin
	 * @param m		The index of the current coin being checked
	 * @param n		The total amount of change needed to be filled
	 * @return		The number of different combinations of coins that can be evenly made into amount
	 */
	private int count(int[] coins, int m, int n) {
		if(n == 0) {
			return 1;
		}
		else if(n < 0) {
			return 0;
		}
		if(m <= 0 && n >= 1) {
			return 0;
		}
		return this.count(coins, m-1, n) + this.count(coins, m, n-coins[m-1]);
	}
	/**
	 * Determines the different combination of coins that
	 * can evenly be made into the passed amount
	 * @param amount	The money that is being made into change
	 */
	public void makeChangeCoinCount(int amount) {
		System.out.println("  P N D Q" + "\n------------");
		this.coinCombinations(new int[] {1,5,10,25}, 4, amount, new int[] {0,0,0,0});
	}
	/**
	 * Recursively checks the current combination of coins to see if 
	 * they can evenly be made with the given coins.
	 * @param coins				The list of different subdivisions of change that can be made into a single coin
	 * @param m					The index of the current coin being checked
	 * @param n					The total amount of change needed to be filled
	 * @param coinsBeingUsed	An array describing the current number of coins being used in this iteration
	 */
	private void coinCombinations(int[] coins, int m, int n, int[] coinsBeingUsed) {
		if(n == 0) {
			System.out.println(Arrays.toString(coinsBeingUsed));
			return;
		}
		else if(n < 0) {
			return;
		}
		if(m <= 0 && n >= 1) {
			return;
		}
		this.coinCombinations(coins, m-1, n, coinsBeingUsed);
		coinsBeingUsed[m-1]++;
		this.coinCombinations(coins, m, n-coins[m-1], coinsBeingUsed);
		coinsBeingUsed[m-1]--;
	}
	/**
	 * Determines and returns the longest common subsequence of a and b
	 * @param a	The first string
	 * @param b	The second string
	 * @return	The LCS of a and b
	 */
	public String longestCommonSub(String a, String b) {
		if(a.charAt(0) == b.charAt(0)) {
			return (a.length() == 1 || b.length() == 1) ? "" + a.charAt(0) : "" + a.charAt(0) + longestCommonSub(a.substring(1), b.substring(1));
		} 
		else {
			String word1 = "", word2 = "";
			if(a.length() >= 2) {
				word1 = this.longestCommonSub(a.substring(1), b);
			}
			if(b.length() >= 2) {
				word2 = this.longestCommonSub(a, b.substring(1));
			}
			return word1.length() > word2.length() ? word1 : word2;
		}
	}
}
