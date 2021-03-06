
public class Word {
	private String theValue;	// The value of this object
	//write a constructor
	/**
	 * Constructs a Word object with the passed value
	 * @param value	The value of the Number
	 */
	public Word(String value) {
		this.theValue = value;
	}	
	//write the getValue method
	/**
	 * Returns the value of this Word object
	 * @return the value of this Word object
	 */
	public String getValue() {
		return theValue;
	}
	//write the equals method
	@Override
	public boolean equals(Object obj) {
		return this.theValue.equals(((Word) obj).getValue());
	} 
	
	//write the hashCode method
	@Override
	public int hashCode() {
		String vowels = this.theValue.replaceAll("[^aeiouyAEIOUY]", "");
		return (vowels.length() * this.theValue.length()) % 10;
	}
	//write the toString method
	@Override
	public String toString() {
		return "" + this.theValue;
	}
}