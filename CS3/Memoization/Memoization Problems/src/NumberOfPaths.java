public class NumberOfPaths {
	public int[][] memo;	// The matrix that represents the number of unique paths to get to (r,c)
	public int R, C;		// The boundaries of the matrix
	/**
	 * Calculates the number of paths to get from the top 
	 * right to the bottom left given the passed matrix.
	 * @param grid	The Matrix that we are solving for
	 * @return		The number of unique ways to get from (0,0) to (R,C)
	 */
	public int numPaths(int[][] grid) {
		this.R = grid.length;
		this.C = grid[0].length;
		memo = grid;
		this.dp(0, 0);
		return memo[R-1][C-1];
	}
	/**
	 * Private helper method that recursively searches
	 * the matrix for number of paths to a given point (r,c)
	 * @param r	The current row
	 * @param c	The current column
	 */
	private void dp(int r, int c) {
		if(this.inBounds(r+1, c)) {
			memo[r+1][c]++;
			dp(r+1, c);
		}
		if(this.inBounds(r, c+1)) {
			memo[r][c+1]++;
			dp(r, c+1);
		}
	}
	/**
	 * Checks to see if the point (currR,currC) is in bounds
	 * @param currR	The current row
	 * @param currC	The current column
	 * @return		If (currR,currC) is in bounds
	 */
	private boolean inBounds(int currR, int currC) {
		return (currR >= 0) && (currR < this.R) && (currC >= 0) && (currC < this.C);
	}
}
