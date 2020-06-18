import java.util.Scanner;

public class Table
{
    public static void main (String args[])
    {
        Scanner bang = new Scanner(System.in);
        
        System.out.print("Enter number of rows --> ");
        int selection = bang.nextInt();
        int count = 1;
        int n, n10, n100, n1000 = 0;
        System.out.println("  N  10*N   100*N   1000*N");
        System.out.println("----------------------------");
        
        do
        {
            n = count * 1;
            n10 = count * 10;
            n100 = count * 100;
            n1000 = count * 1000;
            
            System.out.println(n + "   " + n10 + "     " + n100 + "     " + n1000);
            count++;
        }while(count <= selection);
    }
}