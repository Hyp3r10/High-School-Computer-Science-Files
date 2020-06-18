import java.util.Scanner;

public class Square
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Enter a word: ");
        String word = bang.nextLine();
        String width = "";
        int len = word.length();
        
        System.out.println("\n" + word);
        for(int i = 1; i < word.length()-1; i++)
        {
            width += " ";
        }
        for(int i = 0; i < len; i++)
        {
            char forwards = (word.charAt(0 + i));
            char backwards = (word.charAt((len - 1)- i));
            System.out.println(forwards + width + backwards);
        }
        System.out.println(word);
    }
}