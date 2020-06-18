import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Expenses {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("companies.dat"));
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int numDataSets = scan.nextInt();
			scan.nextLine();
			for(int j = 0; j < numDataSets; j++) {
				Scanner tempScanner = new Scanner(scan.nextLine());
				String companyName = tempScanner.next();
				int total = 0;
				while(tempScanner.hasNextInt()) {
					total += tempScanner.nextInt();
				}
				System.out.printf("%s spent $%,d%n", companyName, total);
			}
			System.out.println();
		}
	}
}
