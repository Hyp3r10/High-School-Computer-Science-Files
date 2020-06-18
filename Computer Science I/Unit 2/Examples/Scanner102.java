import java.util.Scanner;

public class Scanner102
{
    public static void main(String[] args)
    {
        Scanner vader = new Scanner(System.in);
        
        /*System.out.print("Enter in a sentence--> ");
        String sentence = vader.nextLine();
        
        System.out.println("The sentence you enterd is: " + sentence);*/
        
        System.out.print("\nEnter three words: ");
        String word1 = vader.next();
        String word2 = vader.next();
        String word3 = vader.next();
        
        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        System.out.println("Word 3: " + word3);
    }
}