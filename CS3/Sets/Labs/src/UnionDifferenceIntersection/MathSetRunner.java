package UnionDifferenceIntersection;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MathSetRunner {
	public static void main(String args[]) throws IOException {
		MathSet tester = new MathSet();
		Scanner scan = new Scanner(new File("mathsetdata.dat"));
		while(scan.hasNextLine()) {
			String one = scan.nextLine();
			String two = scan.nextLine();
			tester = new MathSet(one, two);
			System.out.println(tester);
			System.out.println("union - " + tester.union());
			System.out.println("intersection - " + tester.intersection());
			System.out.println("difference A-B - " + tester.differenceAMinusB());
			System.out.println("difference B-A - " + tester.differenceBMinusA());
			System.out.println("symmetric difference - " + tester.symmetricDifference());
			System.out.println("\n");
		}
	}
}
