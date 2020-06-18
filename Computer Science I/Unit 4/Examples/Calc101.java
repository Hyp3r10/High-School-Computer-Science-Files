public class Calc101
{
    // void methods
    public void addV(double num1, double num2)// this is the method heading, it contains "formal parameters", no semicolins here.
    {
        double sum = num1 + num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }    
    public void subV(double operand1, double operand2)
    /**
     * Data types in formal paramaters need to mathc the data types of the 
     * actual paramaters in the method call, but the varriable names
     * can be different.
     */
    {
        double difference = operand1 - operand2;
        
        System.out.println(operand1 + " - " + operand2 + " = " + difference);
    }
    public void mulV(double operand1, double operand2)
    {
        double product = operand1 * operand2;
        
        System.out.println(operand1 + " * " + operand2 + " = " + product);
    } 
    public void divV(double operand1, double operand2)
    {
        double quotient = operand1 / operand2;
        
        System.out.println(operand1 + " / " + operand2 + " = " + quotient);
    } 
    //return methods
    public double addR(double num1, double num2)
    /**
     * the "double" before the method name is the data type
     * of what is being returned
     */
    {
        double sum = num1 + num2;
        return sum;
    }
    public double subR(double operand1, double operand2)
    {
        double difference = operand1 - operand2;
        return difference; // this line here marks the end of the method operation
        /**
         * Anything after the return statement generated an "unreachable statement"
         * compile error.
         */
        // System.out.println("Well, hello there!");
    }
    public double mulR(double operand1, double operand2)
    {
        double product = operand1 * operand2;
        return product;
    }
    public double divR(double operand1, double operand2)
    {
        double quotient = operand1 / operand2;
        return quotient;
    }
}