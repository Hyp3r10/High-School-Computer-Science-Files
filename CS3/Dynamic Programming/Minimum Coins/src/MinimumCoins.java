import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MinimumCoins {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("coins.dat"));
		int numTimes = scan.nextInt();
		while(numTimes-->0) {
			int target = scan.nextInt(); scan.nextLine();
			int[] dp = new int[target+1];
			String[] line = scan.nextLine().split(" ");
			int[] coins = new int[line.length];
			for(int i = 0; i < line.length; i++) {
				coins[i] = Integer.parseInt(line[i]);
			}
			dp(1, coins, dp);
			System.out.println(dp[target] != Integer.MAX_VALUE ? dp[target] + " coins\n" : "Not possible with the given denominations\n");
		}
	}
	/**
	 * Determines the minimum number of coins needed to make change with
	 * the target, where an index in the dp array represents the amount
	 * which the value at dp[index] makes minimum change with. 
	 * @param index	The current value being searched
	 * @param coins	The coins that are at our disposal that can be used to make change
	 * @param dp	The array that keeps track of the answers to subproblems
	 */
	public static void dp(int index, int[] coins, int[] dp) {
		if(index == dp.length) {
			return;
		}
		else {
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < coins.length; i++) {
				if(index - coins[i] >= 0) {
					int x = dp[index - coins[i]];
					if(x == Integer.MAX_VALUE) {
						continue;
					}
					min = Math.min(min, dp[index - coins[i]] + 1);
				}
			}
			dp[index] = min;
			dp(index+1, coins, dp);
		}
	}
}
