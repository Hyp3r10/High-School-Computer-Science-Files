import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class pr23 {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr23.txt"));
		int numTimes = file.nextInt();
		file.nextLine();
		
		
		for(int i = 0; i < numTimes; i ++) {
			ArrayList<Character> chars = new ArrayList<Character>();
			String word = file.nextLine();
			char[] letters = word.toCharArray();
			for(int j = 0; j < letters.length; j++) {
				boolean add = true;
				for(int k = 0; k < chars.size(); k++) {
					if(chars.get(k) == letters[j]) {
						add = false;
					}
				}
				if(add) {
					chars.add(letters[j]);
				}
			}
			for(int l = 0; l < chars.size(); l++) {
				if(chars.get(l) != ' ') {
					System.out.print(chars.get(l));
				}
			}
			System.out.println();
		}
		
	}
}
