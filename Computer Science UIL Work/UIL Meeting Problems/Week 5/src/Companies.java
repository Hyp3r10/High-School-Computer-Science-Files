import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Companies {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("companies.dat"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String line = file.nextLine();
			Scanner scan = new Scanner(line);
			
			String name = scan.next() + " spent";
			double cost = 0;
			
			while(scan.hasNextDouble()) {
				int add = scan.nextInt();
				cost+=add;
			}

			System.out.printf("%s $%,.0f%n", name, cost);
			scan.close();
		}
		file.close();
	}
}
