import java.awt.Rectangle;

import javax.swing.JPanel;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public abstract class Obstacle extends JPanel implements Items
{	
	//instance variables
	//coordinates of obstacles
	protected int obstacleXStart, obstacleYStart;
	
	//dimensions of obstacles
	protected int width, height;
	
	//x start of ball
	private int ballXStart;
	
	//Rectangle object for collision
	private Rectangle intersect;
	
	//provides access to current Game class
	private Game game;
	
	//Rectangle object for ball and obstacle
	private Rectangle ballRect, obstacleRect;
	
	//Constructor
	public Obstacle(Game g, int y, int x)
	{
		//Initialize variables
		obstacleYStart = y;
		obstacleXStart = x;
		game = g;
	}
	
	//Determines what will happen after collision
	public abstract void collision();
	
	//checks if collision occurs
	public boolean isCollision()
	{
		//ball variables
		ballXStart = game.getBallX();
		int ballYStart = game.getBallY();
		
		//makes a ball and obstacle Rectangle
		ballRect = new Rectangle(ballXStart, ballYStart, 42, 42);
		obstacleRect = new Rectangle(obstacleXStart, obstacleYStart, width, height);
		
		if(ballRect.intersects(obstacleRect))
		{
			return true;
		}
		
		return false;
	}
	
	//Makes ball bounce off walls
	public void wallCollision()
	{	
		if(obstacleRect.intersects(ballRect))
		{
			//Determine the intersect of collision
			intersect = obstacleRect.intersection(ballRect);
			
			//Flags
			boolean vertical = false;
			boolean horizontal = false;
			boolean isLeft = false;
			boolean isTop = false;
			
			//Left side
			if(intersect.x == obstacleXStart)
			{
				vertical = true;
				isLeft = true;
			}
			//Right side
			else if(intersect.x + intersect.width == obstacleXStart + width)
			{
				horizontal = true;
			}
			
			//Top
			if(intersect.y == obstacleYStart)
			{
				vertical = true;
				isTop = true;
			}
			//Bottom
			else if(intersect.y + intersect.height == obstacleYStart + height)
			{
				vertical = true;
			}
			
			//Can only collide with one edge at once
			if(horizontal && vertical)
			{
				//Giving precedence to the longer edge
				if(intersect.width > intersect.height)
				{
					horizontal = false;
				}
				else
					horizontal = true;
			}
			
			//Collision with horizontal
			if(horizontal)
			{
				game.setVelX();
				
				//Move it to the correct side
				if(isLeft)
				{
					game.setBallXValue(obstacleXStart - 42);
				}
				else
					game.setBallXValue(obstacleXStart + width);
			}
			//Collision with vertical
			else if(vertical)
			{
				game.setVelY();
				
				//Move it to the correct side
				if(isTop)
				{
					game.setBallYValue(obstacleYStart - 42);
				}
				else
					game.setBallYValue(obstacleYStart + height);
			}
		}
	}
	
	//setters
	public void setHeight(int h)
	{
		height = h;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	//getter
	public Game getGame()
	{
		return game;
	}
}