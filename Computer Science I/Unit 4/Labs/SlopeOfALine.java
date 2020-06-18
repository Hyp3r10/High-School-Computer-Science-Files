public class SlopeOfALine
{
    public void slopeV(int x1, int y1, int x2, int y2)
    {
        double y = y2 - y1;
        double x = x2 - x1;
        double m = y / x;
        System.out.println("\nVoid Method :: ");
        System.out.println("The slope is :: " + m);
    }
    public double slopeR(int x1, int y1, int x2, int y2)
    {
        double y = y2 - y1;
        double x = x2 - x1;
        double m = y / x;
        return m;
    }
}