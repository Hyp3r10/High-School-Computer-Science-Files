public class Selection102
{
    public static void main (String[] args)
    {
        int e = 7, f = 3;
        
        if(e > 5)
        {
            System.out.println("hello");
            if(e >= 10) // nested if
            {
                System.out.println("howdy");
            }
        }
        
        if(f >= 3)
            System.out.println("Goodbye");
    }
}