import java.util.Scanner;
import static java.lang.System.*;

public class KittyMap80pt
{
	private boolean[][] kittyGrid;
	private int r;
	private int c;

	/*
	 *this constructor loads in random true and false values
	 */
	public KittyMap80pt(int rows, int cols) {
		r = rows;
		c = cols;
		kittyGrid = new boolean[r][c];

		for(int out = 0; out < r; out++) {
			for(int in = 0; in < c; in++) {
				if((int)((Math.random() * 100) + 1) <= 25) {
					kittyGrid[out][in] = true;
				}
				else {
					kittyGrid[out][in] = false;
				}
			}
		}
	}

	/*
	 *this method will call getKittyCounts
	 *to retrieve the total count of kitties in the grid
	 */
	public void printKittyCount() {
		System.out.println("There are " + getKittyCount(r,c) + " kitties.");
	}

	/*
	 *this method will calculate the kitty counts for each cell
	 *if cell is true set int value to 9
	 *if cell is not true set int value to cnt of kitties in adjacent cells
	 */
	private int[][] getKittyCountsGrid()
	{
		return null;
	}

	/*
	 *This method will return the total count of kitties in the the grid
	 */
	public int getKittyCount( int r, int c)
	{
		int count = 0;
		for(int out = 0; out < r; out++) {
			for(int in = 0; in < c; in++) {
				if(kittyGrid[out][in]) {
					count++;
				}
			}
		}
		return count;
	}
	/*
	 *check r and c to ensure they are inside the grid
	 */
	private boolean inBounds( int r, int c)
	{
		return false;
	}

	/*
	 *return the kitty grid as a string
	 */
	public String toString()
	{
		String output="Boolean Grid:\n";
		for(int out = 0; out < r; out++) {
			for(int in = 0; in < c; in++) {
				output += (((kittyGrid[out][in]) ? 1 : 0) + " ");
			}
			output += "\n";
		}
		return output.trim();
	}
}