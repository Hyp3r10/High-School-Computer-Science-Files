/**
 * @author MatthewSheldon
 */
import java.util.Scanner;

public class Emily {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String[] parts = scan.nextLine().split(" ");
			int base1 = Integer.parseInt(parts[0]);
			int base2 = Integer.parseInt(parts[1]);
			int height = Integer.parseInt(parts[2]);
			double result = (((double) base1 + (double) base2)/2) * (double) height;
			if((int) result == result) {
				System.out.println((int) result);
			}
			else {
				System.out.printf("%.1f\n", result);
			}
		}
	}
}	
