/** 
 * This program demonstrates memory overflow problems.
 * The program output displays a numer that is mathematically incorrect
 * due to memory overflow.
 */

public class DataTypes103
{
    public static void main(String[] args)
    {
      double num1 = 10.0;
      double num2 = 3.0;
      double num3 = num1 / num2;
      // num3 = 10.0 / 3.0
      
      System.out.println("num1 " + num1);
      System.out.println("num2 " + num2);
      System.out.println("num3 " + num3); 
    }
}