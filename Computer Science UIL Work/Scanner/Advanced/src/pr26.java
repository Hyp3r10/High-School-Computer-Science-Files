import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pr26  {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr26.txt"));
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			int backNum = 0;
			String letter = file.nextLine();
			String word = file.nextLine();
			char[] letters = letter.toCharArray();
			char[] broken = word.toCharArray();
			
			
			// Get the ammount of letters back
			for(int j = 0; j < letters.length; j++) {
				if(letters[j] == 'Z') {
					for(int k = j; k < letters.length; k++) {
						backNum++;
					}
					j = letters.length;
					backNum--;
				}
			}
			
			//Change the letters to be backNum times.
			for(int j = 0; j < broken.length; j++) {
				char temp = broken[j];
				if(temp != '0' && temp != '1' && temp != '2' && temp != '3' && temp != '4' && temp != '5' && temp != '6' && temp != '7' && temp != '8' && temp != '9' && temp != ' ') {
					for(int k = 0; k < backNum; k++) {
						temp--;
						if(temp < 65) {
							temp = 90;
						}
					}
				}
				broken[j] = temp;
			}
			
			//Print out the new word
			for(int j = 0; j < broken.length; j++) {
				System.out.print(broken[j]);
			}
			System.out.println();
		}
	}
}
