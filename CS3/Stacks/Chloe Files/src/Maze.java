import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Maze {
	private Square start;
	private Square exit;
	private Square [][] squareArray;


	public Maze()
	{
		// Needs to give all Global variables a default value.
		squareArray = new Square[0][0];
		start = new Square(0,0,2);
		exit = new Square(0,0,3);
	}

	// Perfect method. All problems have been fixed.
	/**
	 * loads in the maze
	 * @param fileName the name of the file to be loaded in
	 * @return wether or not the file could be loaded in
	 */
	public boolean loadMaze(String fileName)
	{
		System.out.println(fileName);
		try {
			Scanner s = new Scanner(new File(fileName));
			//String[] firstLine = s.nextLine().split(" ");
			int rows = s.nextInt();
			int cols = s.nextInt();
			squareArray = new Square [rows][cols];

			for(int i = 0; i < rows; i++) {
				//String[] line = s.nextLine().split(" ");
				for(int k = 0; k < cols; k++) {
					int type = s.nextInt();
					squareArray[i][k] = new Square(i,k,type);
					if(type == Square.START) {
						start = squareArray[i][k];
					}
					if(type == Square.EXIT)
						exit = squareArray[i][k];

				}
			}

			s.close();	
		} catch (IOException i) {
			System.out.println("nofile");
			return false;

		}
		return true;
	}

	/**
	 * finds the neighbors around a square
	 * @param s a square object
	 * @return the neighboring squares around an object
	 */
	public List<Square> getNeighbors(Square s)
	{
		List<Square> list = new ArrayList<Square>();

		int row = s.getRow();
		int col = s.getCol();
		// some of these need to be working at zero
		// change them to be >= 0
		if(row-1 > 0)
			list.add(squareArray[row-1][col]);
		if(col+1 < squareArray.length)
			list.add(squareArray[row][col+1]);
		if(row+1 < squareArray.length)
			list.add(squareArray[row+1][col]);
		if(col-1 > -1)
			list.add(squareArray[row][col-1]);


		return list;
	}

	/**
	 * returns the start of the maze
	 * @return the start of the makes
	 */
	public Square getStart()
	{
		return start;
	}

	/**
	 *  returns the exit of the maze
	 * @return the exit of the makes
	 */
	public Square getExit()
	{
		return exit;
	}

	/**
	 *  sets the maze back to its orginal state
	 */
	public void reset()
	{
		for(int row = 0; row < squareArray.length; row++) {
			for(int col = 0; col < squareArray[row].length; col++)
			{
				squareArray[row][col].clear();
			}
		}
	}

	/**
	 *  returns a toString of the maze
	 */
	@Override
	public String toString()
	{
		// should include a space after each to string call. 
		String x = new String();
		for(int row = 0; row < squareArray.length; row++) {
			for(int col = 0; col < squareArray[row].length; col++)
			{
				x += squareArray[row][col];
			}
			x += '\n';
		}
		return x;

	}


}


