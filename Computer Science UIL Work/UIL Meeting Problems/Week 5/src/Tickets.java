import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tickets {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("tickets.dat"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String line = file.nextLine();
			Scanner scan = new Scanner(line);
			
			System.out.printf("%s %.2f%n", scan.next() + ":", (scan.nextDouble() * scan.nextDouble()));
			scan.close();
		}
		file.close();
	}
}
