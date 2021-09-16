import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Canvas;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings({ "unused", "serial" })
public class BowlingBall extends JPanel implements Items
{
	//dimensions of the Bowling Ball
	
	//Bowling Ball length
	private int length;
	
	//Bowling Ball width
	private int width;
	
	//coordinates of the Bowling Ball
	
	//Bowling Ball x
	private int ballX;
	
	//Bowling Ball y
	private int ballY;
	
	//allows us to connect the jpg of the Bowling Ball to Graphics
	private BufferedImage image;
	
	//paints Bowling Ball
	public void paintComponent(Graphics g, Game game)
	{
		super.paintComponent(g);
		
		//sets ballX and ballY to current coordinates of Bowling Ball
		ballX = game.getBallX();
		
		ballY = game.getBallY();
	
		//paints ball
		g.drawImage(image, ballX, ballY, this);
	}
	
	//initializes Bowling Ball values
	public BowlingBall()
	{
		//sets length, width, ballX, and ballY
		length = 42;
		width = 42;
		ballX = 506;
		ballY = 661;
		
		//accesses the jpg
		try {
            image = ImageIO.read(new File("ball.png"));
          } catch (IOException e) {
          }
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
		return ballX;
	}
	
	public int getY()
	{
		return ballY;
	}
}