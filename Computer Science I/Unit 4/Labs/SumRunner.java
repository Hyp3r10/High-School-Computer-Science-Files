import java.util.Scanner;

public class SumRunner
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        Sum octothorp = new Sum();
        
        System.out.print("Please enter the first integer :: ");
        double num1 = bang.nextDouble();
        System.out.print("Please enter the second integer :: ");
        double num2 = bang.nextDouble();
        
        // Void Method Call
        octothorp.addV(num1, num2);
        
        // Return Method Call
        System.out.println(num1 + " + " + num2 + " = " + octothorp.addR(num1, num2));
    }
}