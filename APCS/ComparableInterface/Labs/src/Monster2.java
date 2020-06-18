import static java.lang.System.*;

public class Monster2 implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;
	private static int number;

	//write a default Constructor
	public Monster2() {
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}
	//write an initialization constructor with an int parameter ht
	public Monster2(int ht) {
		myWeight = 0;
		myHeight = ht;
		myAge = 0;
	}
	//write an initialization constructor with int parameters ht and wt
	public Monster2(int ht, int wt) {
		myWeight = wt;
		myHeight = ht;
		myAge = 0;
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster2(int ht, int wt, int age) {
		myWeight = wt;
		myHeight = ht;
		myAge = age;
	}
	//modifiers - write set methods for height, weight, and age
	public void setMyHeight(int ht) {
		myHeight = ht;
	}
	public void setMyWeight(int wt) {
		myWeight = wt;
	}
	public void setMyAge(int age) {
		myAge = age;
	}
	//accessors - write get methods for height, weight, and age
	public int getMyHeight() {
		return myHeight;
	}
	public int getMyWeight() {
		return myWeight;
	}
	public int getMyAge() {
		return myAge;
	}
	//creates a new copy of this Object
	public Object clone()
	{
		return new Monster2(myHeight, myWeight, myAge);
	}
	public boolean equals( Object obj )
	{
		Monster2 monster2 = (Monster2) obj;
		if(this.getMyHeight() == monster2.getMyHeight() && this.getMyWeight() == monster2.getMyWeight() && this.getMyAge() == monster2.getMyAge()) {
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo( Object obj )
	{
		Monster2 rhs = (Monster2)obj;
		if(this.equals(rhs)) {
			return 0;
		}
		// > (positive)
		else if(this.getMyHeight() > rhs.getMyHeight()) {
			return 1;
		}
		else if(this.getMyHeight() < rhs.getMyHeight()){
			return -1;
		}
		else if(this.getMyWeight() > rhs.getMyWeight()) {
			return 1;
		}
		else if(this.getMyWeight() < rhs.getMyWeight()) {
			return -1;
		}
		else if(this.getMyAge() > rhs.getMyAge()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	//write a toString() method
	@Override
	public String toString() {
		number++;
		return this.getMyHeight() + " " + this.getMyWeight() + " " + this.getMyAge();
	}
}