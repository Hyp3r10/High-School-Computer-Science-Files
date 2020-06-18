import java.math.BigInteger;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long numNumbers = scan.nextLong(); scan.nextLine();
		Scanner line = new Scanner(scan.nextLine());
		BigInteger total = BigInteger.ONE;
		for(long i = 0; i < numNumbers; i++) {
			total = total.multiply(BigInteger.valueOf(line.nextLong()));
		}
		if(total.longValue() > (long) Math.pow(10, 18)) {
			System.out.println(-1);
		}
		else {
			System.out.println(total.longValue());
		}
	}
}
