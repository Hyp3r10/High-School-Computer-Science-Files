public class NumAvg
{
    public void avgV(double num1, double num2)
    {
        double average = (num1 + num2) / 2;
        System.out.println("\nVoid Method :: ");
        System.out.println(num1 + " + " + num2 + " has an average of " + average);
    }
    public double avgR(double num1, double num2)
    {
        double average = (num1 + num2) / 2;
        System.out.println("\nReturn Method :: ");
        return average;
    }
}