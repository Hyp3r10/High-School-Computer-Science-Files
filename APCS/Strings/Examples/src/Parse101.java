import java.util.Scanner;
public class Parse101 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :: ");
		String numberString = scan.nextLine();
		
		// Parse methods allow you to convert Strings to primitives
		// Other parse methods include :: parseInt, parseDouble, parseBoolean, parseChar, parseLong, parseFloat, paresByte.
		double num = Double.parseDouble(numberString);
		
		if(num % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		System.out.println("numberString as a double :: " + num);
		scan.close();
	}
}
