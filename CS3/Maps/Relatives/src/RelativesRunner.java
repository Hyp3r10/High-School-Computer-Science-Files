import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner {
	public static void main( String args[] ) throws IOException {
		Scanner scan = new Scanner(new File("relatives.dat"));
		int numLines = scan.nextInt(); scan.nextLine();
		Relatives tester = new Relatives();
		for(int i = 0; i < numLines; i++) {
			tester.setPersonRelative(scan.nextLine());
		}
		System.out.println(tester);
	}
}