import java.util.*;
public class SuperHeroesRunner
{
    public char choice;
    public char newChoice;
    public Scanner scan;
    public SuperHeroes test;
    public static void main (String args[])
    {
        SuperHeroesRunner app = new SuperHeroesRunner();
        app.getSuperHero();
    }
    public void getSuperHero()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter super hero's name :: ");
        String name = scan.nextLine();
        System.out.print("Enter super hero's age :: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Main super power :: ");
        String power = scan.nextLine();
        System.out.print("<Secret> Hero's real name :: ");
        String sName = scan.nextLine();
        System.out.print("<Secret> Hero's weakness :: ");
        String sWeakness = scan.nextLine();
        secretReport();
        if(choice == 'y')
        {
            SuperHeroes superHero1 = new SuperHeroes(name, age, power, sName, sWeakness, choice);
            System.out.println(superHero1.toString());
        }
        else// if(choice == 'n')
        {
            SuperHeroes superHero1 = new SuperHeroes(name, age, power);
            System.out.println(superHero1.toString());
        }
        getNewChoice();
        if(newChoice == 'y')
        {
            getSuperHero();
        }
        else
        {
            System.out.println("\nHave a nice day!");
        }
    }
    public void secretReport()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nInclude secret info in profile report? <y/n> :: ");
        String user = scan.nextLine();
        choice = user.charAt(0);
    }
    public void getNewChoice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nWould you like to enter another? <y/n> :: ");
        String newUser = scan.nextLine();
        newChoice = newUser.charAt(0);
    }
}