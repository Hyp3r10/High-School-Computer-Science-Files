import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordProcessor {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("word.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("word.out")))) {
				int numWords = scan.nextInt();
				int numCharactersPerLine = scan.nextInt();
				scan.nextLine();
				String tempLine = scan.nextLine();
				String[] arr = tempLine.split(" ");
				int count = 0;
				String wholeLine = "";

				for(int i = 0; i < arr.length; i++) {
					count += arr[i].length();
					// Test to see if we can add the word to this line without overflowing.
					if(count <= numCharactersPerLine) {
						wholeLine += (arr[i]);
					}
					// Add word to next line
					else {
						wholeLine += "\n";
						wholeLine += (arr[i]);
						count = arr[i].length();
					}
					// Spaces without spaces on last line.
					if(arr.length-1 >= i+1 && ((count + arr[i+1].length()) <= numCharactersPerLine)) {
						wholeLine += " ";
					}
				}
				out.println(wholeLine);
			}
		}
	}
}
