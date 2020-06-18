import java.util.Scanner;

public class ReverseNumber
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner (System.in);
        
        System.out.print("Please enter the number you want to reverse :: ");
        int num = bang.nextInt();
        int temp = num;
        int back = 0;
        System.out.print("\n" + num + " reversed is ");
        while(temp > 0)
        {
            back = temp % 10;
            System.out.print(back);
            temp = temp / 10;
        }
    }
}