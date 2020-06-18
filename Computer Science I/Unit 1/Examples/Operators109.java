public class Operators109
{
    public static void main (String[] args)
    {
        double a = 1000;
        double b = 100;
        double c = 2.5;
        double result = 0;
        
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println();
        
        result = a + b * c;
        System.out.println("a + b * c = " + result);
        
        result = (a + b) * c;
        System.out.println("(a + b) * c = " + result);
        
        result = a / (b * c);
        System.out.println("a / ( b * c ) = " + result);
        
        result = (a * b) / c;
        System.out.println("(a * b) / c = " + result);
    }
}