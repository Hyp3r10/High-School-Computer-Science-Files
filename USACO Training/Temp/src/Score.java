import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Score extends JFrame implements Items
{
	//instance variables
	private int pinsKnocked;
	
	//where the ball hit pins
	private int hitPoint;
	
	//coordinates of Score string
	private int startX = 20, startY = 150;
	
	//randomly assigns amount of pins knocked based on hitPoint
	public void pinRandomizer(int hitPoint)
	{
		if((hitPoint > 247 && hitPoint <=308) || (hitPoint >= 735 && hitPoint < 796))
			pinsKnocked = (int)(Math.random()*3)+1;
		else if((hitPoint > 308 && hitPoint <=369) || (hitPoint >= 674 && hitPoint < 735))
			pinsKnocked = (int)(Math.random()*3)+3;
		else if((hitPoint > 369 && hitPoint <=430 || (hitPoint >= 613 && hitPoint < 674)))
			pinsKnocked = (int)(Math.random()*3)+5;
		else if((hitPoint > 430 && hitPoint <=491 || (hitPoint >= 552 && hitPoint < 613)))
			pinsKnocked = (int)(Math.random()*3)+7;	
		else if((hitPoint > 491 && hitPoint <552))
			pinsKnocked = (int)(Math.random()*2)+9;
	}
	
	//provides access to amount of pins knocked
	public int getPinsKnocked()
	{
		return pinsKnocked;
	}
	
	//Secondary Constructor
	public Score(int xHit)
	{
			hitPoint = xHit;
			pinRandomizer(hitPoint);
	}
	
	//Constructor
	public Score()
	{
		pinsKnocked = 0;
	}
	
	//sends the Strings onto the screen
	@Override
	public void paintComponent(Graphics g, Game game)
	{
		//Painting each String
		String str = "You Knocked Down ";
		g.setColor(Color.PINK);
		g.setFont(new Font("Lobster", 1, 20));
		g.drawString(str, startX, startY);
		
		String str1 = pinsKnocked + " pins!";
		g.drawString(str1, startX, startY+25);
		
		String str2 = "Total Score = " + game.getScore();
		g.drawString(str2, startX + 800, startY);
	}
}