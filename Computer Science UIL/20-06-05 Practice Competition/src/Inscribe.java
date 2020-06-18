import java.util.Scanner;

/**
 * @author MatthewSheldon
 */
public class Inscribe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[][] grid;
		while(scan.hasNextInt()) {
			int len = scan.nextInt();
			grid = new char[len][len];
			int maxLetterNumber = (int) (0.5 + (0.5 * len))-1;
			int end = 0;
			// runs through the different letters that will be printed starting with the highest index
			for(int i = maxLetterNumber; i >= 0; i--) {
				for(int j = end; j < len - end; j++) {
					for(int k = end; k < len - end; k++) {
						grid[j][k] = alphabet.charAt(i);
					}
				}
				end++;
			}
			
			for(char[] arr : grid) {
				for(char print : arr) {
					System.out.print(print);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
