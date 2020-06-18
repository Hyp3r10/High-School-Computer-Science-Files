import java.util.Scanner;

public class MinMax
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        System.out.print("Enter 1st Integer --> ");
        num1 = keyboard.nextInt();
        System.out.print("Enter 2nd Integer --> ");
        num2 = keyboard.nextInt();
        System.out.print("Enter 3rd Integer --> ");
        num3 = keyboard.nextInt();
        
        int max = (Math.max(Math.max(num1, num2), num3));
        int min = (Math.min(Math.min(num1, num2), num3));
        
        System.out.println("\nSmallest = " + min);
        System.out.println("Largest = " + max);
        
    }
}