import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob05 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob05/prob05-1-in.txt")); // Used for testing
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		System.out.println(A + " * (" + B + " + " + C + ") = " + A + " * " + B + " + " + A + " * " + C);
		System.out.println(A + " * " + (B + C) + " = " + (A * B) + " + " + (A * C));
		System.out.println((A * (B + C)) + " = " + ((A * B) + (A * C)));
		scan.close();
	}
}
