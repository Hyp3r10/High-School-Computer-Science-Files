import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob06 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob06/prob06-1-in.txt")); // Used for testing
		while(scan.hasNext()) {
			double d = scan.nextDouble();
			if(d == 0) {
				break;
			}
			System.out.printf("%.4f%n", Math.pow(d, 2.0/3.0));
		}
		scan.close();
	}
}
