public class FahrenheitToCelsius
{
    public void fToCV(double operand1)
    {
        double sub = operand1 - 32.0;
        double div = 5.0 / 9.0;
        double celsius = sub * div;
        System.out.println("\nVoid Method :: ");
        System.out.println(operand1 + " degrees Fahrenheit == " + celsius + " degrees Celsius");
    }
    public double fToCR(double operand1)
    {
        double sub = operand1 - 32.0;
        double div = 5.0 / 9.0;
        double celsius = sub * div;
        return celsius;
    }
}