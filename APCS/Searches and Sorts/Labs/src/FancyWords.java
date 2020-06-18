import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		// How many ' 's are there?
		int length = 1;
		for(int i = 0 ; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				length++;
			}
		}
		String[] tempList = new String[length];

		//Parse the Strings into slots in the array
		for(int i = 0; i < length; i++) {
			String temp = sentence;
			if(i != length-1) {
				temp = sentence.substring(0, sentence.indexOf(' '));
				sentence = sentence.substring(sentence.indexOf(' ')+1);
			}
			tempList[i] = temp;
		}

		wordRay = new String[length];

		int count = 0;
		for(int i = tempList.length-1; i >= 0; i--) {
			wordRay[count] = tempList[i];
			count++;
		}
		toString();
	}

	public String toString()
	{
		// Which string has the highest length?
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < wordRay.length; i++) {
			if(wordRay[i].length() > max) {
				max = wordRay[i].length(); 
			}
		}
		// Add spaces infront of words with too little chars
		for(int i = max; i >= 0; i--) {
			for(int j = 0; j < wordRay.length; j++) {
				if(wordRay[j].length()+1 > max) {
					wordRay[j] = wordRay[j];
				}
				else {
					wordRay[j] = " " + wordRay[j];
				}
			}
		}
		//System.out.println(Arrays.toString(wordRay));
		// Print the fancy array
		String output="";
		for(int j = max-1; j >= 0; j--) { // Ammount of times down
			for(int i = 0; i < wordRay.length; i++) { // Amount of times across-
				output+=wordRay[i].charAt(j);
			}
			output+="\n";
		}		
		return output+"\n";
	}
}