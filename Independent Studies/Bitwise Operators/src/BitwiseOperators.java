import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please type the first number (0 - 255): ");
		int num1 = scan.nextInt();
		scan.nextLine();
		System.out.print("Please type the second number (0 - 255): ");
		int num2 = scan.nextInt();
		scan.nextLine();

		// the & operator checks the binary representation of a number and sees where both numbers have a 1

		int and = num1 & num2;
		System.out.println("\n\nBitwise and & :: ");
		System.out.println("   " + toBinary(Integer.toBinaryString(num2)));
		System.out.println(" & " + toBinary(Integer.toBinaryString(num1)));
		System.out.println("  ----------");
		System.out.println("   " + toBinary(Integer.toBinaryString(and)) + " == " + and);



		// the | operator checks the binary representation of a number and sees where either number has a 1
		int or = num1 | num2;
		System.out.println("\n\nBitwise or | :: ");
		System.out.println("   " + toBinary(Integer.toBinaryString(num1)));
		System.out.println(" | " + toBinary(Integer.toBinaryString(num2)));
		System.out.println("  ----------");
		System.out.println("   " + toBinary(Integer.toBinaryString(or)) + " == " + or);

		// the ^ operator checks the binary representation of a number and sees where only nor of the numbers has a 1
		int xor = num1 ^ num2;
		System.out.println("\n\nBitwise xor ^ :: ");
		System.out.println("   " + toBinary(Integer.toBinaryString(num1)));
		System.out.println(" ^ " + toBinary(Integer.toBinaryString(num2)));
		System.out.println("  ----------");
		System.out.println("   " + toBinary(Integer.toBinaryString(xor)) + " == " + xor);

		// the ~ operator changes the number to the two's compliment (AKA -- negative) 
		int twosCompliment1 = ~num1+1;
		int twosCompliment2 = ~num2+1;
		System.out.println("\n\nBitwise two's compliment ~(num1) :: ");
		System.out.println("   " + toBinary(Integer.toBinaryString(num1)));
		System.out.println(" ~ " + partOne(toBinary(Integer.toBinaryString(num1))));
		System.out.println("  ----------");
		System.out.println("   " + partTwo(Integer.toBinaryString(twosCompliment1), num1)  + " == " + twosCompliment1);
		
		System.out.println("\n\nBitwise two's compliment ~(num2) :: ");
		System.out.println("   " + toBinary(Integer.toBinaryString(num2)));
		System.out.println(" ~ " + partOne(toBinary(Integer.toBinaryString(num2))));
		System.out.println("  ----------");
		System.out.println("   " + partTwo(Integer.toBinaryString(twosCompliment2), num2)  + " == " + twosCompliment2);
		scan.close();
	}
	// Converts the string from Integer's "toBinaryString()" method into bits of 8
	public static String toBinary(String num) {
		while(num.length() != 8) {
			num =  "0" + num;
		}
		return num;
	}
	// Flips 1's with 0's and vice versa
	public static String partOne(String num) {
		String binary = "";
		for(int i = 0; i < num.length(); i++) {
			if(num.charAt(i) == '1') {
				binary += "0";
			}
			else {
				binary += "1";
			}
		}
		return binary;
	}
	public static String partTwo(String num, int num1) {
		String output = "";
		if(num1 == 255) {
			for(int i = 0; i < num.length(); i += 8) {
				if(i >= 16 ) {
					output += num.substring(i, i+8) + " ";
				}
			}
		}	
		else {
			for(int i = 0; i < num.length(); i += 8) {
				if(i >= 24 ) {
					output += num.substring(i, i+8) + " ";
				}
			}
		}
		return output;
	}
}
