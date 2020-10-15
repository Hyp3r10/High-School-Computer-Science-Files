/*************************************************************************
 *  YOU DO NOT NEED TO MODIFY THIS FILE
 *
 * Taken from section 3.2, An Introduction to Programming (in Java) by Robert
 * Sedgewick and Kevin Wayne
 *
 *  Compilation:  javac Point.java
 *  Execution:    java Point
 *
 *  Immutable data type for 2D points.
 *
 *************************************************************************/

public class Point { 
    private final double x;   // Cartesian
    private final double y;   // coordinates
   
    // create and initialize a point with given (x, y)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // return Euclidean distance between invoking point this and that
    public double distanceTo(Point that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // draw this point using standard draw
    public void draw() {
        StdDraw.point(x, y);
    }

    // draw the line from the invoking point this to that using standard draw
    public void drawTo(Point that) {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // return string representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}