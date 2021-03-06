
public class MazeSolverQueue extends MazeSolver {
	/**
	 * Global variable that denotes the remaining cells needed to
	 * be explored or the path to the exit
	 */
	private MyQueue<Square> worklist;
	/**
	 * Constructor that instantiates the super class 
	 * @param maze
	 */
	MazeSolverQueue(Maze maze) {
		super(maze);
	}
	@Override
	public void makeEmpty() {
		this.worklist = new MyQueue<Square>();
	}
	@Override
	public boolean isEmpty() {
		return this.worklist.isEmpty();
	}
	@Override
	public void add(Square s) {
		worklist.offer(s);
	}
	@Override
	public Square next() {
		return this.worklist.poll();
	}
}
