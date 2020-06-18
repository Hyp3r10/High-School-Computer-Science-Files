import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		//add test cases

		Word one = new Word("chicken");
		out.println(one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());		

		//add more test cases

		one.setWord("alligator");
		out.println("\n\n"+one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());

		one.setWord("elephant");
		out.println("\n\n"+one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());



	}
}