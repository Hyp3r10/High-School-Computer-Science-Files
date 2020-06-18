
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.IOException;

public class TicTacToeRunner
{
	public static void main(String args[]) throws IOException
	{
		TicTacToe test = new TicTacToe();
		Scanner file = new Scanner( new File("lab24d.dat"));
		
		int iterations = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < iterations; i++) {
			TicTacToe game = new TicTacToe(file.nextLine());
			System.out.println(game);
		}
	}
}