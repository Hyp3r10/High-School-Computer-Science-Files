import java.util.Scanner;

public class StringFirstLetterComplex
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
        int firstASCII = (int) firstChar;
        int secondASCII = (int) secondChar;
        
        // First Letter
        if(firstASCII >= 48)
        {
            if(firstASCII >=65)
            {
                if(firstASCII <= 90)
                {
                    int firstChar2 = firstASCII;
                }
            }
            if(firstASCII >=97)
            {
                if(firstASCII <= 122)
                {
                    int firstChar2 = firstASCII - 33;
                }
            }
        }
        
        // Second Letter
        if(secondASCII >= 48)
        {
            if(secondASCII >=65)
            {
                if(secondASCII <= 90)
                {
                    int secondChar2 = secondASCII;
                }
            }
            if(secondASCII >=97)
            {
                if(secondASCII <= 122)
                {
                    int secondChar2 = secondASCII - 33;
                }
            }
        }
        
        if(firstASCII == secondASCII)
        {
            System.out.println("\n" + firstString + " has the same first letter as " + secondString);
        }
        else
        {
            System.out.println("\n" + firstString + " does not have the same first letter as " + secondString);
        }
    }
}