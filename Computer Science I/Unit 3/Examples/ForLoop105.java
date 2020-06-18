import java.util.Scanner;

public class ForLoop105
{
    public static void main (String[] args)
    {
        Scanner hulk = new Scanner (System.in);
        
        System.out.print("Enter a word: ");
        String word = hulk.nextLine();
        
        // backwards
        
        System.out.print("Your word backwards :: ");
        
        for(int index = word.length() - 1; index >= 0; index--)
        {
            System.out.print(word.charAt(index));
        }

        System.out.println();
        
        // forwards
        
        System.out.print("Your word forwards :: ");
        
        for(int index = 0; index < word.length(); index++)
        {
            System.out.print(word.charAt(index));
        }
    }
}
