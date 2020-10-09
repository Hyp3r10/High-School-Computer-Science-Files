
public class Square {
	/**
	 * A set of final integers that denote the type of square that this is in the maze
	 */
	public static final int EMPTY = 0;
	public static final int WALL = 1;
	public static final int START = 2;
	public static final int EXIT = 3;
	/**
	 * A set of final characters that denote the status of a particular square 
	 * for use by the GUI in showing the maze being solved graphically.
	 */
	public static final char WORKING = 'o';
	public static final char EXPLORED = '.';
	public static final char ON_EXIT_PATH = 'x';
	public static final char UNKNOWN = '_';
	/**
	 * Variables that represent this current square's position in the maze
	 */
	private int row, col;
	/**
	 * Variable that represents this current square's type
	 */
	private int type;
	/**
	 * Variable that represents this current square's status as defined
	 * by the global final variables used by the GUI
	 */
	private char status;
	/**
	 * Constructor to create a new Square object at a specific location and of the
	 * given type of either wall, empty, start, or end
	 * @param row	The r coordinate of this Square's position on the maze
	 * @param col	The c coordinate of this Square's position on the maze
	 * @param type	The type of space that this square is on the maze
	 */
	public Square(int row, int col, int type) {
		this.row = row;
		this.col = col;
		this.type = type;
	}
	/**
	 * Returns the global variable row
	 * @return	row
	 */
	public int getRow() {
		return this.row;
	}
	/**
	 * Returns the global variable col
	 * @return	col
	 */
	public int getCol() {
		return this.col;
	}
	/**
	 * Returns the global variable type
	 * @return	type
	 */
	public int getType() {
		return this.type;
	}
	/**
	 * Resets the status of this cell if the type is an Empty cell.
	 */
	public void reset() {
		if(this.type == EMPTY) {
			this.status = UNKNOWN;
		}
	}
	/**
	 * Returns the global variable status
	 * @return	status
	 */
	public char getStatus() {
		return this.status;
	}
	/**
	 * Mutates the status variable to be equal to a new status
	 * @param newStatus	The new status to assign to the global variable status
	 */
	public void changeStatus(char newStatus) {
		this.status = newStatus;
	}
	/**
	 * Helper method to convert the integer representation of 
	 * the type into the character representation of such.
	 * @return	The character representation of type
	 */
	private char typeAsChar() {
		switch(this.type) {
			case 0 : {
				return '_';
			}
			case 1 : {
				return '#';
			}
			case 2 : {
				return 'S';
			}
			case 3 : {
				return 'E';
			}
			default : {
				return ' ';
			}
		}
	}
	@Override
	public boolean equals(Object obj) {
		Square other = (Square) obj;
		return this.row == other.row && this.col == other.col;
	}
	@Override
	public String toString() {
		return "" + (this.type == EMPTY ? this.status : typeAsChar());
	}
}
