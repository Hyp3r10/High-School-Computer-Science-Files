
public class PhoneNumber implements Comparable<PhoneNumber> {
	public String phoneNumber;	// The String literal of the phone number
	public int[] parts; 		// The integer representations of the parts of the phone number
	/**
	 * Constructs a PhoneNumber object with the passed number
	 * @param numbers	The phone number of this object
	 */
	public PhoneNumber(String numbers) {
		this.phoneNumber = numbers;
		String[] strParts = numbers.split("-");
		this.parts = new int[strParts.length];
		for(int i = 0; i < strParts.length; i++) {
			this.parts[i] = Integer.parseInt(strParts[i]);
		}
	}
	@Override
	public int hashCode() {
		return ((parts[0] / 3) + (parts[1] / 3) + (parts[2] / 4));
	}
	@Override
	public boolean equals(Object o) {
		PhoneNumber other = (PhoneNumber) o;
		return this.phoneNumber.equals(other.phoneNumber);
	}
	@Override
	public int compareTo(PhoneNumber other) {
		if(this.parts[0] < other.parts[0]) {
			return -1;
		}
		else if(this.parts[0] > other.parts[0]) {
			return 1;
		}
		else {
			if(this.parts[1] < other.parts[1]) {
				return -1;
			}
			else if(this.parts[1] > other.parts[1]) {
				return 1;
			}
			else {
				if(this.parts[2] < other.parts[2]) {
					return -1;
				}
				else if(this.parts[2] > other.parts[2]) {
					return 1;
				}
				else {
					return 0;
				}
			}
		}
	}
	@Override
	public String toString() {
		return this.phoneNumber;
	}
}
