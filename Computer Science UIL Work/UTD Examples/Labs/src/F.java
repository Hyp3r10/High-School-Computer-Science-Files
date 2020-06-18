import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F {
	public static void main(String[]args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("F.dat"));
	
		String temp = sc.nextLine();
		
		while(!temp.equals("#"))
		{
			int num1s = 0;
			for(int i = 0; i < temp.length(); i++)
			{
				if(temp.charAt(i) == '1')
				{
					num1s++;
				}
				else if(temp.charAt(i) == 'e')
				{
					if(num1s % 2 == 0)
					{
						System.out.println(temp.substring(0, temp.length()-1) + "0");
					}
					else
					{
						System.out.println(temp.substring(0, temp.length()-1) + "1");
					}
				}
				else if(temp.charAt(i) == 'o')
				{
					if(num1s % 2 == 1)
					{
						System.out.println(temp.substring(0, temp.length()-1) + "0");
					}
					else
					{
						System.out.println(temp.substring(0, temp.length()-1) + "1");
					}
				}
			}
			temp = sc.nextLine();
		}
	}

}

