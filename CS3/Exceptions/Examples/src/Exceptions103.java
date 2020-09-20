import java.util.Scanner;

/*
 * Unchecked exceptions, such as the ArithmeticException
 * that is thrown when you divide by zero, are not requited
 * to be handled by your program.
 */
public class Exceptions103 {
	public static void main(String[] args)
	{
		DivideTester2 test = new DivideTester2();
		Scanner keyboard = new Scanner(System.in);
		String ans;

		do
		{
			test.getNumbers();
			
			//We still get a default devide by zero exception here.
			//test.divide();
			//test.printResults();
			
			//Now it is the responsibility of the calling method, main, to handle the exception.
			try {
				test.divide();
				test.printResults();
			}
			catch(ArithmeticException e) {
				System.out.println("You tried to divide by zero, you dork!");
			}
			System.out.print("Continue[Y/N]?");
			ans = keyboard.nextLine();
			System.out.println();
		} while (ans.equalsIgnoreCase("y"));
	}
}
class DivideTester2 {
	private int dividend;
	private int divisor;
	private int quotient;

	public void getNumbers() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the Dividend-->");
		dividend = keyboard.nextInt();
		System.out.print("Enter the Divisor-->");
		divisor = keyboard.nextInt();
		System.out.println();
	}

	/*
	 * Marking a method with the throws keyword instructs the JVM
	 * to pass and exceptions that occur within the method onto
	 * the calling method so they can be handled there.
	 */
	public void divide() throws ArithmeticException {
		quotient = dividend / divisor;
	}

	public void printResults() {
		System.out.println(dividend + " / " + divisor + " = " + quotient);
		System.out.println();
	}

}
