//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the first social security number :: ");
		String social1 = scan.nextLine();
		
		System.out.print("Enter the second social security number :: ");
		String social2 = scan.nextLine();
		
		System.out.print("Enter the third social security number :: ");
		String social3 = scan.nextLine();
		
		System.out.print("Enter the last social security number :: ");
		String social4 = scan.nextLine();
		scan.close();
		
		System.out.print("\n");
		
		Social test1 = new Social(social1);
		System.out.println(test1);
		
		Social test2 = new Social(social2);
		System.out.println(test2);
		
		Social test3 = new Social(social3);
		System.out.println(test3);
		
		Social test4 = new Social(social4);
		System.out.println(test4);
		
		
	}
}