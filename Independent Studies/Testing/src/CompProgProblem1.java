import java.util.Scanner;

/**
 * @author MatthewSheldon
 * Using Java, read in a double
 * (e.g. 1.4732, 15.324547327, etc.)
 * echo it, but with a minimum field width of 7 and 3 digits after the decimal point
 * (e.g. ss1.473 (where ‘s’ denotes a space), s15.325, etc.)
 */
public class CompProgProblem1 {
	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		scan.nextLine();
		System.out.printf("%7.3f", num1);
	}
}
