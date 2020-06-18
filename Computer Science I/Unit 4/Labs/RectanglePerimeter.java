public class RectanglePerimeter
{
    public void perimeterV(int length, int width)
    {
        int perimeter = (2 * length) + (2 * width);
        System.out.println("\nVoid Method :: ");
        System.out.println("The perimeter is :: " + perimeter);
    }
    public int perimeterR(int pikachu, int squirtle)
    {
        int perimeter = 2 * pikachu + 2 * squirtle;
        System.out.println("\nReturn Method :: ");
        return perimeter;
    }
}