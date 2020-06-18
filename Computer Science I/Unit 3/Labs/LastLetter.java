import java.util.Scanner;

public class LastLetter
{
    public static void main(String[] args)
    {
        Scanner lastLetter = new Scanner(System.in);
        
        System.out.print("Enter a string --> ");
        String lastL = lastLetter.nextLine();
        
        lastL = lastL.substring(lastL.length() -1);
        
        System.out.println("Last letter = " + lastL);
    }
}