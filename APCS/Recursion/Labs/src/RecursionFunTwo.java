import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
		if(word.indexOf("chicken") > -1) {
			String temp1 = word.substring(0, word.indexOf("chicken"));
			String temp2 = word.substring(word.indexOf("chicken") + 7);
			word = temp1 + temp2;
			return 1+countChickens(word);
		}
		return 0;
	}
}