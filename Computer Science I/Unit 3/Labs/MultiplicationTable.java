import java.util.Scanner;

public class MultiplicationTable
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        

        System.out.print("Enter the First Number :: ");
        int first = bang.nextInt();
        System.out.print("Enter the Second Number :: ");
        int second = bang.nextInt();
        System.out.println("\nMultiplication table for " + first);
        
        for(int i = 1; i <= second; i++)
        {
            int mult = i * first;
            System.out.println(i + " * " + first + " = " + mult);
        }
    }
}