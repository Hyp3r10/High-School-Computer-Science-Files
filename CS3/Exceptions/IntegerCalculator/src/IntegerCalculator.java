import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerCalculator
{
	private int operand1;
	private int operand2;
	private int result;

	public IntegerCalculator()
	{
		mainMenu();
	}

	public void mainMenu()
	{
		int ans = 0;

		do
		{
			ans = getInfo();

			if(ans == 1)
               add();
			if(ans == 2)
               subtract();
			if(ans == 3)
               multiply();
			if(ans == 4)
			   divide();

			System.out.println();
		}
		while(ans != 5);
	}

	// Postcondition:Retrieves calculator input from the user.
	//   Asks the user to select from a menu which operation they wish
	//   to perform 1) add 2) subtract 3) multiply 4) divide.
	//   It then asks the user to enter in two operands. If either of
	//   the two operands are not valid integers it displays an error
	//   message and asks the user for the information again.
	//   The method returns an integer representing operation selected
	//   by the user
	public int getInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("1)Add 2)Subtract 3)Multiply 4)Divide 5)Quit -->");
		try {
			int choice = scan.nextInt();
			if(choice <= 5 && choice >= 0) {
				try {
					if(choice != 5) {
						System.out.print("\nOperator 1 -->");
						operand1 = scan.nextInt();
						System.out.print("Operator 2 -->");
						operand2 = scan.nextInt();
						System.out.println();
					}
					return choice;
				}
				catch(InputMismatchException e) {
					System.out.println("\nNot a valid number, try again.\n");
					return getInfo();
				}
			}
			else {
				System.out.println("\nNot a valid number, try again.\n");
				return getInfo();
			} 
		}
		catch(InputMismatchException e) {
			System.out.println("\nNot a valid number, try again.\n");
			return getInfo();
		} /*
			 * finally { scan.close(); }
			 */
	}

	public void add()
	{
		result = operand1 + operand2;
		System.out.println(operand1 + " + " + operand2 + " = " + result);
	}

	public void subtract()
	{
		result = operand1 - operand2;
		System.out.println(operand1 + " - " + operand2 + " = " + result);
	}

	public void multiply()
	{
		result = operand1 * operand2;
		System.out.println(operand1 + " * " + operand2 + " = " + result);

	}

	// Precondition:  two valid operands
	// Postcondition: performs the division operation on the two
	//    operands and displays the results. If a division by zero
	//    error occurs it displays an error message and does not
	//    display any results.
	public void divide()
	{
		try {
			result = operand1 / operand2;
			System.out.println(operand1 + " / " + operand2 + " = " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: You cannot divide by zero!");
		}
	}

	public static void main(String[] args)
	{
		IntegerCalculator app = new IntegerCalculator();
	}
}