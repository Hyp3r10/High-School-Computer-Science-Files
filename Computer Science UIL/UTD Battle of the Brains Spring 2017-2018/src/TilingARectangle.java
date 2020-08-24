/**
 * @author MatthewSheldon
 */
import java.util.Scanner;

public class TilingARectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int max = Math.max(num1, num2);
			int gcd = gcd(max, num1, num2);
			System.out.println(gcd);
		}
	}
	public static int gcd(int max, int num1, int num2) {
		for(int i = max; i >= 2; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}
}