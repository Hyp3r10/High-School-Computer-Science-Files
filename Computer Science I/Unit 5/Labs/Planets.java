import java.util.Scanner;
public class Planets
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("   Planets");
        System.out.println("=============");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");
        System.out.println("8. Pluto"); 
        System.out.print("\nSelect planet(1-8) --> ");
        int planetNum = scan.nextInt();
        while(planetNum > 9)
        {
            System.out.println("Invalid choice, please try again.\n");
            System.out.println("   Planets");
            System.out.println("=============");
            System.out.println("1. Mercury");
            System.out.println("2. Venus");
            System.out.println("3. Mars");
            System.out.println("4. Jupiter");
            System.out.println("5. Saturn");
            System.out.println("6. Uranus");
            System.out.println("7. Neptune");
            System.out.println("8. Pluto"); 
            System.out.print("\nSelect planet(1-8) --> ");
            planetNum = scan.nextInt();
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("\nEnter your weight on Earth --> ");
        double earthW = scan.nextInt();
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        switch(planetNum)
        {
            case 1:
                System.out.println("Your weight on Mercury is " + earthW * 0.38);
                break;
            case 2:
                System.out.println("Your weight on Venus is " + earthW * 0.78);
                break;
            case 3:
                System.out.println("Your weight on Mars is " + earthW * 0.39);
                break;
            case 4:
                System.out.println("Your weight on Jupiter is " + earthW * 2.65);
                break;
            case 5:
                System.out.println("Your weight on Saturn is " + earthW * 1.17);
                break;
            case 6:
                System.out.println("Your weight on Uranus is " + earthW * 1.05);
                break;
            case 7:
                System.out.println("Your weight on Neptune is " + earthW * 1.23);
                break;
            case 8:
                System.out.println("Your weight on Pluto is " + earthW * 0.05);
                break;
        }
    }
}