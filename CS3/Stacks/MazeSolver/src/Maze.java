import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maze {
	/**
	 * A 2D Array of Square objects that represents this current maze
	 */
	public Square[][] maze;
	/**
	 * Two sets of Arrays of integers that represent the starting 
	 * and exit positions in the maze
	 */
	public Square start, exit;
	/**
	 * Default constructor that instantiates the global variables 
	 * to be their default values
	 */
	public Maze() {
		this.maze = new Square[0][0];
		this.start = new Square(0, 0, 0);
		this.exit = new Square(0, 0, 0);
	}
	/**
	 * Takes in a String denoting the name of a specific file to instantiate
	 * the maze object to a set of specific values.
	 * @param fileName		A String denoting the name of the file that is being loaded
	 * @return				True if the maze was able to be loaded or false if it wasn't
	 */
	public boolean loadMaze(String fileName) {
		try {
			Scanner scan = new Scanner(new File(fileName));
			int r = scan.nextInt();
			int c = scan.nextInt();
			this.maze = new Square[r][c];
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					int type = scan.nextInt();
					this.maze[i][j] = new Square(i, j, type);
					if(type == Square.START) {
						this.start = maze[i][j];
					}
					else if(type == Square.EXIT) {
						this.exit = maze[i][j];
					}
				}
			}
			scan.close();
			return true;
		}
		catch(IOException e) {
			System.out.println("Error: Filename not found. Please enter a valid filename.");
			return false;
		}
	}
	/**
	 * Create a list of neighboring cells that are in bounds for the searching method
	 * @param s	A Square denoting where to find the neighbors
	 * @return	A List of Square objects indicating the neighbors to the s variable
	 */
	public List<Square> getNeighbors(Square s) {
		List<Square> neighbors = new ArrayList<Square>();
		int r = s.getRow();
		int c = s.getCol();
		// Cell to the North
		if(r-1 < maze.length && r-1 >= 0 && c < maze[r-1].length && c >= 0 && maze[r-1][c].getType() != Square.WALL) {
			neighbors.add(maze[r-1][c]);
		}
		// Cell to the East
		if(r < maze.length && r >= 0 && c+1 < maze[r].length && c+1 >= 0 && maze[r][c+1].getType() != Square.WALL) {
			neighbors.add(maze[r][c+1]);
		}
		// Cell to the South
		if(r+1 < maze.length && r+1 >= 0 && c < maze[r+1].length && c >= 0 && maze[r+1][c].getType() != Square.WALL) {
			neighbors.add(maze[r+1][c]);
		}
		// Cell to the West
		if(r < maze.length && r >= 0 && c-1 < maze[r].length && c-1 >= 0 && maze[r][c-1].getType() != Square.WALL) {
			neighbors.add(maze[r][c-1]);
		}
		return neighbors;
	}
	/**
	 * Returns the Square object of the Starting position in the maze
	 * @return	The Square object denoting the start of the maze
	 */
	public Square getStart() {
		return this.start;
	}
	/**
	 * Returns the Square object of the Exit position in the maze
	 * @return	The Square object denoting the exit of the maze
	 */
	public Square getExit() {
		return this.exit;
	}
	/**
	 * Resets the maze back to the initial state after loading.
	 * This state is the same as the maze prior to starting to be solved
	 */
	public void reset() {
		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				maze[i][j].reset();
			}
		} 
	}
	/**
	 * Mutates a given cell at the position indicated by pos to be a given status
	 * @param pos	The position of the cell being updated
	 * @param set	The status to update the cell to 
	 */
	public void setStatus(int[] pos, char set) {
		int r = pos[0], c = pos[1];
		this.maze[r][c].changeStatus(set);
	}
	@Override
	public String toString() {
		String output = "";
		for(Square[] arr : maze) {
			for(Square curr : arr) {
				output += curr.toString() + " ";
			}
			output += "\n";
		}
		return output;
	}
}
