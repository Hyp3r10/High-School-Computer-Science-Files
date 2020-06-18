import java.util.Scanner;

public class OddEvenString
{
    public static void main (String[] args)
    {
        Scanner isString = new Scanner (System.in);
        
        System.out.print("Enter a word :: ");
        String oddEven = isString.nextLine();
        int isOddEven = (oddEven.length())%2;
        
        if(isOddEven == 0) 
        {
            System.out.println(oddEven + " is even.");
        }
        if(isOddEven == 1) 
        {
            System.out.println(oddEven + " is odd.");
        }
    }
}