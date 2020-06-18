import java.util.Scanner;

public class DecreasingWord
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Enter a word: ");
        String word = bang.nextLine();
        System.out.print("\n");
        for(int i = word.length(); i >= 0; i--)
        {
            System.out.println(word.substring(0,i));
        }
    }
}