import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner temp = new Scanner(scan.nextLine());
		int a = temp.nextInt();
		int b = temp.nextInt();
		System.out.println(a * b);
	}
}
