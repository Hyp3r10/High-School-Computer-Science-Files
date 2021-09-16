/**
 * @author MatthewSheldon
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob13 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob13/prob13-3-in.txt")); // Used for testing
		String name = scan.nextLine();
		int rampLength = scan.nextInt();
		double acceleration = scan.nextDouble();
		double riverWidth = scan.nextDouble();
		
		double time = Math.sqrt(2.0 * rampLength / acceleration);
		double speed = time * acceleration;
		double distance = Math.pow(speed, 2) / 9.805;
		
		String note = "";
		if(distance < riverWidth - 5) {
			note = ", SPLASH!";
		}
		else if(distance >= riverWidth - 5 && distance <= riverWidth) {
			note = ", BARELY MADE IT!";
		}
		else if(distance > riverWidth) {
			note = ", LIKE A BOSS!";
		}
		
		System.out.printf("%s will reach a speed of %.2f m/s on a %d meter ramp, crossing %.1f of ", name, speed, rampLength, distance);
		System.out.print(riverWidth + " meters" + note);
		scan.close();
	}
}
