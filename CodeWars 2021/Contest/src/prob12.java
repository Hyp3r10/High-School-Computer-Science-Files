/**
 * @author MatthewSheldon
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob12 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob12/prob12-7-in.txt")); // Used for testing
		String name = scan.next();
		double speed = scan.nextDouble();
		String unitDistance = scan.next();
		scan.next();
		String unitTime = scan.next();
		double dM = distanceToMeter(unitDistance);
		double tS = timeToSecond(unitTime);
		double conversion = dM/tS;
		double speedMS = conversion * speed;
		double height = Math.pow(speedMS, 2) / (2 * (9.805));
		String note = "";
		if(height < 25.0) {
			note = "SPLAT!";
		}
		else if(height > 50) {
			note = "OUCH!";
		}
		else {
			note = "SUCCESS!";
		}
		System.out.printf("%s will launch the messenger %.2f meters high, %s", name, height, note);
		scan.close();
	}
	public static double distanceToMeter(String unit) {
		switch(unit) {
			case "MILES" : {
				return 5280.0/3.28;
			}
			case "KILOMETERS" : {
				return 1000.0;
			}
			case "YARDS" : {
				return 3.0/3.28;
			}
			case "FEET" : {
				return 1.0/3.28;
			}
			case "METERS" : {
				return 1.0;
			}
			case "INCHES" : {
				return 1.0/(12.0*3.28);
			}
			case "CENTIMETERS" : {
				return 1.0/100.0;
			}
		}
		return 0.0;
	}
	public static double timeToSecond(String unit) {
		switch(unit) {
			case "HOUR" : {
				return 60.0 * 60.0;
			}
			case "MINUTE" : {
				return 60.0;
			}
			case "SECOND" : {
				return 1.0; 
			}
		}
		return 0.0;
	}
}
