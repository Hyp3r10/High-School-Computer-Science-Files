import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class HistogramRunner {
	public static void main( String args[] ) throws IOException {
		Scanner scan = new Scanner(new File("histogram.dat"));
		Histogram tester = new Histogram();
		while(scan.hasNextLine()) {
			tester.setSentence(scan.nextLine());
			System.out.println(tester);
		}
	}
}