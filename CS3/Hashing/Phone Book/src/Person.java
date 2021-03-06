
public class Person implements Comparable<Person> {
	public String firstName;	// The first name of the person
	public String lastName;		// The last name of the person
	/**
	 * Constructs a Person object with the passed variables
	 * @param first	The person's first name
	 * @param last	The person's last name
	 */
	public Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	@Override
	public int hashCode() {
		return (this.firstName.charAt(0) + this.lastName.charAt(0)) % (this.firstName.length() + this.lastName.length()) % 12;
	}
	@Override
	public boolean equals(Object o) {
		Person other = (Person) o;
		return (this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName));
	}
	@Override
	public int compareTo(Person other) {
		if(this.firstName.compareTo(other.firstName) < 0) {
			return -1;
		} 
		else if(this.firstName.compareTo(other.firstName) > 0) {
			return 1;
		}
		else {
			if(this.lastName.compareTo(other.lastName) < 0) {
				return -1;
			}
			else if(this.lastName.compareTo(other.lastName) > 0) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}
