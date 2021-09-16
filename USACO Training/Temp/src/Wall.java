import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Wall extends Obstacle
{
	//allows access to jpg image
	private BufferedImage image;

	public Wall(Game g, int y, int x)
	{
		//sends current Game and coordinates to Obstacle
		super(g, y, x);
		
		//provides access to jpg image
		try {
            image = ImageIO.read(new File("wall.png"));
          } catch (IOException e) {
          }
		
		//Initializes width and height
		super.setWidth(image.getWidth());
		super.setHeight(image.getHeight());
	}

	@Override
	public void paintComponent(Graphics g, Game game)
	{
		//sends g to JPanel
		super.paintComponent(g);
		
		//paints image
		g.drawImage(image, super.obstacleXStart, super.obstacleYStart, this);
	}

	@Override
	public void collision()
	{
		//calls wallCollision of super class if collision occurs
		super.wallCollision();
	}

}