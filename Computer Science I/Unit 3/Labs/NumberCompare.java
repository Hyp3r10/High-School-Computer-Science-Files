import java.util.Scanner;

public class NumberCompare
{
    public static void main (String[] args)
    {
        Scanner compare = new Scanner (System.in);
        
        System.out.print("Enter First Integer --> ");
        int first = compare.nextInt();
        System.out.print("Enter Second Integer --> ");
        int second = compare.nextInt();
        
        if (first > second)
        {
            System.out.println("\n" + first + " -- " + second);
            System.out.println("largest == " + first);
            System.out.println("smallest == " + second);
        }
        else
        {
            System.out.println("\n" + first + " -- " + second);
            System.out.println("largest == " + second);
            System.out.println("smallest == " + first);
        }
    }
}