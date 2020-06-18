public class DoWhilePractice
{
    public static void main (String args[])
    {
        int lcv = 0;
        
        do
        {
            System.out.print(lcv + " ");
            lcv++;
        }while (lcv <= 20);
        
        System.out.println("\n");
        
        lcv = 1;
        
        do
        {
            System.out.print(lcv + " ");
            lcv++;
        }while (lcv <= 50);
        
        System.out.println("\n");
        
        lcv = 0;
        
        do
        {
            System.out.print(lcv + " ");
            lcv += 10;
        }while (lcv <= 200);
        
        System.out.println("\n");
        
        lcv = 97;
        
        do
        {
            System.out.print((char)lcv + " ");
            lcv++;
        }while (lcv <= 122);
        
        System.out.println("\n");
        
        
    }
}