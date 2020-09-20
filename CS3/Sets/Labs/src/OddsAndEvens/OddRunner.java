package OddsAndEvens;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddRunner {
	public static void main( String args[] ) throws IOException {
		OddEvenSets tester = new OddEvenSets();
		Scanner scan = new Scanner(new File("oddeven.dat"));
		while(scan.hasNextLine()) {
			tester = new OddEvenSets(scan.nextLine());
			System.out.println(tester);
		}
	}
}