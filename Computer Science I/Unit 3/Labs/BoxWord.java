import java.util.Scanner;

public class BoxWord
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Enter a word: ");
        String word = bang.nextLine();
        System.out.print("\n");
        for(int i = 1; i <= word.length(); i++)
        {
            System.out.println(word);
        }
    }
}