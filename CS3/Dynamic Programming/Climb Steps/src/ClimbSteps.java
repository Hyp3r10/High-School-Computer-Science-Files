import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClimbSteps {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("steps.dat"));
		int numTimes = scan.nextInt();
		while(numTimes-->0) {
			int numStairs = scan.nextInt();
			System.out.println(climbSteps(0, new long[numStairs]));
		}
	}
	/**
	 * Calculates and returns the number of different ways
	 * to get from the 0th step to the ith step storing
	 * previous results in a dp array
	 * @param index	The current index being searched
	 * @param dp	The dp array storing previous results
	 * @return		The number of possible ways to get to the ith step
	 */
	private static long climbSteps(int index, long[] dp) {
		if(index >= dp.length) {
			return dp[dp.length-1];
		}
		else if(index == 0) {
			dp[index] = 1;
			return climbSteps(index+1, dp);
		}
		else if(index == 1) {
			dp[index] = 2;
			return climbSteps(index+1, dp);
		}
		else if(index == 2) {
			dp[index] = 4;
			return climbSteps(index+1, dp);
		}
		else {
			dp[index] = dp[index-3] + dp[index-2] + dp[index-1];
			return climbSteps(index+1, dp);
		}
	}
}
