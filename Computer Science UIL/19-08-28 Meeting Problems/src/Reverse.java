import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
public class Reverse {
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("reverse.dat"));
		int times = scan.nextInt();
		for(int o=0; o<times; o++)
		{
			String word = scan.next();
			int start = scan.nextInt();
			int end = scan.nextInt();
			System.out.println(word.substring(0,start)+word.substring(end));
		}	
	}

}
