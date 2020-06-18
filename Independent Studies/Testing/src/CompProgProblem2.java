import java.util.Scanner;

/**
 * @author MatthewSheldon
 * Given an integer n (n <= 15), print pi to n digits after the decimal point (rounded).
 * (e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, prints 3.14159.)
 */
public class CompProgProblem2 {
	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		scan.nextLine();
		switch(num1) {
			case 0 : System.out.printf("%.0f", Math.PI); break;
			case 1 : System.out.printf("%.1f", Math.PI); break;
			case 2 : System.out.printf("%.2f", Math.PI); break;
			case 3 : System.out.printf("%.3f", Math.PI); break;
			case 4 : System.out.printf("%.4f", Math.PI); break;
			case 5 : System.out.printf("%.5f", Math.PI); break;
			case 6 : System.out.printf("%.6f", Math.PI); break;
			case 7 : System.out.printf("%.7f", Math.PI); break;
			case 8 : System.out.printf("%.8f", Math.PI); break;
			case 9 : System.out.printf("%.9f", Math.PI); break;
			case 10 : System.out.printf("%.10f", Math.PI); break;
			case 11 : System.out.printf("%.11f", Math.PI); break;
			case 12 : System.out.printf("%.12f", Math.PI); break;
			case 13 : System.out.printf("%.13f", Math.PI); break;
			case 14 : System.out.printf("%.14f", Math.PI); break;
			case 15 : System.out.printf("%.15f", Math.PI); break;
		}
	}
}
