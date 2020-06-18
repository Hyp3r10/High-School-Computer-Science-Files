import java.util.Scanner;

public class WhileLoop103
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        
        /**
         * 1. Start (Loop Control Variable)
         * 2. Boolean Conditional (The loop runs while it is true and ends when it is false.)
         * 3. Increment (Optional, what the loop goes up/down by)
         */
        
        String password = ""; // Part 1
        String cpw = "wumbo";
        
        while(!password.equals(cpw)) // Part 2
        {
            System.out.print("Enter your Password :: ");
            password = bang.nextLine();
            if(password.equals(cpw))
            {
                System.out.println("You entered in the correct Password. You may proceed. May the force be with you.");
            }
            else
            {
                System.out.println("Wrong password, WUMBO! Try again!\n");
            }
        } 
    }
}