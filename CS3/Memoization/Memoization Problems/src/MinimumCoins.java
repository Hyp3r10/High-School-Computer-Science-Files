import java.util.TreeMap;

public class MinimumCoins {
	public TreeMap<Integer, Integer> totalToCoins;	// A TreeMap where a given integer points to the minimum number of coins needed to make that value in change
	public int[] memo;								// An array where a value at a given index represents the minimum number of coins needed to make the index in change
	/**
	 * Using the memo Array, calculate the minimum number of coins needed
	 * given the array of potential coins needed to make exact change for
	 * the passed total. 
	 * @param total	The target total that we are looking for 
	 * @param coins	The different denominations of coins available
	 * @return		The minimum number of coins needed to make exact change of total
	 */
	public int minCoinsArray(int total, int[] coins) {
		memo = new int[total+1];
		memo[0] = 0;
		memo[1] = 1;
		for(int i = 2; i < total+1; i++) {
			memo[i] = -1;
		}
		this.minCoinsArrayHelper(total, coins);
		return memo[total];
	}
	/**
	 * Calculates the minimum number of coins needed to make exact
	 * change of the current temporary total (recursively calls itself)
	 * using the memo array.
	 * @param total	The current temporary total
	 * @param coins	The coins available to us
	 * @return		The minimum number of coins needed to make the current temporary total in exact change
	 */
	private int minCoinsArrayHelper(int total, int[] coins) {
		if(memo[total] != -1) {
			return memo[total]; 
		}
		int minCoinsNeeded = Integer.MAX_VALUE;
		for(int i = 0; i < coins.length; i++) {
			int result = total - coins[i];
			int val = Integer.MAX_VALUE;
			if(result >= 0) {
				val = minCoinsArrayHelper(result, coins) + 1;
			}
			if(val < minCoinsNeeded) {
				minCoinsNeeded = val;
			}
		}
		memo[total] = minCoinsNeeded;
		return minCoinsNeeded;
	}
	/**
	 * Using the totalToCoins Map, calculate the minimum number of coins needed
	 * given the array of potential coins needed to make exact change for
	 * the passed total. 
	 * @param total	The target total that we are looking for 
	 * @param coins	The different denominations of coins available
	 * @return		The minimum number of coins needed to make exact change of total
	 */
	public int minCoinsMap(int total, int[] coins) {
		totalToCoins = new TreeMap<Integer, Integer>();
		totalToCoins.put(0, 0);
		totalToCoins.put(1, 1);	
		this.minCoinsMapHelper(total, coins);
		return this.totalToCoins.get(total);
	}
	/**
	 * Calculates the minimum number of coins needed to make exact
	 * change of the current temporary total (recursively calls itself)
	 * using the Map.
	 * @param total	The current temporary total
	 * @param coins	The coins available to us
	 * @return		The minimum number of coins needed to make the current temporary total in exact change
	 */
	private int minCoinsMapHelper(int total, int[] coins) {
		if(this.totalToCoins.containsKey(total)) {
			return totalToCoins.get(total); 
		}
		int minCoinsNeeded = Integer.MAX_VALUE;
		for(int i = 0; i < coins.length; i++) {
			int result = total - coins[i];
			int val = Integer.MAX_VALUE;
			if(result >= 0) {
				val = minCoinsMapHelper(result, coins) + 1;
			}
			if(val < minCoinsNeeded) {
				minCoinsNeeded = val;
			}
		}
		this.totalToCoins.put(total, minCoinsNeeded);
		return minCoinsNeeded;
	}
}
