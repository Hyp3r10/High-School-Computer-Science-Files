import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

public class Cursor implements Items
{
	//Button
	private JButton button;
	
	//instance variables
	//start of cursor line coordinates
	private int startX = 527, y = 661;
	
	//end x of cursor line
	private int endX;
	
	//cursor value from game
	private int cursor;
	
	public Cursor()
	{
		//Initializes button
		button = new JButton("Click to Release Ball");
	}
	
	//provides access to button
	public JButton getButton()
	{
		return button;
	}
	
	//paints the cursor line
	@Override
	public void paintComponent(Graphics g, Game game)
	{
		cursor = game.getCursorValue();
		
		endX = (int) (startX + cursor*5);
		g.setColor(Color.GRAY);
		g.drawLine(startX, y, endX, y-20);
	}
	
	//getters
	public int getDiffX()
	{
		return endX - startX;
	}
}