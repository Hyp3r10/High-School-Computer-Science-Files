public class APLine {
	private int a, b, c;
	private double slope;
	public APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getSlope() {
		slope = (double)(-a)/b;
		return slope;
	}
	public boolean isOnLine(int x, int y) {
		return ((a)*(x)) + ((b)*(y)) + (c) == 0;
	}
}