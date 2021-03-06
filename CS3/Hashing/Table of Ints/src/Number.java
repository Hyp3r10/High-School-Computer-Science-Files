
public class Number {
	private int theValue;	// The value of this object
	/**
	 * Constructs a Number object with the passed value
	 * @param value	The value of the Number
	 */
	public Number(int value) {
		this.theValue = value;
	}	
	/**
	 * Returns the value of this Number object
	 * @return the value of this Number object
	 */
	public int getValue() {
		return theValue;
	}
	@Override
	public boolean equals(Object obj) {
		return this.theValue == ((Number) obj).getValue();
	} 
	@Override
	public int hashCode() {
		return this.theValue % 10;
	}
	@Override
	public String toString() {
		return "" + this.theValue;
	}	
}