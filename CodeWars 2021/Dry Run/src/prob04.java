import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob04 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob04/prob04-1-in.txt")); // Used for testing
		while(scan.hasNext()) {
			double num1 = scan.nextDouble();
			double num2 = scan.nextDouble();
			if(num1 == 0.0 && num2 == 0.0) {
				break;
			}
			else {
				System.out.printf("%.1f%n", num1 * num2);
			}
		}
		scan.close();
	}
}
