import java.util.Scanner;

public class Money
{
    public static void main (String[] args)
    {
        Scanner coins = new Scanner (System.in);
        
        int pennies, nickels, dimes, quarters = 0;
        int totalCents, cents, dollars = 0;
        
        System.out.print("How many pennies do you have --> ");
        pennies = coins.nextInt();
        System.out.print("How many nickels do you have --> ");
        nickels = coins.nextInt();
        System.out.print("How many dimes do you have --> ");
        dimes = coins.nextInt();
        System.out.print("How many quarters do you have --> ");
        quarters = coins.nextInt();
        
        totalCents = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25);
        dollars = totalCents / 100;
        cents = totalCents % 100;
        
        System.out.print("\nTotal value = " + dollars + " and " + cents + " cents");
    }
}