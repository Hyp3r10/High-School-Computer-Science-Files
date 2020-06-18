public class CalculateArea
{
	public static void main(String[] args) {
		CalculateArea app = new CalculateArea();
	}
	public CalculateArea() {
		Shape rectangle = new Rectangle(10, 20);
		Shape circle = new Circle(5);

		System.out.println("Rectangle");
		System.out.println("----------");
		printArea(rectangle);
		System.out.println("\nCircle");
		System.out.println("------");
		printArea(circle);    
	}

	// prints the area of the given shape
	public void printArea(Shape shape) {
		System.out.println("Area :: " + shape);
	}
}
class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}
	public String toString() {
		return "" + getArea();
	}
}
class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	public String toString() {
		return "" + getArea();
	}
}
interface Shape {
	double getArea();
}