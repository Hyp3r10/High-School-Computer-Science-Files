import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < count; i++)
		{
			String in = scan.nextLine();
			int lol = in.indexOf(',');
			String name = in.substring(0, lol);
			int num = Integer.parseInt(in.substring(lol+1));
			int min = 0;
			int hr = 0;
			int day = 0;
			int yr = 0;

			if(num/60 >= 1)
			{
				hr = num/60;
				min = num%60;
				if(hr/24 >= 1)
				{
					day = hr/24;
					hr = hr%24;
					if(day/365 >= 1)
					{
						yr = day/365;
						day = day%365;
					}
				}
			}
			else
				min = num;

			System.out.print(name + " - ");
			if(yr != 0) {System.out.print(yr + " year(s) ");}
			if(day != 0) {System.out.print(day + " day(s) ");}
			if(hr != 0) {System.out.print(hr + " hour(s) ");}
			if(min != 0) {System.out.println(min + " minute(s)");}

			
		}
	}
}
