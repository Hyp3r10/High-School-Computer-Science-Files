import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;
	}
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		//        index  0123456789
		int vowelCount = 0;
		for(int i = 0; i < word.length(); i++) {
			for(int j = 0; j < vowels.length(); j++) {
				if(word.charAt(i) == vowels.charAt(j)) {
					vowelCount++;
				}
			}
		}
		return vowelCount;
	}
	public int compareTo( Word2 rhs ) {
		if(word.equals(rhs.toString())) {
			return 0;
		}
		else if(this.numVowels() < rhs.numVowels()) {
			return -1;
		}
		else if(this.numVowels() > rhs.numVowels()) {
			return 1;
		}
		return word.compareTo(rhs.toString());
	}
	public String getWord()
	{
		return word;
	}
	public String toString()
	{
		return word;
	}
}