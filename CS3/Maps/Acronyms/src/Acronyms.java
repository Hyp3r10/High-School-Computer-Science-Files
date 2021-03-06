import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Acronyms {
	private Map<String,String> acronymTable;	// The Map indicating what each acronym stands for
	private String sent = "";					// The sentence being constructed
	/**
	 * Default constructor that instantiates the TreeMap to be a blank Map.
	 */
	public Acronyms() {
		this.acronymTable = new TreeMap<String, String>();
	}
	/**
	 * Adds the passed entry into the Map of known Acronyms
	 * @param entry	The Acronym and expanded acronym separated by a '-'
	 */
	public void putEntry(String entry) {
		String[] parts = entry.split(" - ");
		acronymTable.put(parts[0], parts[1]);
	}
	/**
	 * Change the sentence into the version where the Acronyms are replaced
	 * with the words associated to them
	 * @param sent	The sentence being changed
	 * @return		The sentence with the acronyms expanded
	 */
	public String convert(String sent) {
		this.sent += sent + "\n";
		Scanner chop = new Scanner(sent);
		String output ="";
		while(chop.hasNext()) {
			String temp = chop.next();
			if(acronymTable.containsKey(temp.replaceAll("[.,?!\\\\n]", ""))) {
				output += acronymTable.get(temp.replaceAll("[.,?!\\\\n]", ""));
				if(temp.substring(temp.length()-1).matches("[.,?!\\\\n]")) {
					output += temp.substring(temp.length()-1);
				}
			}
			else {
				output += temp;
			}
			output += " ";
		}
		return output;
	}
	@Override
	public String toString() {
		String output = "==== MAP CONTENTS ====\n\n";
		output += this.acronymTable.toString().replaceAll(",", "\n");
		output += "\n\n==== READ LINES ====\n";
		return output;	
	}
}