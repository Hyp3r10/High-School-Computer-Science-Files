
public class Temp {
	public static void main(String[] args) {
		Point p = new Point(3, 25);
		change(p);
		System.out.println(p);
	}
	public static void change(Point x) {
		Point temp = new Point(99, -1);
		x = temp;
	}
}

class Point {
	public int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return this.x + " " + this.y; 
	}
}