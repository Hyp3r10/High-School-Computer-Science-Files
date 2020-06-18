
public class Calc101 {
	private double sum;
	private static double diff;
	
	private Calc101() {
		
	}
	public static void add(double num1, double num2) {
		// Can't call a non static instance variables from static methods
		//sum = num1 + num2;
		double sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	// Variable names can be different from class to class, but the data type can't
	public static void subtract(double operand1, double operand2) {
		// Can call a static instance variable from a static method
		diff = operand1 - operand2;
		System.out.println(operand1 + " - " + operand2 + " = " + diff);
	}
	public static void multiply(double operand1, double operand2) {
		double product = operand1 * operand2;
		System.out.println(operand1 + " * " + operand2 + " = " + product);
	}
	public static void divide(double operand1, double operand2) {
		double quotient = operand1 / operand2;
		System.out.println(operand1 + " / " + operand2 + " = " + quotient);
	}
}
