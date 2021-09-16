import java.util.Scanner;

public class Prob00 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		while(numTimes-->0) {
			System.out.println(scan.nextLine());
		}
	}
}