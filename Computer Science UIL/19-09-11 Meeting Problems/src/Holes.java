import java.util.*;
import java.io.*;

public class Holes
{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(new File("holes.dat"));
		
		int times = s.nextInt();
		
		for(int i = 0; i < times; i++)
		{
			int rows = s.nextInt();
			int cols = s.nextInt();
			int sect = 1;
			int spaces = 0;
			
			char[][] mat = new char[rows][cols];
			String dum = s.nextLine();
			for(int j = 0; j < mat.length; j++)
			{
				String line = s.nextLine();
				for(int k = 0; k < mat[j].length; k++)
				{
					mat[j][k] = line.charAt(k);
				}
			}
			
			for(int k = 1; k < mat[0].length-1; k++)
			{
				boolean isWall = true;
				for(int j = 0; j < mat.length; j++)
				{
					if(mat[j][k] != '#')
						isWall = false;
					if(mat[j][k] == '.')
						spaces++;
				}
				if(isWall)
					sect++;
			}
			
			System.out.println(sect + " sections, " + spaces + " spaces");
		}
	}
}
