import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("maze.dat"));
		while(file.hasNext()) {
			// size of the board
			int size = file.nextInt();
			file.nextLine();

			// The whole board as one string
			String temp = file.nextLine();

			// Break up the tring into its respective size
			Scanner scan = new Scanner(temp);
			int[][] board = new int[size][size];
			for(int k = 0; k < size; k++) {
				for(int j = 0; j < size; j++) {
					board[k][j] = scan.nextInt();
				}
			}

			// Create a new Maze object with the board and size
			Maze maze = new Maze(size, board);
			System.out.println(maze);
		}
	}
}

class Maze {
	// Instance variables used in the constructor
	public int size;
	public int[][] maze; 
	public ArrayList shortestPath = new ArrayList<int[]>();

	// Constructor used to initialize the values
	public Maze(int size, int[][] board) {
		this.size = size;
		this.maze = board;
	}

	// Checks to see if there is a path...
	public boolean solve(boolean[][] previous, int r, int c) {
		// If we are on the last column and the tile is a '1' then return true. Else...
		if(c == size-1 && maze[r][c] == 1) {
			return true;
		}

		// Check to see if it is in the size of the board and see if the tile is equal to '1', if so, then...
		if(r < size && r >= 0 && c < size && c >= 0 && maze[r][c] == 1) {
			// Mark this spot as checked
			previous[r][c] = true;

			// Check the tile one up from this spot
			if(r-1 < size && r-1 >= 0 && c < size && c >= 0 && !previous[r-1][c]) {
				if(solve(previous, r-1, c)) {
					return true;
				}
			}

			// Check the tile one down from this spot
			if(r+1 < size && r+1 >= 0 && c < size && c >= 0 && !previous[r+1][c]) {
				if(solve(previous, r+1, c)) {
					return true;
				}
			}

			// Check the tile one left from this spot
			if(r < size && r >= 0 && c-1 < size && c-1 >= 0 && !previous[r][c-1]) {
				if(solve(previous, r, c-1)) {
					return true;
				}
			}

			// Check the tile one right from this spot
			if(r < size && r >= 0 && c+1 < size && c+1 >= 0 && !previous[r][c+1]) {
				if(solve(previous, r, c+1)) {
					return true;
				}
			}
		}

		// If there is no exit, then return false
		return false;
	}

	// toString used to print out all of the different mazes and solutions
	public String toString() {
		String output = "\n";

		// Print out the board
		for(int i = 0; i < maze.length; i++) {
			for(int k = 0; k < maze.length; k++) {
				output+=(maze[i][k] + " ");
			}
			output+="\n";
		}

		// Check to see if the maze has an escape
		if(solve(new boolean[size][size], 0,0)) {
			output += "exit found";
		}
		else {
			output+="exit not found";
		}

		// Return everything
		return output;
	}

}