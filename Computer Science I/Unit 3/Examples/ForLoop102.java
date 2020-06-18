import java.util.Scanner;

public class ForLoop102
{
    public static void main (String[] args)
    {
        Scanner hulk = new Scanner (System.in);
        
        System.out.print("Enter a word: ");
        String word =  hulk.nextLine();
        
        int len = word.length();
        int rcount = 0; //counter
        
        for(int i = 0; i < len; i++)
        {
            if(word.charAt(i) == 'r')
            {
                rcount++;
            }
        }
        System.out.println("\nYour word is: " + word);
        System.out.println("Yor word has " + rcount + " r(s) in it.");
    }
}