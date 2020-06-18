import java.util.Scanner;

public class IsolateChar
{
    public static void main (String[] args)
    {
        Scanner isolate = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String temp = isolate.nextLine();
        
        char first = temp.charAt(0);
        
        System.out.println("The first letter is: " + first);
        System.out.println("The ASCII value of the first letter is: " + (int)first);
    }
}