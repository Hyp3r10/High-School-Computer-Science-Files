import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class LevelDesign extends JPanel implements Items
{
	//Accesses Game class and makes ArrayList
	private ArrayList<Obstacle> obstacles;
	private Game game;
	
	//Constructor
	public LevelDesign(int round, Game g)
	{
		//sets Current instance of game
		game = g;
		
		//instantiates new ArrayList
		obstacles = new ArrayList<Obstacle>();
		
		//no obstacles in round 0
		
		//sets each round to its design
		if(round == 1)
			design1();
		else if(round == 2)
			design2();
		else if(round == 3)
			design3();
		else if(round == 4)
			design4();
	}
	
	//Only Walls
	public void design1()
	{
		for(int i = 0; i < 3; i++)
		{
			//makes a random x value that is valid
			int xWallRandom = (int) (Math.random()*480+247);
			
			//makes a random y value that is valid
			int yWallRandom = (int) (Math.random()*(661-Pins.getEndY()-39)+Pins.getEndY());
			
			//creates a new Wall with those random coordinates
			obstacles.add(new Wall(game, yWallRandom, xWallRandom));
		}
	}
	
	//Only Walls but more
	public void design2()
	{
		for(int i = 0; i < 5; i++)
		{
			//makes a random x value that is valid
			int xWallRandom = (int) (Math.random()*480+247);
			
			//makes a random y value that is valid
			int yWallRandom = (int) (Math.random()*(661-Pins.getEndY()-39)+Pins.getEndY());
			
			//creates a new Wall with those random coordinates
			obstacles.add(new Wall(game, yWallRandom, xWallRandom));
		}
	}
	
	//Only Holes
	public void design3()
	{
		for(int i = 0; i < 4; i++)
		{
			//makes a random x value that is valid
			int yHoleRandom = (int) (Math.random()*(661-Pins.getEndY()-19)+Pins.getEndY());
			
			//makes a random y value that is valid
			int xHoleRandom = (int) (Math.random()*510+247);
			
			//creates a new Hole with those random coordinates
			obstacles.add(new Hole(game, yHoleRandom, xHoleRandom));
		}
	}
	
	//Holes and Walls
	public void design4()
	{
		//add Walls
		for(int i = 0; i < 6; i++)
		{
			//makes a random x value that is valid
			int xWallRandom = (int) (Math.random()*480+247);
			
			//makes a random y value that is valid
			int yWallRandom = (int) (Math.random()*(661-Pins.getEndY()-39)+Pins.getEndY());
			
			//creates a new Wall with those random coordinates
			obstacles.add(new Wall(game, yWallRandom, xWallRandom));
		}
		
		//add Holes
		
		for(int i = 0; i < 3; i++)
		{
			//makes a random x value that is valid
			int yHoleRandom = (int) (Math.random()*(661-Pins.getEndY()-19)+Pins.getEndY());
			
			//makes a random y value that is valid
			int xHoleRandom = (int) (Math.random()*510+247);
			
			//creates a new Hole with those random coordinates
			obstacles.add(new Hole(game, yHoleRandom, xHoleRandom));
		}
	}
	
	//checks if collision occurs
	public void collision()
	{
		//checks in every obstacle in ArrayList
		for(Obstacle o: obstacles)
		{
			if(o.isCollision())
			{
				o.collision();
			}
		}
	}
	
	//paints all obstacles
	@Override
	public void paintComponent(Graphics g, Game game)
	{
		//paints every Obstacle
		for(Obstacle o: obstacles)
		{
			o.paintComponent(g, game);
		}
	}

}