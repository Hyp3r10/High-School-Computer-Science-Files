/** 
 * This program semonstrates the five integer operations.
 * Also see "Arithmetic" lab for more examples.
 * Also see "Operators105" for more on doubles.
 */

public class Operators104
{
    public static void main (String [] args)
    {
       int a = 0;
       int b = 25;
       int c = 10;
        
       a = b + c; // Addition
       System.out.println(b + " + " + c + " = " + a);
       
       a = b - c; // Subtraction
       System.out.println(b + " + " + c + " = " + a);
       
       a = b * c; // Multiplication
       System.out.println(b +  " * " + c + " = " + a);
       
       a = b / c; // Division
       System.out.println(b + " / " + c + " = " + a);
       
       a = b % c; // Modulus division
       System.out.println(b + " % " + c + " = " + a);
    }
}
