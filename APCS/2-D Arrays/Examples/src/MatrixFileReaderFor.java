
//Matrix file reader with a for loop

import java.util.Scanner;
import static java.lang.System.*;
import java.io.File; // need to import to read files
import java.io.IOException; // need to import to read files


public class MatrixFileReaderFor
{
	public static void main(String args[]) throws IOException //include "throws IOException" at the end of ant method header that will be reading a file
	{
		Scanner file = new Scanner( new File("for.dat"));
		Scanner keyboard = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();  //buffer clearing code

		for( int i=1; i<=times; i++ )
		{
			int size = file.nextInt();
			file.nextLine();  //buffer clearing code

			char mat[][] = new char[size][size];

			for( int r=0; r<mat.length; r++)
			{
				String line = file.nextLine();
				for( int c=0; c<mat[r].length; c++)
				{
					mat[r][c] = line.charAt(c);
				}
			}

			out.println("\n\nMatrix Values");
			for( int r = 0; r < mat.length; r++)
			{
				for( int c = 0; c < mat[r].length; c++)
				{
					out.print(mat[r][c]);
				}
				out.println();
			}
		}
	}
}