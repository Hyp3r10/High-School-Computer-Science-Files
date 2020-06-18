import java.util.Scanner;

public class StringLength
{
    public static void main (String[] args)
    {
        Scanner strL = new Scanner (System.in);
        
        System.out.print("Enter First Word --> ");
        String firstString = strL.nextLine();
        System.out.print("Enter Second Word --> ");
        String secondString = strL.nextLine();
        
        int firstL = firstString.length();
        int secondL = secondString.length();
        
        if (firstL == secondL)
        {
            System.out.println("\n" + firstString + " has the same # of letters as " + secondString);
        }
        else
        {
            System.out.println("\n" + firstString + " does not have the same # of letters as " + secondString);
        }
    }
}