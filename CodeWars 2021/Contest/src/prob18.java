/**
 * @author MatthewSheldon
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob18 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob18/prob18-4-in.txt")); // Used for testing
		String name = scan.nextLine();
		double people = scan.nextDouble();
		double method = scan.nextDouble();
		double startup = scan.nextDouble();
		double output = scan.nextDouble();
		double borrow = scan.nextDouble();
		double produced = 0;
		String result = "WHOA, HEAVY!";
		
		double runTimeHours = (method / 60) - (startup / 3600);
		double energyProducedWatt = runTimeHours * output;
		double energyProducedGigaWatt = energyProducedWatt /  1e+9;
		
		if(borrow < people || runTimeHours <= 0) {
			System.out.printf("%s can generate %.2f watts/second%n%s", name, 0.00, result);
		}
		else if(energyProducedGigaWatt < 1.21) {
			System.out.printf("%s can generate %.2f watts/second%n%s", name, (output / 3600), result);
		}
		else {
			result = "MARTY CAN MAKE IT!";
			System.out.printf("%s can generate %.2f watts/second%n%s", name, (output / 3600), result);
		}
		
		scan.close();
	}
}
