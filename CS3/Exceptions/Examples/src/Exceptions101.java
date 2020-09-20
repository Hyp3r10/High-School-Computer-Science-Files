import java.util.Scanner;

public class Exceptions101
{

	public static void main(String[] args)
	{
		DivideTester test = new DivideTester();
		Scanner keyboard = new Scanner(System.in);
		String ans;

		do
		{
			test.getNumbers(); // get two numbers
			test.divide(); // calculate the quotient
			test.printResults(); // print the results

			System.out.print("Continue[Y/N]?");
			ans = keyboard.nextLine();
			System.out.println();
		} while (ans.equalsIgnoreCase("y"));
	}
}

class DivideTester
{
	private int dividend;
	private int divisor;
	private int quotient;

	public void getNumbers()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the Dividend-->");
		dividend = keyboard.nextInt();
		System.out.print("Enter the Divisor-->");
		divisor = keyboard.nextInt();
		System.out.println();
	}

	public void divide()
	{
		// quotient = dividend / divisor;

		
		try 
		{ 
			quotient = dividend / divisor; 
		} 
		catch(ArithmeticException e) //must have a catch with a try 
		{ 
			//to override default behavior add output in the catch block
			System.out.println("***Division by 0 error***"); 
		}
		 

		// This code will throw an exception when dividing 42 just as it automatically
		// did when dividing an int by 0.
		/*
		 * if(divisor == 42) 
		 * { 
		 * 	throw new ArithmeticException(); 
		 * }
		 */

		// You can create an instance of an ArithmeticException object
		/*
		 * if(divisor == 42) { ArithmeticException myException = new
		 * ArithmeticException(); throw myException; }
		 */

		// The constructor for each exception is overloaded to take a string
		/*
		 * if(divisor == 42) { throw new ArithmeticException("Tried to divide " +
		 * dividend + " by 42 you dork!"); }
		 */

		try
		{
			if (divisor == 42)
			{
				throw new ArithmeticException("Tried to divide " + dividend + " by 42 you dork!");
			}
			quotient = dividend / divisor;
		} 
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void printResults()
	{
		System.out.println(dividend + " / " + divisor + " = " + quotient);
		System.out.println();
	}

}
