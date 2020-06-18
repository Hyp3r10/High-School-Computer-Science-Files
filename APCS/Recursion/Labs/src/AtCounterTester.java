import static java.lang.System.*;

public class AtCounterTester
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter c = new AtCounter();
		//test the code
		System.out.println("0 0 has " + c.countAts(0,0) + " @s connected.");
		System.out.println("2 5 has " + c.countAts(2,5) + " @s connected.");
		System.out.println("5 0 has " + c.countAts(5,0) + " @s connected.");
		System.out.println("9 9 has " + c.countAts(9,9) + " @s connected.");
		System.out.println("3 9 has " + c.countAts(3,9) + " @s connected.");

		System.out.println("\n" + c);
		//add more test cases
	}
}