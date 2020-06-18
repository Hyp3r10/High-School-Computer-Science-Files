public class Sum
{
    public void addV(double num1, double num2)
    {
        double sum = num1 + num2;
        System.out.println("\nVoid Method :: ");
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
    public double addR(double num1, double num2)
    {
        double sum = num1 + num2;
        System.out.println("\nReturn Method :: ");
        return sum;
    }
}