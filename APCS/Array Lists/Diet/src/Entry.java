
public class Entry {
	//Instance Variables
	public String date;
	public int weight;
	//Constructors
	public Entry() {
		date = "";
		weight = 0;
	}
	public Entry(String date, int weight) {
		this.date = date;
		this.weight = weight;
	}
	//Accessor Methods
	public String getDate() {
		return date;
	}
	public int getWeight() {
		return weight;
	}
	//Mutators
	public void setDate(String date) {
		this.date = date;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//toString
	@Override
	public String toString() {
		return "\n" + getDate() + "	" + getWeight() + "	";
	}
}
