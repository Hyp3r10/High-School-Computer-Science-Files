import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Star {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("star.dat"));
		int cases = file.nextInt();
		file.nextLine();
		for(int i=0; i<cases; i++)
		{
			int stu = file.nextInt();
			int max = -1;
			String name = "";
			
			for(int j=0;j<stu; j++)
			{
				String k = file.next();
				int n = file.nextInt();
				if(max<n)
				{
					max = n;
					name = k;
				}
				
			}
			System.out.println(name);
			
		}

	}
}