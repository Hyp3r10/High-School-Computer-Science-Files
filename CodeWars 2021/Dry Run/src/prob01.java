import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob01 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob01/prob01-1-in.txt")); // Used for testing
		System.out.println(scan.next() + ", the needs of the many outweigh the needs of the few, or the one; live long and prosper.");
		scan.close();
	}
}
