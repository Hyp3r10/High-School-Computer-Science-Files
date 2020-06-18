import java.util.Scanner;

public class VerticalString
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Enter a string --> ");
        String word = bang.nextLine();
        System.out.print("\n");
        int len = word.length();
        
        for(int i = 0; i < len; i++)
        {
            System.out.println(word.substring(i,(i+1)));
        }
    }
}