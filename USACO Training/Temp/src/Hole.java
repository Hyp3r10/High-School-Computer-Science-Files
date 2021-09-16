import java.awt.Color;
import java.awt.Graphics;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Hole extends Obstacle
{
	//Constructor
	public Hole(Game g, int y, int x)
	{
		//passes access to game and current coordinates up to Obstacle
		super(g, y, x);
		
		//sets width and height to 40
		super.setWidth(40);
		super.setHeight(40);
	}

	//paints the black hole
	@Override
	public void paintComponent(Graphics g, Game game)
	{
		//Sets Color
		g.setColor(Color.BLACK);
		
		//paints black hole
		g.fillRect(super.obstacleXStart, super.obstacleYStart, super.width, super.height);
	}
	
	//endsRound after collision
	@Override
	public void collision()
	{
		//if collision occurs, end round
		if(isCollision())
		{
			super.getGame().endRoundObstacle();
		}
	}
}