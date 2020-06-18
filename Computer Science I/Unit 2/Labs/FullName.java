import java.util.Scanner;

public class FullName
{
    public static void main(String[] args)
    {
        Scanner fn = new Scanner(System.in);
        
        System.out.print("Enter first name--> ");
        String first = fn.nextLine();
        System.out.print("Enter last name--> ");
        String last = fn.nextLine();
        
        System.out.println("\n" + first + ", " + last);
    }
}