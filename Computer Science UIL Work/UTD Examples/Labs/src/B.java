import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B
{
	public static void main(String  []args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("B.dat"));
		String letters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int len = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < len; i++)
		{
			String[] nums = {""+sc.next(), ""+sc.next(), ""+sc.next()};
			sc.nextLine();
			System.out.println(nums[0] + " " + letters.charAt((int)(Long.parseLong(nums[2], (int)Long.parseLong(nums[1])) % (Long.parseLong(nums[1])-1))));
		}
	}
}