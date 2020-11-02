import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Relatives {
	private Map<String,Set<String>> map;	// The Map referencing the name of a person to their relatives
	/**
	 * Default constructor that instantiates the map object to be a default map of String and set of String
	 */
	public Relatives() {
		this.map = new TreeMap<String, Set<String>>();
	}
	/**
	 * Takes the line of data and makes an entry into the map.
	 * @param line	The line of data containing the person and who the person is related to.
	 */
	public void setPersonRelative(String line) {
		String[] personRelative = line.split(" ");
		Set<String> relatives = new TreeSet<String>();
		if(this.map.containsKey(personRelative[0])) {
			relatives = this.map.get(personRelative[0]);
		}
		relatives.add(personRelative[1]);
		this.map.put(personRelative[0], relatives);
	}
	/**
	 * Given a passed person, return a text representation of who they are related to
	 * @param person	The person in question
	 * @return			The people that the person is related to
	 */
	public String getRelatives(String person) {
		Set<String> relatives = this.map.get(person);
		String output = person + " is related to ";
		for(String temp : relatives) {
			output += temp + ", ";
		}
		return output.substring(0,output.length()-2);
	}
	@Override
	public String toString() {
		String output = "";
		for(String person : map.keySet()) {
			output += this.getRelatives(person) + "\n";
		}
		return output;
	}
}