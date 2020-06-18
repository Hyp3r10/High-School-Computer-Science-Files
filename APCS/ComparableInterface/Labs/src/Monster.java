import static java.lang.System.*;

public class Monster
{
	private String name;
	private int howBig;	
	private static int number;

	public Monster() {
		name = "";
		howBig = 0;
		number = 0;
	}
	public Monster(String n, int size) {
		name = n;
		howBig = size;
	}
	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster other)
	{
		return other.getHowBig() < this.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		//call isBigger() use !
		return !(other.getHowBig() < this.getHowBig());
	}

	public boolean namesTheSame(Monster other)
	{
		return other.getName().equals(this.getName());
	}
	
	public String toString()
	{
		number++;
		return "Monster " + number + " " + this.getName() + " " + this.getHowBig();
	}
}