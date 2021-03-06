import java.util.Map;
import java.util.TreeMap;

public class Histogram {
	private Map<String,Integer> histogram;
	/**
	 * Default constructor to instantiate a blank histogram object
	 */
	public Histogram() {
		this.histogram = new TreeMap<String, Integer>();
	}
	/**
	 * Constructor that takes a sentence and initializes the histogram to reflect the number of each character
	 * @param sent	The sentence being read in
	 */
	public Histogram(String sent) {
		this.histogram = new TreeMap<String, Integer>();
		this.setSentence(sent);
	}
	/**
	 * Takes the sentence and sets the histogram to reflect the sentence and its parts
	 * @param sentence	The sentence being made into a histogram
	 */
	public void setSentence(String sentence) {
		String[] line = sentence.split(" ");
		this.histogram.clear();
		for(String character : line) {
			int numCharacters = 0;
			if(this.histogram.containsKey(character)) {
				numCharacters = this.histogram.get(character);
			}
			this.histogram.put(character, numCharacters+1);
		}
	}
	@Override
	public String toString() {
		String output="char\t1---5----10\n";
		for(String character : this.histogram.keySet()) {
			int numElements = this.histogram.get(character);
			output += character  + "\t";
			for(int i = 0; i < numElements; i++) {
				output += "*";
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}