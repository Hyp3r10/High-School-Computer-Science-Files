import java.util.List;

public abstract class MazeSolver {
	/**
	 * Global variable that represents the current maze being solved
	 */
	private Maze maze;
	/**
	 * Global variable that represents whether or not the maze has been solved
	 */
	private boolean solved;
	/**
	 * Global variable that represents whether or not the maze can be solved
	 */
	private boolean solvable;
	/**
	 * Constructor that initializes the global variable of maze to be equal to
	 * the maze object passes. Then calls makeEmpty() to start the worklist 
	 * and adds the current start position to the worklist.
	 * @param maze	A Maze Object to be used to assign to the global variable
	 */
	MazeSolver(Maze maze) {
		this.maze = maze;
		this.makeEmpty();
		this.add(this.maze.start);
		this.solvable = true;
		this.solved = false;
	}
	/**
	 * Creates an empty worklist. Used by the GUI to construct the worklist.
	 */
	abstract void makeEmpty();
	/**
	 * Returns whether or not the worklist is empty
	 * @return	True if the worklist is empty, false if it is not
	 */
	abstract boolean isEmpty();
	/**
	 * Adds the passed Square Object to the worklist
	 * @param s	The Square Object to be added to the worklist
	 */
	abstract void add(Square s);
	/**
	 * Returns the next Square Object in the worklist.
	 * @return	The next Square Object in the worklist.
	 */
	abstract Square next();
	/**
	 * Returns whether or not the maze has been solved currently
	 * @return	True if the maze has been solved and false if it has not
	 */
	public boolean isSolved() {
		return solved;
	}
	public void step() {
		// If we have no more paths to check, then the exit has not been found and therefore is not solvable
		if(this.isEmpty()) {
			this.solvable = false;
			this.solved = false;
			return;
		}
		// If we do have more cells to check then enter
		else {
			Square curr = this.next();
			// If we have found the exit, update solvable and solved and exit
			if(curr.equals(this.maze.exit)) {
				this.solvable = true;
				this.solved = true;
				return;
			}
			// Else, if the current cell is not a wall (i.e. we can pass through it)
			else if(curr.getType() != Square.WALL) {
				// Get the current position of the current cell
				int[] pos = new int[] {curr.getRow(), curr.getCol()};
				// Get the list of neighbors of the current cell
				List<Square> neighbors = maze.getNeighbors(curr);
				// Add the neighbors to the worklist...
				for(Square temp : neighbors) {
					// Only add the neighbor if it hasn't already been explored
					if(temp.getStatus() == Square.UNKNOWN || temp.getType() == Square.EXIT) {
						temp.changeStatus('o');
						this.add(temp);
						if(temp.parent == null) {
							temp.parent = curr;
						}
					}
				}
				// Indicates that the current cell has been explored
				this.maze.setStatus(pos, '.');
			}
			// If the current cell is a Wall (shouldn't happen), exit
			else {
				return;
			}
		}
	}
	/**
	 * Returns the condition of the Maze -- i.e. whether or not the maze is
	 * solved, not solved, or unsolvable.
	 * @return	A String indicating the condition of the Maze
	 */
	public String getPath() {
		if(solvable) {
			return solved ? this.getPathToExit() : "not yet solved";
		}
		else {
			return "unsolvable";
		}
	}
	/**
	 * Returns a String representation of the path to the exit
	 * @return
	 */
	public String getPathToExit() {
		StringBuilder output = new StringBuilder();
		MyStack path = new MyStack();
		Square curr = this.maze.getExit();
		path.push(curr);
		curr = curr.parent;
		// Deeply go into the parents and add them to the stack
		while(curr != null) {
			path.push(curr);
			curr = curr.parent;
		}
		// Prints the path to the exit and changes the status of the square to show the path
		while(!path.isEmpty()) {
			Square temp = path.pop();
			temp.changeStatus(Square.ON_EXIT_PATH);
			output.append("[" + temp.getRow() + "," + temp.getCol() + "]");
		}
		return output.toString();
	}
	/**
	 * Repeatedly calls step() to attempt to solve the maze 
	 */
	public void solve() {
		while(!this.solved) {
			this.step();
		}
	}
}
