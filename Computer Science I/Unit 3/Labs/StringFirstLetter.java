import java.util.Scanner;

public class StringFirstLetter
{
    public static void main (String[] args)
    {
        Scanner strL = new Scanner (System.in);
        
        System.out.print("Enter First Word --> ");
        String firstString = strL.nextLine();
        System.out.print("Enter Second Word --> ");
        String secondString = strL.nextLine();
        
        char firstChar = firstString.charAt(0);
        char secondChar = secondString.charAt(0);
        
        if (firstChar == secondChar)
        {
            System.out.println("\n" + firstString + " has the same first letter as " + secondString);
        }
        else
        {
            System.out.println("\n" + firstString + " does not have the same first letter as " + secondString);
        }
    }
}