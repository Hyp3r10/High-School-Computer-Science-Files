import java.awt.Color;
import java.awt.Font;

enum GemType {
    GREEN, BLUE, ORANGE; //define the different types of Gems, comma delimited
}

public class Gem {	
	/**
	 * Stores the condition of what color of Gem this is
	 */
	private GemType type;
	/**
	 * Stores the number of points associated with this current gem
	 */
	private int points;
	/**
	 * Used for storing the current location on the screen of the gem
	 */
	/** Tester main method */
	public static void main(String [] args)
	{
		final int maxGems = 16;
		
		// Create a gem of each type
		Gem green  = new Gem(GemType.GREEN, 10);
		Gem blue   = new Gem(GemType.BLUE, 20);
		Gem orange = new Gem(GemType.ORANGE, 30);
		System.out.println(green  + ", " + green.getType()  + ", " + green.getPoints());		
		System.out.println(blue   + ", " + blue.getType()   + ", " + blue.getPoints());
		System.out.println(orange + ", " + orange.getType() + ", " + orange.getPoints());
		green.draw(0.3, 0.7);
		blue.draw(0.5, 0.7);
		orange.draw(0.7, 0.7);
		
		// A row of random gems
		for (int i = 0; i < maxGems; i++)
		{
			Gem g = new Gem();
			g.draw(1.0 / maxGems * (i + 0.5), 0.5);
		}
	}
	/**
	 * Default constructor that instantiates the type variable to be
	 * a random number of points and a random type
	 */
	public Gem() {
		int rand1 = (int) (Math.random()*3);
		int rand2 = (int) (Math.random()*11)*5;
		switch(rand1) {
			case 0 : {
				this.type = GemType.GREEN;
				break;
			}
			case 1 : {
				this.type = GemType.BLUE;
				break;
			}
			case 2 : {
				this.type = GemType.ORANGE;
				break;
			}
		}
		this.points = rand2;
	}
	/**
	 * Overloaded constructor that instantiates the Gem to be equal to type 
	 * and the number of points to be equal to points
	 * @param type		The type of Gem that this Gem is
	 * @param points	The points associated with the current Gem
	 */
	public Gem(GemType type, int points) {
		this.type = type;
		this.points = points;
	}
	/**
	 * Accessor method for getting the type of Gem that this Gem is
	 * @return	The tpye of gem that this current Gem Object is
	 */
	public GemType getType() {
		return this.type;
	}
	/**
	 * Accessor method for getting the number of points that this
	 * current Gem is worth.
	 * @return	The number of points that this Gem is worth
	 */
	public int getPoints() {
		return this.points;
	}
	/**
	 * Draws the gem at (x, y)
	 * @param x	The x coordinate that this Gem is located at
	 * @param y	The y coordinate that this Gem is located at
	 */
	public void draw(double x, double y) {
		String fileName = "";
		switch(this.type) {
			case GREEN : {
				fileName = "gem_green.png";
				break;
			}
			case BLUE : {
				fileName = "gem_blue.png";
				break;
			}
			case ORANGE : {
				fileName = "gem_orange.png";
				break;
			}
		}
		// Places the image on the board at (x,y)
		StdDraw.picture(x, y, fileName);
		StdDraw.setFont(new Font("SansSerif", Font.BOLD, 14));
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.text(x, y, "" + this.points);
	}
	@Override
	public String toString() {
		return this.type.toString();
	}
}
