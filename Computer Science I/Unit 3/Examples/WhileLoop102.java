import java.util.Scanner;

public class WhileLoop102
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        
        /**
         * 1. Start (Loop Control Variable)
         * 2. Boolean Conditional (The loop runs while it is true and ends when it is false.)
         * 3. Increment (Optional, what the loop goes up/down by)
         */
        
        int pin = 0; // Part 1
        
        while(pin != 1234) // Part 2
        {
            System.out.print("Enter your PIN :: ");
            pin = bang.nextInt();
            if(pin == 1234)
            {
                System.out.println("You entered in the correct PIN. You may proceed. May the force be with you.");
            }
            else
            {
                System.out.println("Wrong PIN, WUMBO! Try again!\n");
            }
        } 
    }
}