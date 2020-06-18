import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numNumbers = scan.nextInt();
		int[] a = new int[numNumbers];
		int[] b = new int[numNumbers];
		int aTotal = 0;
		for(int i = 0; i < numNumbers; i++) {
			a[i] = scan.nextInt();
			aTotal = aTotal | a[i];
		} 
		int bTotal = 0;
		for(int i = 0; i < numNumbers; i++) {
			b[i] = scan.nextInt();
			bTotal = bTotal | b[i];
		} 
		System.out.println(aTotal + bTotal);
	}
}
