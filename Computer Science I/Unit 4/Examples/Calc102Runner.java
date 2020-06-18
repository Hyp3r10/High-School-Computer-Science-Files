/**
 * Anti-Examples :: 
 * What NOT to do
 */

import java.util.Scanner;

public class Calc102Runner
{
    public static void main (String args[])
    {
           Scanner bang = new Scanner (System.in); // Class constructer call (initiating object)
        // Class object name
            Calc101 markymark = new Calc101(); // Class constructer call (initiating object) 
        //  Class object name
        
        System.out.print("Enter the first number :: ");
        double num1 = bang.nextDouble();
        System.out.print("Enter the second number :: ");
        double num2 = bang.nextDouble();
        
        System.out.println("\nVoid Methods :: "); // Void method calls stand alone.
        // Using a void method as a return method generates a compile error
        //System.out.println(num1 + " + " + num2 + " = " + markymark.addV(num1, num2));
        
        System.out.println("\nReturn Methods :: "); // return method calls need to be a part of another operation or command
        /**
         * Using a return method as a vodi method does not cause an error but
         * goes into the nothingness and does nothing practical for the program
         */
        //markymark.addR(num1,num2);
    }
}