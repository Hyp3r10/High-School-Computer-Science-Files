import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger101 {
	public static void main(String[] args) {
		BigInteger fac = BigInteger.ONE;
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter the integer that you want to apply '!' to: ");
		int num = scan.nextInt();
		scan.close();
		
		for(int i = 2; i <= num; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(fac);
	}
}
