import java.util.Scanner;

public class Acronym
{
    public static void main(String[] args)
    {
           Scanner acronym = new Scanner(System.in);
           
           System.out.print("Enter 3 words --> ");
           String user = acronym.nextLine();
           
           user = user.substring(user.length());
           System.out.print(user);
    }
}