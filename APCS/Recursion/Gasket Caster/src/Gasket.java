import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Gasket extends Canvas implements Runnable
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Gasket()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLUE);
		window.setFont(new Font("ARIAL",Font.BOLD,24));
		window.drawString("Sierpinski's Gasket", 25, 50);

		gasket(window, (WIDTH-10)/2, 20, WIDTH-40, HEIGHT-20, 40, HEIGHT-20);
	}

	public void gasket(Graphics window, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		window.drawLine(x1, y1, x2, y2);
		window.drawLine(x2, y2, x3, y3);
		window.drawLine(x3, y3, x1, y1);

		int midpointX1 = (x1 + x2) / 2;
		int midpointY1 = (y1 + y2) / 2;
		int midpointX2 = (x2 + x3) / 2;
		int midpointY2 = (y2 + y3) / 2;
		int midpointX3 = (x3 + x1) / 2;
		int midpointY3 = (y3 + y1) / 2;
		//base case goes here
		if(x2-x1 < 2 && x3-x1 < 2 && x1-x1 < 2 && y2-y1 < 2 && y3-y1 < 2 && y1-y1 < 2) {
			return;
		}
		//make a random color here
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			Color randomColor = new Color(r, g, b);
		//draw lines to make a triangle or use fillPolygon
			window.setColor(randomColor);
			window.drawLine(midpointX1, midpointY1, midpointX2, midpointY2);
			window.drawLine(midpointX2, midpointY2, midpointX3, midpointY3);
			window.drawLine(midpointX3, midpointY3, midpointX1, midpointY1);
			window.drawLine(x1, y1, midpointX1, midpointY1);
			window.drawLine(x2, y2, midpointX2, midpointY2);
			window.drawLine(x3, y3, midpointX3, midpointY3);
		//make some recursive calls
			gasket(window, x1, y1, midpointX1, midpointY1, midpointX3, midpointY3);
			gasket(window, midpointX1, midpointY1, x2, y2, midpointX2, midpointY2);
			gasket(window, midpointX3, midpointY3, midpointX2, midpointY2, x3, y3);
	}

	public void run()
	{
		try{
			Thread.currentThread().sleep(3);
		}
		catch(Exception e)
		{
		}
	}
}