
public class Square {
	final static int EMPTY = 0; //empty space
	final static int WALL = 1;  //a wall
	final static int START = 2; //the start
	final static int EXIT = 3;  //the exit
	
	final static char WORKING      = 'o';
	final static char EXPLORED     = '.';
	final static char ON_EXIT_PATH = 'x';
	final static char UNKOWN       = '_';
 
	private int row,col;
	private int type;
	private char status;
	
	/**
	 * sets the local variables to a value
	 * @param row the row of the sqaure
	 * @param col the col of the square
	 * @param type the type of the square
	 */
	public Square(int row, int col, int type)
	{
		this.row = row;
		this.col = col;
		this.type = type;
		status = '_';
		
	}
	
	/**
	 * 
	 * @return the row number of a square
	 */
	public int getRow()
	{
		return row;
	}
	
	/**
	 * 
	 * @return the col number of a square
	 */
	public int getCol()
	{
		return col;
	}
	
	/**
	 * 
	 * @return the type of a square
	 */
	public int getType()
	{
		return type;
	}
	
	/**
	 * sets the status sin the square
	 * @param s the char status is to be set to
	 */
	public void setStatus(char s)
	{
		status = s;
	}
	
	/**
	 * 
	 * @return the status of the square
	 */
	public char getStatus()
	{
		return status;
	}
	
	/**
	 * 
	 */
	public void clear()
	{
		if(type != WALL)
			status = '_';
	}
	
	@Override
	public boolean equals(Object obj) {
		Square otherSquare = (Square)obj;
		
		return otherSquare.getCol() == getCol() 
				&& otherSquare.getRow() == getRow();
	}
	
	@Override
	public String toString()
	{
		if(type == EXIT)
			return Character.toString('E');
		if(type == WALL)
			return Character.toString('#');
		if(type == START)
			return Character.toString('S');
		else
			return Character.toString(getStatus());
	}
}


