import java.util.Scanner;

public class Replace
{
    public static void main(String[] args)
    {
        Scanner astrict = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String word = astrict.nextLine();
        
        char findA = 'a';
        
        System.out.println( "\n" + word.substring(0, word.indexOf(findA)) + "*" + (word.substring(word.indexOf(findA)+1)));
    }
}