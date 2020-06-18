import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Factorial {
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("factors.dat"));
		int times = scan.nextInt();
		for(int o=0; o<times;o++)
		{
			int num = scan.nextInt();
			
			for(int i = num; i>0; i--)
			{
				System.out.print(num);
				num--;
				if(num!=0)
				System.out.print("x");
			}
			System.out.println();
		}
	}

}
