import java.util.Scanner;

public class P {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(fib(num));
	}
	
	public static int fib(int num) {
		if(num <= 1) { return num;}
		else {return fib(num-1) + fib(num-2);}
	}
}
