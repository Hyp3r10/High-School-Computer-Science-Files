/**
 * @author MatthewSheldon
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob11 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob11/prob11-4-in.txt")); // Used for testing
		scan.next(); String F = scan.next();
		scan.next(); String K = scan.next();
		scan.next(); String X = scan.next();
		if(K.equals("?")) {
			System.out.println("K " + String.format("%.2f", (Double.parseDouble(F) / Double.parseDouble(X) * -1.0)));
		}
		if(F.equals("?")) {
			System.out.println("F " + String.format("%.2f", (Double.parseDouble(K) * Double.parseDouble(X) * -1.0)));
		}
		if(X.equals("?")) {
			System.out.println("X " + String.format("%.2f", (Double.parseDouble(F) / Double.parseDouble(K) * -1.0)));
		}
		
		scan.close();
	}
}
