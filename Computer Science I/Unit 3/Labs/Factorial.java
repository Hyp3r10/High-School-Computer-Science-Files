import java.util.Scanner;

public class Factorial
{
    public static void main (String[] args)
    {
        Scanner hulk = new Scanner (System.in);
        System.out.print("Please enter the the number you want to apply a factorial to :: ");
        int number = hulk.nextInt();
        int i = 1;
        int fact = 1;
        for(i=1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("\nfactorial of " + number + " is " + fact);
    }
}