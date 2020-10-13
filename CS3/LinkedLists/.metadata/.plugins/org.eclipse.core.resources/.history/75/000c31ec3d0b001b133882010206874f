import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*************************************************************************
 *  YOU DO NOT NEED TO MODIFY THIS FILE
 *
 *  Compilation:  javac NearestInsertion.java
 *  Execution:    java NearestInsertion < file.txt
 *  Dependencies: Tour.java Point.java StdIn.java StdDraw.java
 *
 *  Run nearest neighbor insertion heuristic for traveling
 *  salesperson problem and plot results.
 *
 *  % java NearestInsertion < tsp1000.txt
 *
 *************************************************************************/

public class NearestInsertion 
{
	public static void main(String[] args) 
    {
    	Scanner in = null;
    	
    	try {
    		in = new Scanner(new File("tsp1000.txt")); //change to test other files
    	}
    	catch (IOException ex) {}
    	
        // get dimensions
        int w = in.nextInt();
        int h = in.nextInt();
        StdDraw.setCanvasSize(w, h);
        StdDraw.setXscale(0, w);
        StdDraw.setYscale(0, h);
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.enableDoubleBuffering();
        // run smallest insertion heuristic
        Tour tour = new Tour();
        
        while (in.hasNextLine()) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            Point p = new Point(x, y);
            tour.insertNearest(p);

            /*
             * uncomment the 4 lines below to animate
             */
//            StdDraw.clear();
//            tour.draw();
//            StdDraw.show();
//            StdDraw.text(100, 0, "" + tour.distance());
//            StdDraw.pause(1);
        }

        // draw to standard draw
        tour.draw();
        
        StdDraw.show();
        
        // print tour to standard output
        System.out.printf("Tour distance =  %.4f\n", tour.distance());
        System.out.printf("Number of points = %d\n", tour.size());
        tour.show();
    }
}
