import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FancyWordsRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("fancywords.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			//instantiate a new WordSort
			FancyWords fw1 = new FancyWords(sentence);
			System.out.println(fw1);
		}
	}
}