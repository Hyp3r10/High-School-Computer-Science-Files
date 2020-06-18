import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class I {

	public static void main(String  []args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("I.dat"));

		int len = sc.nextInt();
		sc.nextLine();
		System.out.println("Gnomes:");
		for(int i = 0; i < len; i++)
		{
			int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			try
			{
				sc.nextLine();
			}
			catch(Exception e)
			{
			}
			if((nums[0] < nums[1]) && (nums[1] < nums[2]))
			{
				System.out.println("Ordered");
			}
			else if((nums[0] > nums[1]) && (nums[1] > nums[2]))
			{
				System.out.println("Ordered");
			}
			else
			{
				System.out.println("Unordered");
			}
		}
		
	}
}
