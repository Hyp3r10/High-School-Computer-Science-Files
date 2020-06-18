import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bongo {
	
	// Boolean Array used for checking for a match
	
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("bongo.dat"));
		int numTimes = file.nextInt();
		file.nextLine();

		for(int i = 0; i < numTimes; i++) {
			// Make the board
			String[] array1 = file.nextLine().split(" ");
			String[] array2 = file.nextLine().split(" ");
			String[] array3 = file.nextLine().split(" ");
			String[] array4 = file.nextLine().split(" ");
			String[] array5 = file.nextLine().split(" ");
			String[][] megaArray = {array1, array2, array3, array4, array5};
			
			boolean[][] booleanArray = {{false, false, false, false, false}, 
					  					{false, false, false, false, false},
					  					{false, false, true, false, false},
					  					{false, false, false, false, false},
					  					{false, false, false, false, false}};
			
			boolean isBingo = false;

			// Create an Array with all of the different calls made by the balls
			String[] calls = file.nextLine().substring(1).split("[^0-9]+");
			
			// Goes trough all of the board and marks the respective trues
			all: 
			for(int j = 0; j < calls.length; j++) {
				String call = calls[j];
				
				/** Loop that will check through the whole array for a match
				 *  If there is a match, then use the checkBingo() method.
				 *  Else, go to the next one.
			 	 */
				for(int k = 0; k < megaArray.length; k++) {
					for(int l = 0; l < megaArray[k].length; l++) {
						if(megaArray[k][l].equals(call)) {
							booleanArray[k][l] = true;
							if(hasBingo(booleanArray)) {
								isBingo = true;
								// End the last 3 inside loops
								break all;
							}
						}
					}
				}
			}
			if(isBingo) {
				System.out.println("BINGO");
			}
			else {
				System.out.println("BONGO");
			}
		}
		file.close();
	}
	public static boolean hasBingo(boolean[][] booleanArray) {
		int count = 0;
		
		// Checks for row matches
		for(int i = 0; i < booleanArray.length; i++) {
			for(int k = 0; k < booleanArray[i].length; k++) {
				if(booleanArray[i][k]) {
					count++;
				}
				if(count == 5) {
					return true;
				}
			}
			count = 0;
		}
		
		count = 0;
		
		// Checks for column matches
		for(int i = 0; i < booleanArray.length; i++) {
			for(int k = 0; k < booleanArray[i].length; k++) {
				if(booleanArray[k][i]) {
					count++;
				}
				if(count == 5) {
					return true;
				}
			}
			count = 0;
		}
		
		// Checks for diagonals
		if(booleanArray[0][0] && booleanArray[1][1] && booleanArray[2][2] && booleanArray[3][3] && booleanArray[4][4]) {
			return true;
		}
		if(booleanArray[0][4] && booleanArray[1][3] && booleanArray[2][2] && booleanArray[3][1] && booleanArray[4][0]) {
			return true;
		}
		
		return false;
	}
}