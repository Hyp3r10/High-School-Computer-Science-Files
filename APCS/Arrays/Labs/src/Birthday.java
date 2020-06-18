public class Birthday {
	// instance variables
	private String name;
	private String bDay;
	// constructors
	public Birthday() {
		name = "";
		bDay = "";
	}
	public Birthday(String name, String bDay) {
		this.name = name;
		this.bDay = bDay;
	}
    // accessor methods
	public String getName() {
		return name;
	}
	public String getBDay() {
		return bDay;
	}
	@Override
	public String toString() {
		return "Name :: " + getName() + 
			 "\nBirthday :: " + getBDay();
		}
}
