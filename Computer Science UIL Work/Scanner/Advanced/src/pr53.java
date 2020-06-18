import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pr53 {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr53.txt"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String[] allWords = file.nextLine().split(" ");
			ArrayList<String> fourWords = new ArrayList<String>();
			ArrayList<String> words = new ArrayList<String>();
			
			for(int j = 0; j < allWords.length; j++) {
				if(allWords[j].length() == 4) {
					fourWords.add(allWords[j]);
				}
				else {
					words.add(allWords[j]);
				}
			}
			for(int j = 0; j < words.size(); j++) {
				System.out.print(words.get(j) + " ");
			}
			String[] temp =  fourWords.toArray(new String[fourWords.size()]);
			
			Arrays.sort(temp);
			System.out.println();
			
			for(int j = 0; j < temp.length; j++) {
				System.out.println(temp[j] + " ");
			}
			System.out.println();
		}
	}
}
