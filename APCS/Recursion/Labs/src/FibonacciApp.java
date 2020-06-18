import java.util.*;

public class FibonacciApp
{
    public static void main(String[] args)
    {
        FibonacciTester f = new FibonacciTester();
        Scanner keyboard = new Scanner(System.in);
           
        System.out.print("Enter number -->");
        int n = keyboard.nextInt();
        int result = f.fibonacci(n);
        System.out.println("Fibonacci("+n+") = " + result);
    }
}

class FibonacciTester
{
    public int fibonacci(int n)
    {
    	if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacci(n-2) + fibonacci(n-1);
    }
}