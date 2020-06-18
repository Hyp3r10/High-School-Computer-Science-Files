import java.util.*;

public class SongApp
{
	public static void main(String[] args)
	{
		SongTester s = new SongTester();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number of bottles -->");
		int b = keyboard.nextInt();
		s.song(b);    // call to void method
		System.out.println();
		System.out.println();
	}
}

class SongTester
{
	public void song(int b)
	{
		if(b == 0) {// base case has been reached )
		}
		else {
			System.out.println(b + " bottles of root beer on the wall.\n" + 
					b  + " bottles of root beer.\n" + 
					"Take one down, pass it around\n" + 
					(b-1) + " bottles of root beer on the wall.\n");
			song(b-1);   // recursive case
		}
	}
}