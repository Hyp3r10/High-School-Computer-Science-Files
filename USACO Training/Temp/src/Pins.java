import java.awt.Graphics;

import javax.swing.JPanel;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Pins extends JPanel implements Items
{
	//instance variables
	private int width, startX, startY;
	private Pin[] pins;
	private static int endY;
	
	public Pins()
	{
		//creates new array
		pins = new Pin[10];
		
		//initializes values
		startX = 268;
		startY = 9;
		
		//sets width of it
		width = 796 - startX;
		
		//creates 10 base pins
		for(int i = 0; i < pins.length; i++)
		{
			pins[i] = new Pin();
		}
		
		//initializes the width and length of each individual pin
		int pinWidth = pins[0].getWidth();
		int pinLength = pins[0].getLength();
		
		//sets space between each pin
		int space = ((width - pinWidth*5)/5);
		
		//sets location of back 4 pins
		for(int i = 1; i < 5; i++)
		{
			pins[i-1].setX((i * space + (i-1) * pinWidth) + startX);
			pins[i-1].setY(startY);
		}
		
		//sets location of second Row
		
		for(int i = 0; i < 3; i++)
		{
			pins[i+4].setX(((i+1) * space + (i) * pinWidth+ (space+pinWidth)/2) + startX);
			pins[i+4].setY((pinLength/3 * 2)+startY);
		}
		
		//sets location of third Row
		
		for(int i = 0; i < 2; i++)
		{
			pins[i+7].setX(pins[i+1].getX());
			pins[i+7].setY((pinLength/3 * 4) + startY);
		}
		
		//sets location of fourth row
		pins[9].setX(pins[5].getX());
		pins[9].setY((pinLength/3 * 6) + startY);
		
		//sets location of the edge of the fourth row (y)
		endY = pins[9].getY() + pinLength;
	}
	
	//provides access to the y-value at the edge of the fourth row
	public static int getEndY()
	{
		return endY;
	}
	
	//paints pins
	@Override
	public void paintComponent(Graphics g, Game game)
	{
		//sends g to JPanel
		super.paintComponent(g);
		
		//paints pins
		for(int i = 0; i < pins.length; i++)
		{
			pins[i].paintComponent(g, game);
		}
	}
}