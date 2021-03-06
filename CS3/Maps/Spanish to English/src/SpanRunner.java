import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("spantoeng.dat"));
		SpanishToEnglish tester = new SpanishToEnglish();
		int numElements = scan.nextInt(); scan.nextLine();
		for(int i = 0; i < numElements; i++) {
			String line = scan.nextLine();
			tester.putEntry(line);
		}
		while(scan.hasNextLine()) {
			System.out.println(tester.translate(scan.nextLine()));
		}
 	}
}