public class Arithmetic
{
    public static void main(String[] args)
    {
       // (1) Declaring the variables: 
       int num1 = 25;
       int num2 = 6;
       
       // (2) Creating the operations:
       int sum = 0;
       int differance = 0;
       int product = 0;
       int quotient = 0;
       int remainder = 0;
       
       // (3-7) Using the operations on num1 and num2 and declaring the result variables.
       sum = num1 + num2;
       differance = num1 - num2;
       product = num1 * num2;
       quotient = num1 / num2;
       remainder = num1 % num2;
       
       // (8-9) Printing out the results
       
       System.out.println("        Arithmetic");
       System.out.println("============================");
       System.out.println("25 + 6 = " + sum);
       System.out.println("25 - 6 = " + differance);
       System.out.println("25 * 6 = " + product);
       System.out.println("25 / 6 = " + quotient);
       System.out.println("25 % 6 = " + remainder);
       
       // (11) Changing the values of the nums 
       
       num1 = 77;
       num2 = 32;
       
       // (11) Changing the values of operations
       
       sum = num1 + num2;
       differance = num1 - num2;
       product = num1 * num2;
       quotient = num1 / num2;
       remainder = num1 % num2;
       
       // (13) Prinitng out new results
       
       System.out.println("        Arithmetic");
       System.out.println("============================");
       System.out.println("77 + 32 = " + sum);
       System.out.println("77 - 32 = " + differance);
       System.out.println("77 * 32 = " + product);
       System.out.println("77 / 32 = " + quotient);
       System.out.println("77 % 32 = " + remainder);
       
    }
}