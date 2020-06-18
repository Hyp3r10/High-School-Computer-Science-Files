import java.util.Scanner;

public class OddEvenInt
{
    public static void main (String[] args)
    {
        Scanner isInt = new Scanner (System.in);
        
        System.out.print("Enter a integer number :: ");
        int oddEven = isInt.nextInt();
        int newOddEven = oddEven % 2;
        
        if(newOddEven == 0) 
        {
            System.out.println(oddEven + " is odd :: false");
            System.out.println(oddEven + " is even :: true");
        }
        if(newOddEven == 1) 
        {
            System.out.println(oddEven + " is odd :: true");
            System.out.println(oddEven + " is even :: fasle");
        }
    }
}