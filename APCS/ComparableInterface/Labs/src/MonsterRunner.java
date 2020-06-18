import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name1 = keyboard.nextLine();
		System.out.print("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		//instantiate monster one
		Monster monster1 = new Monster(name1, size1);
		
		keyboard.nextLine();
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.nextLine();
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		//instantiate monster two
		Monster monster2 = new Monster(name2, size2);

		System.out.println("\n" + monster1);
		System.out.println(monster2);
		
		if(monster1.isBigger(monster2)) {
			System.out.println("\nMonster one is Bigger than Monster two.");
		}
		else if(monster1.getHowBig() == monster2.getHowBig()) {
			System.out.println("\nMonster one is the same size as Monster two.");
		}
		else {
			System.out.println("\nMonster one is Smaller than Monster two.");
		}
		if(monster1.namesTheSame(monster2)) {
			System.out.println("Monster one has the same name as Monster two.");
		}
		else {
			System.out.println("Monster one does not have the same name as Monster two.");
		}
	}
}