
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.IOException;

public class TicTacToe
{
	private char[][] mat;
	private int numRows;
	private int numCols;

	public TicTacToe()
	{
		numRows = 0;
		numCols = 0;
		mat = new char[0][0];
	}
	public TicTacToe(String game)
	{
		numRows = 3;
		numCols = 3;
		mat = new char[numRows][numCols];
		
		int index = 0;
		int out = 0; 
		int in = 0;
		while(out < numRows) {
			while(in < numCols) {
				mat[out][in] = game.charAt(index);
				index++;
				in++;
			}
			in = 0;
			out++;
		}
	}
	public String getWinner()
	{
		//Horizontally 
		//mat == 'X'
		if(mat[0][0] == 'X' && mat[0][1] == 'X' && mat[0][2] == 'X') {
			return "X wins horizontally!";
		}
		else if(mat[1][0] == 'X' && mat[1][1] == 'X' && mat[1][2] == 'X') {
			return "X wins horizontally!";
		}
		else if(mat[2][0] == 'X' && mat[2][1] == 'X' && mat[2][2] == 'X') {
			return "X wins horizontally!";
		}
		//mat == 'O'
		else if(mat[0][0] == 'O' && mat[0][1] == 'O' && mat[0][2] == 'O') {
			return "0 wins horizontally!";
		}
		else if(mat[1][0] == 'O' && mat[1][1] == 'O' && mat[1][2] == 'O') {
			return "0 wins horizontally!";
		}
		else if(mat[2][0] == 'O' && mat[2][1] == 'O' && mat[2][2] == 'O') {
			return "0 wins horizontally!";
		}
		//Vertically
		//mat == 'X'
		else if(mat[0][0] == 'X' && mat[1][0] == 'X' && mat[2][0] == 'X') {
			return "X wins vertically!";
		}
		else if(mat[0][1] == 'X' && mat[1][1] == 'X' && mat[2][1] == 'X') {
			return "X wins vertically!";
		}
		else if(mat[0][2] == 'X' && mat[1][2] == 'X' && mat[2][2] == 'X') {
			return "X wins vertically!";
		}
		//mat == 'O'
		else if(mat[0][0] == 'O' && mat[1][0] == 'O' && mat[2][0] == 'O') {
			return "O wins vertically!";
		}
		else if(mat[0][1] == 'O' && mat[1][1] == 'O' && mat[2][1] == 'O') {
			return "O wins vertically!";
		}
		else if(mat[0][2] == 'O' && mat[1][2] == 'O' && mat[2][2] == 'O') {
			return "O wins vertically!";
		}
		//Diagonally
		//mat == 'X'
		else if(mat[0][0] == 'X' && mat[1][1] == 'X' && mat[2][2] == 'X') {
			return "X wins diagonally!";
		}
		else if(mat[0][2] == 'X' && mat[1][1] == 'X' && mat[2][0] == 'X') {
			return "X wins diagonally!";
		}
		//mat == 'O'
		else if(mat[0][0] == 'O' && mat[1][1] == 'O' && mat[2][2] == 'O') {
			return "X wins diagonally!";
		}
		else if(mat[0][2] == 'O' && mat[1][1] == 'O' && mat[2][0] == 'O') {
			return "X wins diagonally!";
		}
		//Tie
		else {
			return "cat's game - no winner!";
		}
	}
	@Override
	public String toString()
	{
		String output = "";
		for(int out = 0; out < numRows; out++) {
			for(int in = 0; in < numCols; in++) {
				output += mat[out][in] + " ";
			}
			output += "\n";
		}
		output += getWinner();
		output += "\n\n";
		return output;
	}
}