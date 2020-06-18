import java.util.Scanner;

public class Calc103Runner
{
    public static void main (String args[])
    {
           Scanner bang = new Scanner (System.in); // Class constructer call (initiating object)
        // Class object name
           Calc101 ronin = new Calc101(); // Class constructer call (initiating object)
        // Class object name
        
        System.out.print("Enter the first number :: ");
        double num1 = bang.nextDouble();
        System.out.print("Enter the second number :: ");
        double num2 = bang.nextDouble();
        
        //Return examples
        System.out.println("\nReturn Methods :: "); // return method calls need to be a part of another operation or command
        
        //Example 1
        System.out.println(num1 + " + " + num2 + " = " + ronin.addR(num1,num2));
        //Example 2 
        double value = ronin.addR(num1,num2);
        System.out.println("The sum of your numbers is :: " + value);
        //Example 3
        if(ronin.addR(num1,num2) > 10)
        {
            System.out.println("The sum is greater than 10.");
        }
        else
        {
            System.out.println("The sum is not greater than 10.");
        }
    }
}