import java.util.*;

public class WatchTV
{
    public static void main(String[] args)
    {
        Television tv = new Television();
        Scanner keyboard = new Scanner(System.in);
        int sel = 0;
        
        System.out.println("**********************");
        System.out.println("*   My Television    *");
        System.out.println("**********************");
        
        do
        {
           System.out.println();
           System.out.println("   Current Settings");
           System.out.println("=====================");
           System.out.println(" Channel = " + tv.getChannel());
           System.out.println(" Volume  = " + tv.getVolume());
           System.out.println("=====================");
           System.out.println("1. Increase Channel");
           System.out.println("2. Decrease Channel");
           System.out.println("3. Select Channel");
           System.out.println("4. Increase Volume");
           System.out.println("5. Decrease Volume");
           System.out.println("6. Turn TV off");
           System.out.println();
           System.out.print("Make Selection -->");
           sel = keyboard.nextInt();
           
            if(sel == 1)
            {
                tv.increaseChannel();
            }
            if(sel == 2)
            {
                tv.decreaseChannel();
            }
            if(sel == 3)
            {
                System.out.println();
                System.out.print("Enter channel -->");
                int channel = keyboard.nextInt();
                tv.selectChannel(channel);
            }
            if(sel == 4)
            {
                tv.increaseVolume();
            }
            if(sel == 5)
            {
                tv.decreaseVolume();
            }   
        }
        while(sel != 6);
        
        System.out.println();
        System.out.println("TV is off, thanks for watching!");
        System.out.println();
        System.out.println();
    }
}