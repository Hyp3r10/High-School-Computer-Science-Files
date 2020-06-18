public class Point {
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        print();
    }
    public void print() {
        System.out.println(x);
        System.out.println(y);
    }
}