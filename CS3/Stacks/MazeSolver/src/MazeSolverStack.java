
public class MazeSolverStack extends MazeSolver {
	/**
	 * Global variable that denotes the remaining cells needed to
	 * be explored or the path to the exit
	 */
	private MyStack worklist;
	/**
	 * Constructor that instantiates the super class 
	 * @param maze
	 */
	MazeSolverStack(Maze maze) {
		super(maze);
	}
	@Override
	public void makeEmpty() {
		this.worklist = new MyStack();
	}
	@Override
	public boolean isEmpty() {
		return this.worklist.isEmpty();
	}
	@Override
	public void add(Square s) {
		worklist.push(s);
	}
	@Override
	public Square next() {
		return this.worklist.pop();
	}
}
