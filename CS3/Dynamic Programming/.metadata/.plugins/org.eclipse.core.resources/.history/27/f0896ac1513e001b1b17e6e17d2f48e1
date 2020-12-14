import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountPaths {
	public static int R, C;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("paths.dat"));
		long numTimes = scan.nextInt();
		while(numTimes-->0) {
			R = scan.nextInt();
			C = scan.nextInt();
			System.out.println(numPaths(new long[R][C]));
		}
	}
	/**
	 * Calculates the number of paths to get from the top 
	 * right to the bottom left given the passed matrix.
	 * @param grid	The Matrix that we are solving for
	 * @return		The number of unique ways to get from (0,0) to (R,C)
	 */
	public static long numPaths(long[][] dp) {
		if(R == 0 || C == 0) {
			return 0;
		}
		dp(0, 0, dp);
		return dp[R-1][C-1];
	}
	/**
	 * Private helper method that recursively searches
	 * the matrix for number of paths to a given polong (r,c)
	 * @param r	The current row
	 * @param c	The current column
	 */
	private static void dp(int r, int c, long[][] dp) {
		if(r == 0 || c == 0) {
			dp[r][c] = 1;
		}
		else {
			dp[r][c] = dp[r-1][c] + dp[r][c-1] + dp[r-1][c-1];
		}
		if(inBounds(r+1, c)) {
			dp(r+1, c, dp);
		}
		if(inBounds(r, c+1)) {
			dp(r, c+1, dp);
		}
		if(inBounds(r+1, c+1)) {
			dp(r+1, c+1, dp);
		}
	}
	/**
	 * Checks to see if the polong (currR,currC) is in bounds
	 * @param currR	The current row
	 * @param currC	The current column
	 * @return		If (currR,currC) is in bounds
	 */
	private static boolean inBounds(long currR, long currC) {
		return (currR >= 0) && (currR < R) && (currC >= 0) && (currC < C);
	}
}
