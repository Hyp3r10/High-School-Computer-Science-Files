import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
public class Steganography {
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("Steganography.dat"));
		int times = scan.nextInt();
		scan.nextLine();
		for(int o=0; o<times; o++)
		{
			char[] a = scan.nextLine().toCharArray();
			for(int i =0; i<a.length; i=i+2)
			{
				System.out.print(a[i]);
			}
			System.out.println();
		}
		
	}
}
