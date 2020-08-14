/**
 * @author MatthewSheldon
 */
import java.util.Scanner;

public class Barb {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String word = scan.nextLine();
			String word1 = "";
			for(char temp : word.toUpperCase().toCharArray()) {
				word1 = temp + word1;
			}
			String word2 = "";
			String word3 = "";
			if(word.length() % 2 == 0) {
				int mid = word.length()/2;
				for(int i = 0; i < mid; i++) {
					word2 = word.toLowerCase().charAt(i) + word2;
				}
				word3 = word.toUpperCase().substring(mid);
			}
			else if(word.length() != 1) {
				int mid = (word.length()/2) + 1;
				for(int i = 0; i < mid; i++) {
					word2 = word.toLowerCase().charAt(i) + word2;
				}
				word3 = word.toUpperCase().substring(mid-1);
			}
			else {
				word2 = word.toLowerCase();
				word3 = word.toUpperCase();
			}
			System.out.println(word + " " + word1 + " " + word2 + " " + word3);
		}
	}
}
