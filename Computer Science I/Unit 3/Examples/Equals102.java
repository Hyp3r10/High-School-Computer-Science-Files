import java.util.Scanner;

public class Equals102
{
    public static void main (String[] args)
    {
        Scanner pass = new Scanner(System.in);
        
        System.out.print("Enter your passwod: ");
        String password = pass.nextLine();
        
        
        // When comparing Strings do not use relational operators (e.g. == <= >= > < !=)
        //if(password.equals("wumbo")) // is the same IDEA as password == "wumbo"
        if(password.equalsIgnoreCase("wumbo"))    
            System.out.println("\nAcess Granted");   
        else   
            System.out.println("\nYou have NOT enterd your PIN correctly! Enjoy your time with thew Sharks.");
    }
}