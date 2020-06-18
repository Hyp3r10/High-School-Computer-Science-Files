import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem31B {
	public static void main (String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr31b.dat"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String temp = file.nextLine();
			String[] parts = temp.split("[^A-Za-z ]+");
			for(int j = 0; j < parts.length; j++) {
				System.out.print(parts[j]);
			} 
			System.out.println();
		}		
	}
}
