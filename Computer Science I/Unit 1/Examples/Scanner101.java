/**
 * This program uses the scanner class to take in
 * user input from the keyboard. You must import
 * java.util.Scanner first
 */

import java.util.Scanner; // Must import this package to use the Scanner

public class Scanner101
{
    public static void main (String[] args)
    {
        Scanner batman = new Scanner (System.in); // This line "creates" the Scanner, only do this once.
        
        System.out.print("Please inter an integer: ");
        int num1 = batman.nextInt(); // This line pauses the program and waits for the user to input an integer. Stores the input into a variable.
        
        System.out.println("The number you entered is: " + num1);
        
        System.out.print("\nPlease enter a real number (we dont like the fake ones): ");
        double num2 = batman.nextDouble(); // This line pauses the program and waits for the user to input a double.
        
        System.out.println("The number you entered is: " + num2);
    }
}