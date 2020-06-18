import java.util.Scanner;

public class CharacterAnalyzer
{
    public static void main (String[] args)
    {
        Scanner ASCII = new Scanner (System.in);
        
        System.out.print("Enter a letter :: ");
        String letterNull = ASCII.next();
        
        char letter = letterNull.charAt(0);
        int letterASCII = (int) letter;
        
        if(letterASCII >= 48)
        {
            if(letterASCII <= 57)
            {
                System.out.println(letter + " is a number. ASCII == " + letterASCII);
            }
            if(letterASCII >=65)
            {
                if(letterASCII <= 90)
                {
                    System.out.println(letter + " is an uppercase letter. ASCII == " + letterASCII);
                }
            }
            if(letterASCII >=97)
            {
                if(letterASCII <= 122)
                {
                    System.out.println(letter + " is a lowercase letter. ASCII == " + letterASCII);
                }
            }
        }
    }
}