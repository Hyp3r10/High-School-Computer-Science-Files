import java.util.Scanner;

public class DiscountDeterminer
{
    public static void main (String[] args)
    {
        Scanner discount = new Scanner (System.in);
        
        System.out.print("Enter the orriginal bill amount :: ");
        int bill = discount.nextInt();
        
        if(bill > 2000) 
        {
            bill *= 0.85;
        }
        
        System.out.println("Bill after discount :: " + bill);
    }
}