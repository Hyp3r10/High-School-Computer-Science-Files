public class DataTypes105
{
    public static void main(String[] args)
    {
        char c1 = 'A';
        char c2 = 'B';
        char c3 = 67;
        
        System.out.println("The three characters are: " + c1 + c2 + c3);
        
        c1 = c2;
        System.out.println("The three characters are: " + c1 + c2 + c3);
        
        c1 = c2 = c3;
        System.out.println("The three characters are: " + c1 + c2 + c3);
    }
}