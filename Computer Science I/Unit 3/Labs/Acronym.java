import java.util.Scanner;

public class Acronym
{
    public static void main(String[] args)
    {
           Scanner acronym = new Scanner(System.in);
           
           System.out.print("Enter 3 words --> ");
           String ac1 = acronym.next();
           String ac2 = acronym.next();
           String ac3 = acronym.next();
           
           System.out.println("\nNew Word = " + (ac1.substring(0, 1)) + (ac2.substring(0, 1)) + (ac3.substring(0, 1)) );
    }
}