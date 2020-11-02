import java.util.Map;
import java.util.TreeMap;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram() {
		this.histogram = new TreeMap<String, Integer>();
	}

	public Histogram(String sent) {
		this.histogram = new TreeMap<String, Integer>();
		this.setSentence(sent);
	}
	
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

	public String toString()
	{
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