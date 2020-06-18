import java.util.ArrayList;
public class AbstractClass107 {
	public static void main(String[] args) {
		//Pet p = new Pet("Quin", 200, 5); // Cannot instantiate abstract classes
		ArrayList<Pet> pets = new ArrayList<>(); // Polymorphism (upcasting)
		
		
		pets.add(new Dog("Bingo", 6.022E23, 3.14159));
		pets.add(new Fox("Foxy", 10, 3));
		pets.add(new Cow("Betsy", 9000.1, 15));
		
		for(Pet p : pets) {
			System.out.println("A member of the " + p.getClass().getName().toLowerCase() + " class says :: " + p.speak() + "\n");
		}
	}
}
abstract class Pet {
	private String name;
	private double weight;
	private double height;
	
	public Pet(String n, double w, double h) {
		name = n;
		weight = w;
		height = h;
	}
	public String getName() { return name; }
	public double getWeight() { return weight; }
	public double getHeight() { return height; }
	public abstract String speak();
	@Override
	public String toString() {
		return "Name   : " + name + 
			   "\nWeight : " + getWeight() + 
			   "\nHeight : " + getHeight() + 
			   "\nSpeak  : " + speak(); // Calls speak method of appropriate subclass at runtime (dynamic/late binding)
			 
	}
}
class Dog extends Pet { // Concrete Class
	public Dog(String n, double w, double h) {
		super(n,w,h);
	}
	//Must implement all abstract methods!
	public String speak() {
		return "Bork!";
	}
}
class Fox extends Pet {
	public Fox(String n, double w, double h) {
		super(n,w,h); // calls the supet class (pet) constructor
	}
	public String speak() {
		return "Yip!";
	}
}
class Cow extends Pet {
	public Cow(String n, double w, double h) {
		super(n,w,h); // calls the supet class (pet) constructor
	}
	public String speak() {
		return "Moooooooooooo!";
	}
}