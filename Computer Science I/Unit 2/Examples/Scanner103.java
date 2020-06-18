import java.util.Scanner;

public class Scanner103
{
    public static void main(String[] args)
    {
        {   //First Block
            Scanner luke = new Scanner(System.in);
        
            System.out.print("Enter in a name --> ");
            String name = luke.nextLine();
        
            System.out.print("Enter in an age --> ");
            byte age = luke.nextByte();
        
            System.out.println("\nYour name is: " + name);
            System.out.println("Your age is: " + age);
            
            luke.nextLine(); // Dummy string clears out enter from memory of previouos input.
        }
        {    // Second Block
            Scanner luke = new Scanner(System.in);
        
            System.out.print("\n\nEnter in a name --> ");
            String name = luke.nextLine();
        
            System.out.print("Enter in an age --> ");
            byte age = luke.nextByte();
        
            System.out.println("\nYour name is: " + name);
            System.out.println("Your age is: " + age);
        }
    }
}