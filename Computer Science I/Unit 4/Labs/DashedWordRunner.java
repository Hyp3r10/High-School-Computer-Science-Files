import java.util.Scanner;

public class DashedWordRunner
{
    public static void main (String[] args)
    {
        Scanner bang = new Scanner (System.in);
        DashedWord qwerty = new DashedWord();
        
        System.out.print("Enter a string --> ");
        String word = bang.nextLine();
        System.out.print("\n");
        
        // Void Method Call
        qwerty.dashV(word);
        
        // Return Method Call
        System.out.println("Dashed word :: " + qwerty.dashR(word));
    }
}