import java.util.Scanner;

public class Calc101Runner
{
    public static void main (String args[])
    {
           Scanner bang = new Scanner (System.in); // Class constructer call (initiating object)
        // Class object name
           Calc101 math = new Calc101(); // Class constructer call (initiating object)
        // Class object name
        
        System.out.print("Enter the first number :: ");
        double num1 = bang.nextDouble();
        System.out.print("Enter the second number :: ");
        double num2 = bang.nextDouble();
        
        System.out.println("\nVoid Methods :: "); // Void method calls stand alone.
        //Void Mehtod Calls
        math.addV(num1, num2); // num1 and num2 in the method call are called "actual paramaters".
        math.subV(num1, num2);
        math.mulV(num1, num2);
        math.divV(num1, num2);
        
        System.out.println("\nReturn Methods :: "); // return method calls need to be a part of another operation or command
        System.out.println(num1 + " + " + num2 + " = " + math.addR(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + math.subR(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + math.mulR(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + math.divR(num1, num2));
    }
}