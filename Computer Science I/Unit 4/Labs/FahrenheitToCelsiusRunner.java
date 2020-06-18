import java.util.Scanner;

public class FahrenheitToCelsiusRunner
{
    public static void main (String argss[])
    {
        Scanner bang = new Scanner (System.in);
        FahrenheitToCelsius octothorp = new FahrenheitToCelsius();
        
        System.out.print("Fahrenheit :: ");
        double fahrenheit = bang.nextDouble();
        
        // Void Method :: 
        octothorp.fToCV(fahrenheit);
        
        // Return Method :: 
        System.out.println("\nReturn Method :: ");
        System.out.println(fahrenheit + " degrees Fahrenheit == " + octothorp.fToCR(fahrenheit) + " degrees Celsius");
    }
}