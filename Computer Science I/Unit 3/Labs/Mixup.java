import java.util.Scanner;

public class Mixup
{
    public static void main(String[] args)
    {
        Scanner mix = new Scanner(System.in);
        
        System.out.print("Enter in a string --> ");
        String word = mix.nextLine();
        
        int len = word.length();
        int len2 = (int)(Math.ceil(len / 2));
        
        System.out.println("\nThe new word is: " + (word.substring(len2)) + (word.substring(0, len2)));
    }
}