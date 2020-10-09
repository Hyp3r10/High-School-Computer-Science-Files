import java.util.Scanner;

public class SieveRunner {
	public static void main(String[] args) {
		SieveOfEratos tester = new SieveOfEratos();
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while(scan.hasNextLine()) {
			try {
				n = scan.nextInt();
				System.out.println(tester.getPrimeNumbers(n));
			}
			catch(IllegalArgumentException e) {
				System.out.println("Error: " + n + " is less than 2");
			}
		}
		
	}
}
