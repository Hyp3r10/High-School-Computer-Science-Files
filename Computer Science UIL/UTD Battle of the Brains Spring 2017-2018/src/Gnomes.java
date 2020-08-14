import java.util.Scanner;

public class Gnomes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		System.out.println("Gnomes:");
		for(int i = 0; i < numTimes; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			if((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
				System.out.println("Ordered");
			}
			else {
				System.out.println("Unordered");
			}
		}
	}
}
