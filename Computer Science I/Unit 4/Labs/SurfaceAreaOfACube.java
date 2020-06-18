public class SurfaceAreaOfACube
{
    public void surfaceAreaV (int operand1)
    {
        int surfaceArea = 6 * (int)(Math.pow(operand1,2));
        System.out.println("\nVoid Method :: ");
        System.out.println("The surface area is :: " + surfaceArea);
    }
    public int surfaceAreaR(int operand1)
    {
        int surfaceArea = 6 * (int)(Math.pow(operand1,2));
        System.out.println("\nReturn Method :: ");
        return surfaceArea;
    }
}