import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
	private int[][] maze;
	private boolean exitFound;
	public Maze(int size, String line)
	{
		// instantiate maze 2d Array
		maze = new int[size][size];
		// assign exitFound a value
		exitFound = false;

		Scanner chop = new Scanner(line);
		for(int r = 0; r < maze.length; r++) {
			for(int c = 0; c < maze[r].length; c++) { 
				maze[r][c] = chop.nextInt();
			}
		}
	}
	public void hasExitPath(int r, int c)
	{
		if(r > -1 && r < maze.length && c > -1 && c < maze[r].length && maze[r][c] == 1) {
			maze[r][c] = 2;
			if(c == maze[r].length-1) {
				exitFound = true;
			}
			else {
				hasExitPath(r-1, c); hasExitPath(r, c-1); hasExitPath(r+1, c); hasExitPath(r, c+1);
			}
		}
	}
	public String toString()
	{
		String output="";
		for(int i = 0; i < maze.length;i++)
		{
			for(int m = 0; m < maze[i].length;m++)
			{
				if( maze[i][m] == 2)
					maze[i][m] = 1;
				output += maze[i][m] + " ";
			}
			output+= "\n";
		}
		
		if(exitFound) 
			output += "exit found\n";
		else 
			output += "exit not found\n";
		
		return output;
	}
}