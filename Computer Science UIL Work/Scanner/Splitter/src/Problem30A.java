import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem30A {
	public static void main (String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr30a.txt"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String[] words = file.nextLine().split("[ ]+");
			for(int j = words.length-1; j >= 0; j--) {
				System.out.print(words[j] + " ");
			}
			System.out.println();
		}		
	}
}
