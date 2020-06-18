//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;

public class WordFun
{
	private String word;
	private String wordUp;
	private String wordDash;

	public WordFun()
	{
		word = "";
		wordUp = "";
		wordDash = "";
	}

	public WordFun(String w)
	{
		word = w;
		wordUp = w;
		wordDash = w;
	}

	public void setWord(String w)
	{
		word = w;
	}

	public void makeUpper()
	{
		wordUp = word.toUpperCase();
	}

	public void addHyphen()
	{
		int loc = wordUp.indexOf(" ");
		wordDash = wordUp.substring(0,loc) + "-" + wordUp.substring(++loc);
	}
	@Override
	public String toString()
	{
		makeUpper();
		addHyphen();
		return word + "\n" + wordUp + "\n" + wordDash;
	}
}