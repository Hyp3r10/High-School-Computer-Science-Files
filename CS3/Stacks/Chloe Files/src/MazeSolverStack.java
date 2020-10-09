import java.util.Stack;

public class MazeSolverStack extends MazeSolver {
	MyStack stack1;
	Square stack;


	/**
	 * 
	 * @param maze
	 */
	public MazeSolverStack(Maze maze) {
		// get rid of these other calls because uneccessary and should be done by the implementing classes 
		super(maze);
//		 stack1 = new MyStack(); 
//		 add(maze.getStart()); 
//		 solve();
	}

	/**
	 * 
	 */
	@Override
	public void makeEmpty() {
		stack1 = new MyStack();

	}

	/**
	 * 
	 */
	@Override
	public void add(Square s) {
		stack1.push(s);

	}

	/**
	 * 
	 */
	@Override
	public Square next() {
		// will need to be changed to pop
		return stack1.peek();

	}

	/**
	 * 
	 */
	@Override
	boolean isEmpty() {

		return stack1.isEmpty();
	}

}


