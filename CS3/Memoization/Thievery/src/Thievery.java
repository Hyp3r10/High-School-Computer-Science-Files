import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Thievery {
	public static void main(String[] args) throws FileNotFoundException {
		double timer = System.nanoTime();
		Scanner scan = new Scanner(new File("Knapsack.dat"));
		Thievery tester = new Thievery();
		int numTimes = scan.nextInt(); scan.nextLine();
		while(numTimes-->0) {
			scan.nextLine();
			String[] line = scan.nextLine().split(" - ");
			int numItems = Integer.parseInt(line[0]);
			int maxWeight = Integer.parseInt(line[1]);
			scan.nextLine();
			int[] weights = new int[numItems];
			int[] vals = new int[numItems];
			line = scan.nextLine().split(", ");
			for(int i = 0; i < numItems; i++) {
				weights[i] = Integer.parseInt(line[i]);
			}
			line = scan.nextLine().split(", ");
			for(int i = 0; i < numItems; i++) {
				vals[i] = Integer.parseInt(line[i]);
			}
			Integer[][] dp = new Integer[numItems][maxWeight+1];
			int maxVal = (tester.knapsack(dp, weights, vals, 0, maxWeight));
			System.out.println("-Max Weight: " + maxWeight);
			System.out.println("-Max Value: " + maxVal);
			System.out.println("\n");
		}
		System.out.println("Executed in " + (double) (System.nanoTime()-timer) / 1000000000  + " seconds... not 24 hours :P");
	}
	/**
	 * Dynamic Programming version of Knapsack Algorithm
	 * Calculates the maximum value achievable without exceeding 
	 * the value of maximum weight. A given position at dp[index][capacity]
	 * represents the total value obtainable should we begin at 
	 * the given index and had a given capacity.
	 * @param dp		The memoization 2D array that allows us to store calculations
	 * @param weights	The list of weights
	 * @param vals		The list of values
	 * @param index		The current index that we are exploring
	 * @param capacity	The current remaining capacity
	 * @return			The value at dp[index][capacity] which represents the maximum value obtainable at a given starting index and capacity used
	 */
	public int knapsack(Integer[][] dp, int[] weights, int[] vals, int index, int capacity) {
		if(capacity <= 0 || index >= weights.length) {
			return 0;
		}
		// If we have already calculated this before...
		if(dp[index][capacity] != null) {
			return dp[index][capacity];
		}
		int tempVal1 = 0;
		// recursive call after having used the current element at index
		if(weights[index] <= capacity) {
			tempVal1 = vals[index] + knapsack(dp, weights, vals, index+1, capacity - weights[index]);
		}
		// recursive call after not using the current element at index
		int tempVal2 = knapsack(dp, weights, vals, index+1, capacity);
		// Optimizing for whichever option was greater
		dp[index][capacity] = Math.max(tempVal1, tempVal2);
		return dp[index][capacity];
	}
}
