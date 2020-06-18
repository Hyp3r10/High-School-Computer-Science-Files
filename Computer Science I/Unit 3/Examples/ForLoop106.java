import java.util.Scanner;

public class ForLoop106
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        // forward loop backwards String
        
        System.out.print("Enter a word: ");
        String word = bang.nextLine();
        
        int len = word.length();
        
        System.out.print("Your word backwards :: ");
        
        for(int i = 0; i < len; i++)
        {
            System.out.print((word.charAt((len - 1) - i)));
            //                          highest index - i 
        }
        
        
    }
}