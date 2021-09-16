/**
 * @author MatthewSheldon
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob14 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob14/prob14-1-in.txt")); // Used for testing
		String[] line = scan.nextLine().split(" ");
		double numSticks = Integer.parseInt(line[0]);
		double tensileLimit = Integer.parseInt(line[2]);
		double weight = getWeight(line[1]);
		double explosiveForce = 7.5 * weight * numSticks;
		String result = explosiveForce <= tensileLimit ? "the Mask can eat it!" : "the Mask should not eat it!";
		System.out.printf("%.2f %s", explosiveForce, result);
		scan.close();
	}
	public static double getWeight(String size) {
		switch(size) {
			case "1/4"  : return 0.1125;
			case "1/3" : return 0.15;
			case "1/2" : return 0.225;
			case "1"   : return 0.45;
			case "2"   : return 0.9;
			case "3"   : return 1.35;
		}
		return 0;
	}
}