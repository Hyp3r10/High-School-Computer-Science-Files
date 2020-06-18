import java.util.Scanner;

public class Digits
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Enter number :: ");
        int num = bang.nextInt();
        int temp = num;
        int back = 0;
        int digitCount = 1;
        System.out.println("\nDigits");
        System.out.println("------");
        while(temp > 0)
        {
            back = temp % 10;
            System.out.println(back);
            temp = temp / 10;
            digitCount++;
        }
        System.out.println("\nDigit Count :: " + digitCount);
    }
}