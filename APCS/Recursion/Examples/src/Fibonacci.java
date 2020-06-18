import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("fib(7) == " + fib1(7));
	}
	public static int fib1(int num) {
		if(num==0) {
			return 0;
		}
		if(num==1) {
			return 1;
		}
		return fib1(num-2) + fib1(num-1);
	}	
}
