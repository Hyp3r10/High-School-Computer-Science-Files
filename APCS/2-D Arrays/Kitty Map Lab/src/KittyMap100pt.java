import java.util.Scanner;
import static java.lang.System.*;

public class KittyMap100pt
{
	private boolean[][] kittyGrid;
	private int[][] kittySweeper;
	private int r;
	private int c;
	private int masterOut;
	private int masterIn;

	/*
	 *this constructor loads in random true and false values
	 */
	public KittyMap100pt(int rows, int cols) {
		r = rows;
		c = cols;
		kittyGrid = new boolean[r][c];
		kittySweeper = new int[r][c];

		for(int out = 0; out < r; out++) {
			for(int in = 0; in < c; in++) {
				if((int)((Math.random() * 100) + 1) <= 29) {
					kittyGrid[out][in] = true;
					kittySweeper[out][in] = 1;
				}
				else {
					kittyGrid[out][in] = false;
					kittySweeper[out][in] = 0;
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
	 *this method will calculate the kitty counts for each cell
	 *if cell is true set int value to 9
	 *if cell is not true set int value to cnt of kitties in adjacent cells
	 */
	private int[][] getKittyCountsGrid()
	{
		//Switches boolean to integers
		int[][] tmp = new int[r][c];
		for(int out = 0; out < r; out++) {
			for(int in = 0; in < c; in++) {
				if(kittySweeper[out][in] == 1) {
					tmp[out][in] = 9;
				}
				else {
					tmp[out][in] = 0;
				}
			}
		}
		for(masterOut = 0; masterOut < r; masterOut++) {
			for(masterIn = 0; masterIn < c; masterIn++) {
				if(tmp[masterOut][masterIn] >= 9) {
					for(int iOut = -1; iOut < 2; iOut++) { // Runs 3 times r-1, r, r+1
						for(int iIn = -1; iIn < 2; iIn++) { // Runs 3 times c-1, c, c+1
							if(inBounds(iOut, iIn)) {
								tmp[iOut + masterOut][iIn + masterIn]++;
							}
						}
					}
				}
			}
		}
		// Makes any numbers grater than 9 back to 9
		for(int i = 0; i < r; i++) {
			for(int o  = 0; o < c; o++) {
				if(tmp[i][o] >= 9) {
					tmp[i][o] = 9;
				}
			}
		}
		return tmp;
	}
	/*
	 *check r and c to ensure they are inside the grid
	 */
	private boolean inBounds(int r, int c)
	{
		int tmpRow = r + masterOut;
		int tmpCol = c + masterIn;
		if(tmpRow < 0 || tmpRow >= this.r) {
			return false;
		}
		if(tmpCol < 0 || tmpCol >= this.c) {
			return false;
		}
		else {
			return true;
		}
	}
	/*
	 *return the kitty grid as a string
	 */
	public String toString()
	{
		String output = "Boolean Grid:\n";
		for(int out = 0; out < r; out++) {
			for(int in = 0; in < c; in++) {
				output += (((kittyGrid[out][in]) ? 1 : 0) + " ");
			}
			output += "\n";
		}
		kittySweeper = getKittyCountsGrid();
		output += "\nKitty Grid:\n";
		for(int out = 0; out < r; out++) {
			for(int in = 0; in < c; in++) {
				output += (kittySweeper[out][in] + " ");
			}
			output += "\n";
		}
		return output.trim();
	}
}