import java.util.Scanner;

public class NumAvgRunner
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        NumAvg octothorp = new NumAvg();
        
        System.out.print("Please enter the first number :: ");
        double num1 = bang.nextDouble();
        System.out.print("Please enter the secoond number :: ");
        double num2 = bang.nextDouble();
        
        // Void Method Call
        octothorp.avgV(num1, num2);
        
        // Return Method Call
        System.out.println(num1 + " + " + num2 + " has an average of " + octothorp.avgR(num1, num2));
    }
}