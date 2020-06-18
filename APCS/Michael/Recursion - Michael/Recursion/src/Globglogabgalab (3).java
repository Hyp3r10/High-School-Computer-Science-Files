// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Gasket extends Canvas implements Runnable
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
//	private int mpx1;
//	private int mpy1;
//	private int mpx2;
//	private int mpy2;
//	private int mpx3;
//	private int mpy3;
//	
//	private int red;
//	private int green;
//	private int blue;

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
		window.drawLine(x1,y1,x2,y2);
		window.drawLine(x2,y2,x3,y3);
		window.drawLine(x3,y3,x1,y1);
		
		int mpx1=(x1+x2)/2;
		int mpy1=(y1+y2)/2;
		int mpx2=(x2+x3)/2;
		int mpy2=(y2+y3)/2;
		int mpx3=(x3+x1)/2;
		int mpy3=(y3+y1)/2;
		
		if(x2-x1 < 2 && x3-x1 < 2 && x1-x1 < 2 && y2-y1 < 2 && y3-y1 < 2 && y1-y1 < 2)
			return;
		
		int red=(int)(Math.random()*256);
		int green=(int)(Math.random()*256);
		int blue=(int)(Math.random()*256);
		
		Color randomColor=new Color(red,green,blue);
		window.setColor(randomColor);
		
		window.drawLine(mpx1,mpy1,mpx2,mpy2);
		window.drawLine(mpx2,mpy2,mpx3,mpy3);
		window.drawLine(mpx3,mpy3,mpx1,mpy1);
		window.drawLine(x1,y1,mpx1,mpy1);
		window.drawLine(x2,y2,mpx2,mpy2);
		window.drawLine(x3,y3,mpx3,mpy3);
		
		gasket(window,x1,y1,mpx1,mpy1,mpx3,mpy3);
		gasket(window,mpx1,mpy1,x2,y2,mpx2,mpy2);
		gasket(window,mpx3,mpy3,mpx2,mpy2,x3,y3);
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