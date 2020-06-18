public class AreaOfACircle
{
    public void areaCircleV(double operand1)
    {
        double area = (Math.PI)*(Math.pow(operand1,2));
        System.out.println("\nVoid Method :: ");
        System.out.println("The area is :: " + area);
    }
    public double areaCircleR(double operand1)
    {
        double area = (Math.PI)*(Math.pow(operand1,2));
        System.out.println("\nReturn Method :: ");
        return area;
    }
}