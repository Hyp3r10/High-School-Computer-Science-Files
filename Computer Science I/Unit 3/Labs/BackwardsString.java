import java.util.Scanner;

public class BackwardsString
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Enter a word :: ");
        String word = bang.nextLine();
        int len = word.length()-1;
        
        System.out.println("\n" + (word.charAt(0)));
        System.out.println(word.charAt(len));
        for(int index = word.length() - 1; index >= 0; index--)
        {
            System.out.print(word.charAt(index));
        }
        System.out.println("\n" + word);
    }
}