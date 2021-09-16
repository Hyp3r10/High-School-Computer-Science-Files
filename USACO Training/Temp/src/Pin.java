import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Pin extends JPanel implements Items
{
	//instance variables
	//Dimensions of each pin
	private int length;
	private int width;
	
	//coordinates of each pin
	private int x, y;
	
	//allows us to connect the jpg of the Pin to Graphics
	private BufferedImage image;
	
	//Constructor
	public Pin()
	{	
		//accesses the jpg
		try {
            image = ImageIO.read(new File("pin.png"));
          } catch (IOException e) {
          }
		
		//Initializes the dimensions
		length = image.getHeight();
		width = image.getWidth();
	}
	
	//Getters
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	//Setters
	public void setX(int newX)
	{
		x = newX;
	}
	
	public void setY(int newY)
	{
		y = newY;
	}
	
	//paints individual pin
	public void paintComponent(Graphics g, Game game)
	{
		//passes g to JPanel
		super.paintComponent(g);
		
		//paints image
		g.drawImage(image, x, y, this);
	}
}