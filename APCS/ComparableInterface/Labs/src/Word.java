import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	@Override
	public int compareTo( Word rhs ) {
		if(word.equals(rhs.toString().length())) {
			return 0;	
		}
		else if(word.length() > rhs.word.toString().length()) {
			return 1;
		}
		else if(word.length() < rhs.word.toString().length()) {
			return -1;
		}
		return word.compareTo(rhs.toString());
	}
	public String toString()
	{
		return word;
	}
}