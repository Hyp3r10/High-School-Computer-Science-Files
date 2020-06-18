public class TypeCasting101
{
    public static void main (String[] args)
    {
        int nr1 = 1; 
        int nr2 = 3; 
        int nr3 = 6;
        
        
        double mean = 0;
        
        mean = (nr1 + nr2 + nr3)/3; // The int data type will throw off the accuracy of the result.
        System.out.println("The mean equals: " + mean + "\n");
        
        mean = 0; //reset mean
        System.out.println("The mean has been reset to " + mean);
        
        mean = (nr1 + nr2 + nr3)/3.0; // By using a double it converts the whole calculation to double.
        System.out.println("The mean equals: " + mean + "\n");
        
        mean = 0; //reset mean
        System.out.println("The mean has been reset to " + mean);
        
        mean = (nr1 + nr2 + nr3)/ (double) 3; // Type casting 3 from an int to a double.
        System.out.println("The mean equals: " + mean + "\n");
        
        
    }
}