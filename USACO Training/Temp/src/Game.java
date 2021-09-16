import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.*;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Game extends JPanel implements Bounds
{
	//provides access to other classes
	private Pins pins;
	private BowlingBall ball;
	private Cursor c;
	private LevelDesign ld;
	
	//allows us to connect the jpg of the background to Graphics
	private BufferedImage image;
	
	//provides access to JButton and Timer
	private JButton button;
	private Timer timer;
	
	//instance variables
	private int ballX = 506, ballY = 661;
	private double velX = 0, velY = 0;
	private int cursor = 0;
	private int amount = 1;
	private boolean click = false;
	private int round = 0;
	private boolean roundOver = true;
	private int score;
	private static ArrayList<Items> obj;
	private boolean started = false;
	private boolean endRound = false;
	private int pinsKnocked = 0;
	private static int highScore = 0;
	
	
	//Creates a new JPanel and imports the background
	//Starts program after instantiating objects
	public Game()
	{
		//sets Frame
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		add(Box.createVerticalStrut(280));
		add(Box.createVerticalGlue());
		
		c = new Cursor();
		button = c.getButton();
		score = 0;
		
		//gets jpg of background
		try {
            image = ImageIO.read(new File("background.jpg"));
          } catch (IOException e) {
          }
		
		//initializes ArrayList and adds cursor to it
		obj = new ArrayList<Items>();
		obj.add(c);
		
		//calls start of program
		started = true;
		startTimer();
	}
	
	//Starts program
	public void startTimer()
	{	
		timer = new Timer(2, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//starts first round
				update();
			}
		});
		timer.start();
	}
	
	//paints background
	@Override
	protected void paintComponent(Graphics g)
	{
		//passes JPanel to g
		super.paintComponent(g);
		
		//paints image
		g.drawImage(image, 0, 0, this);
	}
	
	//goes through all of the Items and paints them
	@Override
	public void paint(Graphics g)
	{
		//passes g to JPanel
		super.paint(g);
		
		//paints all objects inside of ArrayList if not empty
		if(obj != null)
		{
			for(Items i: obj)
			{
				i.paintComponent(g, this);
			}
		}
	}
	
	public boolean endRound()
	{
		//returns true if the ball hits contact with pins
		if(ballY <= Pins.getEndY())
		{
			regenerate();
			return true;
		}
		//returns true if ball comes back to beginning position or if it hits a hole
		else if(ballY >= 670 || endRound)
		{
			regenerate2();
			return true;
		}
		return false;
	}
	
	//Happens when the ball comes back to the start or when it hits a hole
	public void regenerate2()
	{
		//resets values and increments round
		roundOver = true;
		round++;
		click = false;
		endRound = false;
		
		//repaints
		repaint();
		
		//brings up Score
		displayScore2();
		
		//starts next round
		update();
	}
	
	//sets the round back to original settings and starts next round
	public void regenerate()
	{
		//resets values and increments round
		roundOver = true;
		round++;
		click = false;
		
		//shows score
		displayScore();
		
		//starts next round
		update();
	}
	
	//Gets score if the ball ends back at the beginning or if ball collides with hole
	public void displayScore2()
	{
		//passes in no score
		Score s = new Score();
		
		//removes previous instances of Score
		for(int i = obj.size()-1; i >= 0; i--)
		{
			if(obj.get(i) instanceof Score)
			{
				obj.remove(i);
			}
		}
		
		//adds current Score to ArrayList to be painted
		obj.add(s);
		repaint();
	}
	
	//gets score of that round
	public void displayScore()
	{
		//makes new Score object
		Score s = new Score(ballX);
		
		//obtains how many pins knocked
		pinsKnocked = s.getPinsKnocked();
		
		//adds score of round to overall score
		score += pinsKnocked;
		
		//removes all previous instances of score
		for(int i = obj.size()-1; i >= 0; i--)
		{
			if(obj.get(i) instanceof Score)
			{
				obj.remove(i);
			}
		}
		
		//adds current Score instance to ArrayList for painting
		obj.add(s);
		repaint();
	}
	
	//Creates new ball, pins, and level layout after every round
	@SuppressWarnings("unused")
	public void update()
	{
		//makes sure game is played only 5 times
		if(round < 5 && roundOver == true)
		{
			//sets the variables back to initial values
			roundOver = false;
			velX = 0;
			velY = 0;
			
			//creates new Bowling Ball, Pins, and LevelDesign objects
			ball = new BowlingBall();
			pins = new Pins();
			ld = new LevelDesign(round, this);
			
			//resetting the round
			for(int i = obj.size()-2; i >= 0; i--)
			{
				obj.remove(i);
			}
			
			//gets Bowling Ball dimensions
			
			//current coordinates of ball
			ballX = ball.getX();
			ballY = ball.getY();
			
			//length and width
			int width = ball.getWidth();
			int length = ball.getLength();
			
			//adds to ArrayList
			obj.add(ball);
			obj.add(pins);
			obj.add(ld);
			
			//calls the cursorControl method
			cursorControl();
			
			//calls the method to send ball
			animate();
			
		}
		//sends the user back to Main menu
		else if(round == 5)
		{
			//ends all game aspects
			setStarted(false);
			timer.stop();
			
			//sends JFrame to final screen
			Main.setPanelSwitch(3);
		}
	}
	
	//sets the ball in motion
	public void animate()
	{
		//makes a new thread
		Thread thread2 = new Thread(new Runnable() {
			public void run()
			{
				//makes sure that ball hasn't hit the pins yet
				while(!endRound())
				{	
					//checks to see if ballX is in bounds
					if(inBounds(ballX))
					{
						try
						{
							//checks if collision occurs with obstacles
							ld.collision();
							//moves the ball after every 5 milliseconds
							ballX = ballX + (int) velX;
							ballY = ballY + (int) velY;
							repaint();
							Thread.sleep(12);
						} catch (InterruptedException e)
						{
						}
					}
					else
					{
						try
						{
							//checks if collision occurs with obstacles
							ld.collision();
							//changes direction if out of bounds and then moves the ball every 15 milliseconds
							velX *= -1;
							ballX = ballX + (int) velX;
							ballY = ballY + (int) velY;
							repaint();
							Thread.sleep(12);
						} catch(InterruptedException e)
						{
						}
					}
				}
			}
		});
		
		//starts animation of ball
		thread2.start();
	}
	
	//controls the movement of the cursor and how the user is supposed to aim
	public void cursorControl()
	{
		obj.add(c);
		//makes a new thread
		Thread thread = new Thread(new Runnable() {
			public void run()
			{
				//resets cursor
				cursor = 0;
				
				//until the button is clicked, this program will run
				while(!click)
				{
					//checks if cursor is under 7 and above -7
					if(cursor <= 7 && cursor >= -7)
					{
						try
						{	
							//increments cursor every 100 milliseconds
							Thread.sleep(100);
							cursor += amount;
							repaint();
						} catch (InterruptedException e)
						{
						}
					}
					//resets cursor
					else
					{
						try
						{
							//sets cursor back to -7 after 100 milliseconds
							Thread.sleep(100);
							//changes direction after reaching -7 or 7
							amount *= -1;
							cursor += amount;
							repaint();
						} catch (InterruptedException e)
						{
						}
					}
				}
				
				//sets the velocity of the ball's x to the cursor
				velX = cursor;
				velY = -1;
				
			}
		});
	
		//calls action when button is clicked
		button.addActionListener(new ActionListener() {

			//sets click to true to end loop
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//shows that click occured
				click = true;
				//removes cursor object in ArrayList
				for(int i = obj.size()-1; i >= 0; i--)
				{
					if(obj.get(i) instanceof Cursor)
						obj.remove(i);
				}
			}
		});
		
		//starts the cursor movement
		thread.start();
		
	}
	
	//Getters
	public JButton getButton()
	{
		return button;
	}
	
	public int getBallX()
	{
		return ballX;
	}
	
	public int getBallY()
	{
		return ballY;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public boolean getStarted()
	{
		return started;
	}
	
	public int getCursorValue()
	{
		return cursor;
	}
	
	public int getHighScore()
	{
		return highScore;
	}
	
	public int getPinsKnocked()
	{
		return pinsKnocked;
	}
	
	//Setters
	public void setBallXValue(int x)
	{
		ballX = x;
	}
	
	public void setBallYValue(int y)
	{
		ballY = y;
	}
	
	public void setVelY()
	{
		velY *= -1;
	}
	
	public void setVelX()
	{
		velX *= -1;
	}
	
	public void setStarted(boolean s)
	{
		started = s;
	}
	
	public void setHighScore()
	{
		if(score > highScore)
		{
			highScore = score;
		}
	}
	
	public void endRoundObstacle()
	{
		endRound = true;
	}
	
	//checks to see if the ball doesn't exit the bowling lane
	public boolean inBounds(int x)
	{
		//bounds of bowling lane
		if(x < 754 && x > 247)
			return true;
		
		return false;
	}
}