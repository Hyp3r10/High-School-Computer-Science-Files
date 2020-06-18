public class WhilePractice
{
    public static void main (String args[])
    {
        /**
         * 1. Start (Loop Control Variable)
         * 2. Boolean Conditional (The loop runs while it is true and ends when it is false.)
         * 3. Increment (Optional, what the loop goes up/down by)
         */
        
        int num = 1;
        
        while(num <= 25)
        {
            System.out.print(num + " ");
            num++;
        }
        System.out.println("\n");
        num = 50;
        while(num <= 70)
        {
            System.out.print(num + " ");
            num++;
        }
        System.out.println("\n");
        num = 0;
        while(num <= 100)
        {
            System.out.print(num + " ");
            num += 5;
        }
        System.out.println("\n");
        num = 20;
        while(num >= 1)
        {
            System.out.print(num + " ");
            num--;
        }
        System.out.println("\n");
        num = 0;
        while(num < 15)
        {
            System.out.println("computer");
            num++;
        }
    }
}