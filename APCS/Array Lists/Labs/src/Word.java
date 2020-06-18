import static java.lang.System.*;

public class Word
{
	private String word;
	private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		word = "";
	}
	public Word(String wrd)
	{
		word = wrd;
	}
	public void setWord(String wrd)
	{
		word = wrd;
	}
	public int getNumVowels()
	{
		int count=0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == vowels.charAt(0) || word.charAt(i) == vowels.charAt(1) ||  word.charAt(i) == vowels.charAt(2) || word.charAt(i) == vowels.charAt(3) || word.charAt(i) == vowels.charAt(4) || word.charAt(i) == vowels.charAt(5) ||  word.charAt(i) == vowels.charAt(6) || word.charAt(i) == vowels.charAt(7) || word.charAt(i) == vowels.charAt(8) || word.charAt(i) == vowels.charAt(9)) {
				count++;
			}
		}
		return count;
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
		return "" + word;
	}
}