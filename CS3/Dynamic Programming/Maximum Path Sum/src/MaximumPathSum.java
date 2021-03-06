import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPathSum {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("triangle.txt"));
		ArrayList<ArrayList<Integer>> tempTriangle = new ArrayList<ArrayList<Integer>>();
		while(scan.hasNextLine()) {
			String[] line = scan.nextLine().split(" ");
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(String temp : line) {
				tempList.add(Integer.parseInt(temp));
			}
			tempTriangle.add(tempList);
		}
		int[][] dp = generateDP(tempTriangle);
		dp(dp.length-1, dp);
		System.out.println(dp[0][0]);
		
	}
	/**
	 * Converts the dynamic triangle representation into the 
	 * 2D array representation of the dp table. 
	 * @param dpList	The dp table represented as a dynamic list
	 * @return			The dp table represented as a 2D static array
	 */
	public static int[][] generateDP(ArrayList<ArrayList<Integer>> dpList) {
		int[][] dp = new int[dpList.size()][0];
		int count = 0;
		for(ArrayList<Integer> currList : dpList) {
			int[] tempArr = new int[currList.size()];
			for(int i = 0; i < currList.size(); i++) {
				tempArr[i] = currList.get(i);
			}
			dp[count++] = tempArr;
		}
		return dp;
	}
	/**
	 * Starting from the bottom row, add the greater of the two 
	 * neighboring cells to the cell above them in the dp array.
	 * Decrement the row of focus each time. The value at (0,0)
	 * should represent the maximum path sum.
	 * @param row	The row of the current scope of focus
	 * @param dp	The dp table used to store maximum paths
	 */
	public static void dp(int row, int[][] dp) {
		if(row == 0) {
			return;
		}
		else {
			for(int i = 0; i < dp[row].length-1; i++) {
				dp[row-1][i] += Math.max(dp[row][i], dp[row][i+1]);
			}
			dp(row-1, dp);
		}
	}
}
