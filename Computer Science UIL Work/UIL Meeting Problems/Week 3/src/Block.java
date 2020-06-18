import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Block {
	public static String[][] board;
	public static ArrayList delete = new ArrayList<int[]>();
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("block.dat"));

		int numTimes = file.nextInt();
		file.nextLine();

		for(int i = 0; i < numTimes; i++) {
			// Variables to use throughout the lab
			int row = file.nextInt();
			int col = file.nextInt();
			int score = 0;
			file.nextLine();

			// Set the board
			board = new String[row][col];
			for(int j = 0; j < row; j++) {
				String[] temp = file.nextLine().split("");
				board[j] = temp;
			}

			// loop of all the calls
			int numCalls = file.nextInt();
			file.nextLine();

			for(int j = 0; j < numCalls; j++) {
				// Instantiate the variables that are being called
				int choiceRow = file.nextInt()-1;
				int choiceCol = file.nextInt()-1;
				
				file.nextLine();

				boolean[][] checked = new boolean[row][col];
				String letter = board[choiceRow][choiceCol];
				// Recursive method that gets the score
				if(!letter.equals(".")) {
					score = (block(board, choiceRow, choiceCol, delete, letter, checked));
				}
				
				
				// Check to see if the selected blocks were in groups of two or less
				if(delete.size() <= 2) {
					score--;
				}
				// Else, delete the items from the delete list
				else {
					for(int l = 0; l < delete.size(); l++) {
						System.out.println(Arrays.toString((int[]) delete.get(l)));
						/*int[] index = (int[]) delete.get(l);
						board[index[0]][index[1]]= ".";*/
					}
				}
			}

			// Print out the new board and score
			for(int j = 0; j < board.length; j++) {
				System.out.println(Arrays.toString(board[j]));
			}
		}
		file.close();
	}
	private static int block(String[][] board, int row, int col, ArrayList<int[]> delete, String letter, boolean[][] checked) {
		// Tests to make sure that the given indices are actually in bounds
		int[] choice = {row, col};
		if((row > -1 && row < board.length) && (col > -1 && col < board[row].length) && !checked[row][col]) {
			// If the letter at... 
			if(board[row][col].equals(letter)) {
				// Add the parameters to the boolean array
				checked[row][col] = true;
				
				// Check to see if the selected parameters is already been searched and added to the ArrayList
				int num = 0;
				for(int i = 0; i < delete.size(); i++) {
					if(delete.get(i)[0] == row && delete.get(i)[1] == row) {
						num++;
					}
				}
				if(num == 0) {
					
					delete.add(choice);
				}
				
				// Recursively call up, down, right, then left.
				return 1 + block(board, row-1, col, delete, letter, checked) + block(board, row+1, col, delete, letter, checked) + block(board, row, col-1, delete, letter, checked) + block(board, row+1, col, delete, letter, checked);
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}
}
/*// If blank then stop
	if(board[row][col].equals(".")) {
		return 0;
	}
	// Check for one to the right, to the left, up, and down
	else {

		block(board, row, col+1, score, delete);

		block(board, row, col-1, score, delete);
	}		
	return score;
	}*/
