public class Cat extends Mammal
{
	private String type;
	
	public Cat(int a, String fc, String t)
	{
		super(a,fc);
		type = t;
	}
	
	public String toString()
	{
	    return "Animal Profile::\n" +
	    "Type: " + type + "\n" +
	    "Color: " + furColor + "\n" +
	    "Age: " + age;
	}
}