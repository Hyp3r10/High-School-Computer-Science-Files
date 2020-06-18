import java.util.ArrayList;
import java.util.Arrays;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		// How many ' 's are there?
		int length = 1;
		for(int i = 0 ; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				length++;
			}
		}
		wordRay = new String[length];

		//Parse the Strings into slots in the array
		for(int i = 0; i < length; i++) {
			String temp = sentence;
			if(i != length-1) {
				temp = sentence.substring(0, sentence.indexOf(' '));
				sentence = sentence.substring(sentence.indexOf(' ')+1);
			}
			wordRay[i] = temp;
		}
		sort();
		toString();
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}
	public String toString()
	{
		String output="";
		for(int i = 0; i < wordRay.length; i++) {
			output+=wordRay[i] + "\n";
		}
		return output+"\n";
	}
}