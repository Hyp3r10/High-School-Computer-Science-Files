import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tickets {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("tickets.dat"));
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int numDataSets = scan.nextInt();
			for(int j = 0; j < numDataSets; j++) {
				String name = scan.next();
				double price = scan.nextInt() * scan.nextDouble();
				System.out.printf("%s: $%.2f%n", name, price);
			}
			System.out.println();
		}
	}
}
