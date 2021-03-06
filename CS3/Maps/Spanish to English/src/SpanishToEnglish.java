import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SpanishToEnglish {
	private Map<String,String> pairs;	// The map that has Spanish words referencing English ones
	/**
	 * Default constructor that instantiates pairs
	 */
	public SpanishToEnglish() {
		pairs = new TreeMap<String, String>();
	}
	/**
	 * Adds an entry of the Spanish to English translation into pairs
	 */
	public void putEntry(String entry) {
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}
	/**
	 * Takes a sentence and translates it to English using the references stored in the map
	 * @param sent	The sentence being translated to English
	 * @return		The sentence translated into English 
	 */
	public String translate(String sent) {
		Scanner chop = new Scanner(sent);
		String output ="";
		
		for(String temp : sent.split(" ")) {
			output += this.pairs.get(temp) + " ";
		}
		
		return output;
	}
	@Override
	public String toString() {
		return pairs.toString().replaceAll("\\,","\n");
	}
}