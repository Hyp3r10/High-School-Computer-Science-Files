import java.util.Scanner;

public class SatelliteMessage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int oP = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			int result = operation(oP, a, b);
			System.out.println(result);
		}
	}
	public static int operation(int oP, int a, int b) {
		int result = 0;
		switch(oP) {
			case 0 : {
				result = a + b;
				break;
			}
			case 1 : {
				result = a - b;
				break;
			}
			case 2 : {
				result = a * b;
				break;
			}
			case 3 : {
				result = a / b;
				break;
			}
		}
		return result;
	}
}
