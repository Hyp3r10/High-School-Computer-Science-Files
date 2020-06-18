import java.util.Scanner;

public class Selection103
{
    public static void main (String[] args)
    {
        Scanner hulk = new Scanner(System.in);
        
        System.out.println("A virus has decended upon HHS");
        System.out.print("\nPlease enter how many particles have you been exposed to: ");
        int particles = hulk.nextInt();
        
        //Two-Way Selection
        if(particles >= 10000)
        {
            System.out.println("\nYou haev the virus!");
            System.out.println("I hope you enjoy the taste of brains. =)");
        }
        else // else never has a boolean conditional, NO SEMICOLIONS!
        {
            System.out.println("You are safe, for now. Sleep with one eye open...");
        }
    }
}