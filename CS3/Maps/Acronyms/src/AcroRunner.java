import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner {
	public static void main( String args[] ) throws IOException {
		Scanner scan = new Scanner(new File("acro.dat"));
		String output = "";
		int numAcro = scan.nextInt(); scan.nextLine();
		Acronyms tester = new Acronyms();
		for(int i = 0; i < numAcro; i++) {
			tester.putEntry(scan.nextLine());
		}
		while(scan.hasNextLine()) {
			output += (tester.convert(scan.nextLine())) + "\n";
		}
		System.out.println(tester);
		System.out.println(output);
	}
}