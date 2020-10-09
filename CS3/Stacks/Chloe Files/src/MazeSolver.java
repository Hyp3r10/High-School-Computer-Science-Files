import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public abstract class MazeSolver {
	// need to create public variables to describe the solving status of the maze. 
	// this needs to be both if it is currently solved or not, and if it is solvable or not.
	// these variables will be used by the step and isSolved methods
	MyStack stack;
	Maze m;

	/**
	 * Constructor that takes a Maze as a
	 *  parameter (the maze to be solved) and stores it
	 * in a variable that extending
	 * classes can access.
	 * @param maze
	 */
	public MazeSolver(Maze maze)
	{
		m = new Maze();
		makeEmpty();
		add(maze.getStart());
		//System.out.println(m.getStart());
		

	}

	
	public abstract void makeEmpty();


	public abstract void add(Square s);

	public abstract Square next();
	
	abstract boolean isEmpty();

	/**
	 * 
	 * @return will return true if A path from 
	 * the start to the exit has 
	 * been found; OR You determine there
	 *  is no such path 
	 */
	public boolean isSolved()
	{ 
		// this needs to be re-written to not pull the element because that is the job of step()
		if(m.getExit().equals(next()))
			return true;
		return false;
	}
	// May just be faster to re-write this method than try and change it completely. Ask her what her throughts are.
	/**
	 * Perform one iteration of the algorithm that should solve
	 * the maze
	 */
	public void step()
	{
		// we need to pull the item at the very beginning.
		
		// this will need to be re-written (append) code so that it changes that status 
		// of the variables dealing with solved status. 
		if(!isEmpty())
		{
			// we need to re-write this so that 
			List<Square> list = new ArrayList<Square>();
			list = m.getNeighbors(next());
			isSolved();
			// see comment bellow
			int empties = 0;
			for(int i = 0; i < list.size(); i++)
			{
				// we need to change this so that the status mutator is actually changing the maze
				// and not just the stack. 
				System.out.println(list);
				if(next().getStatus() == '_') {
				stack.push(list.get(i));
				stack.peek().setStatus('o');
				empties++;
				}
							
			}
			
			stack.peek().setStatus('.');
			
			// what is the purpose of this??? 
			// Is this meant to remove the elements that have already been searched?
			// If so, this should have already happened before now. 
			if(empties == 0) {
				stack.pop();
				while(stack.peek().getStatus() == '.')
					stack.pop();
			}
			
			
		}
		getPath();
	}
	
	/**
	 * 
	 * @return Return whether this maze 
	 * is not yet solved, solved, or unsolvable.
	 */
	public String getPath()
	{
		if(isSolved())
			return "Solved";
		if(!isSolved() && !isEmpty())
			return "not yet solved";
		return "unsolvable";
	}

	/**
	 * Repeatedly call step while the maze is not solved
	 */
	public void solve()
	{
		if(!isSolved())
		step();
	}


}

