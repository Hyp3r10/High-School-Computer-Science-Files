import java.util.Scanner;

public class Powers
{
    public static void main (String[] args)
    {
        Scanner shapes = new Scanner  (System.in);
        
        int num1 = 0;
        
        System.out.print("Please enter an integer --> ");
        num1 = shapes.nextInt();
        
        int square = num1 * num1;
        int cube = num1 * num1 * num1;
        int fPower = num1 * num1 * num1 * num1;
        
        System.out.println("\nThe Square = " + square);
        System.out.println("The Cube = " + cube);
        System.out.println("The Fourth Power = " + fPower);
    }
}