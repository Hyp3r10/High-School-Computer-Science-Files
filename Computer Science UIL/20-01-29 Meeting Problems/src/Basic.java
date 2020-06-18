import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Basic
{
	public static void main( String args[] ) throws IOException
	{
		Scanner s = new Scanner(new File("maze.dat"));
		
		while(s.hasNext())
		{
			int num = s.nextInt();
			s.nextLine();
			
			int[][] maze = new int[num][num];
			
			String[] nums = s.nextLine().split(" ");
			
			for(int o = 0; o < num * num; o++)
			{
				maze[o/num][o%num] = Integer.parseInt(nums[o]);
			}
			
			for(int[] i : maze)
			{
				for(int number : i)
					System.out.print(number + " ");
				System.out.println();
			}
			
			if(hasExit(maze, new boolean[num][num], 0, 0))
				System.out.println("Exit Found");
			else
				System.out.println("No Exit Found");
			
			System.out.println();
		}
	}
	
	static boolean hasExit(int[][] maze, boolean[][] previous, int currR, int currC)
	{
		if(currC == maze[0].length-1 && maze[currR][currC] == 1)
			return true;
		
		if(currC > -1 && currR > -1 & currR < maze.length && currC < maze[0].length && 
				maze[currR][currC] == 1)
		{
			previous[currR][currC] = true;
			
			if(currR > 0 && !previous[currR-1][currC])
				if(hasExit(maze, previous, currR-1, currC))
					return true;
			if(currR < maze.length-1 && !previous[currR+1][currC])
				if(hasExit(maze, previous, currR+1, currC))
					return true;
			if(currC > 0 && !previous[currR][currC-1])
				if(hasExit(maze, previous, currR, currC-1))
					return true;
			if(currC < maze.length-1 && !previous[currR][currC+1])
				if(hasExit(maze, previous, currR, currC+1))
					return true;
		}
		return false;
	}
}