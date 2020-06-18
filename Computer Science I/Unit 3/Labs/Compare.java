import java.util.Scanner;

public class Compare
{
    public static void main (String[] args)
    {
        Scanner compare = new Scanner(System.in);
        
        System.out.print("Enter Number 1 --> ");
        int num1 = compare.nextInt();
        System.out.print("Enter Number 2 --> ");
        int num2 = compare.nextInt();
        
        if (num1 > num2)
            System.out.println("\n" + num1 + " is greater than " + num2);
        else if (num1 < num2)  
            System.out.println("\n" + num1 + " is less than " + num2);
        else if (num1 == num2)
            System.out.println("\n" + num1 + " is equal to " + num2);
    }
}
