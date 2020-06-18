import java.util.Scanner;

public class Equals101
{
    public static void main (String[] args)
    {
        Scanner deadpool = new Scanner(System.in);
        
        System.out.print("Enter your pin: ");
        int pin = deadpool.nextInt();
        
        if (pin == 3141)
            System.out.println("\nAcess Granted");
        else   
            System.out.println("\nYou have NOT enterd your PIN correctly! Enjoy your time with thew Sharks.");
    }
}
