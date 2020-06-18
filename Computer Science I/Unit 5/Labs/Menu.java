import java.util.Scanner;
public class Menu
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int user;
        System.out.println("\tMenu");
        System.out.println(" ============");
        System.out.println("1. Dr. Pepper");
        System.out.println("2. Coke");
        System.out.println("3. Sprite");
        System.out.println("4. 7-UP");
        System.out.println("5. Diet Coke");
        System.out.print("\nSelection :: ");
        user = scan.nextInt();
        while(user > 5)
        {
            System.out.println("\nYou entered an invalid selection, please try again.\n");
            System.out.println("\tMenu");
            System.out.println(" ============");
            System.out.println("1. Dr. Pepper");
            System.out.println("2. Coke");
            System.out.println("3. Sprite");
            System.out.println("4. 7-UP");
            System.out.println("5. Diet Coke");
            System.out.print("\nSelection :: ");
            user = scan.nextInt();
        }
        switch(user)
        {
            case 1: 
                System.out.println("\nYou have chosen Dr. Pepper");
                break;
            case 2: 
                System.out.println("\nYou have chosen Coke");
                break;
            case 3: 
                System.out.println("\nYou have chosen Sprite");
                break;
            case 4: 
                System.out.println("\nYou have chosen 7-UP");
                break;
            case 5: 
                System.out.println("\nYou have chosen Diet Coke");
                break;
            default: 
                System.out.println("\nYou entered an invalid selection, please try again.");
                break;
        }
    }
}