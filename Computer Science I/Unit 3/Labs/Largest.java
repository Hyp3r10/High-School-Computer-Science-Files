import java.util.Scanner;

public class Largest
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        int numCount = 1;
        int largest = 0;
        System.out.println("Enter 10 numbers :: ");
        do
        {
            int num = bang.nextInt();
            largest = Math.max(num, largest);
            numCount++;
        }while(numCount <= 10);
        System.out.println("\nThe largest number is :: " + largest);
    }
}