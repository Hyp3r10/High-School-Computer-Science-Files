import java.util.Scanner;

public class RepeatWords
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner (System.in);
        /**
         * 1. Start (Loop Control Variable)
         * 2. Boolean Conditional (The loop runs while it is true and ends when it is false.)
         * 3. Increment (Optional, what the loop goes up/down by)
         */
        String word = "";
        int wordCount = 0;
        System.out.println("Enter words, type (stop or exit) to stop: \n");
        while(!word.equals("stop") && !word.equals("exit"))
        {
            word = keyboard.nextLine();
            if(!word.equals("stop") && !word.equals("exit"))
            {
                wordCount++;
            }
        }
        System.out.println("\nYou entered " + wordCount + " words.");
    }
}