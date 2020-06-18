import java.util.*;

public class SportsPhotography
{
    private StarterPacket photoPacket;
    public SportsPhotography()
    {
       Scanner keyboard = new Scanner(System.in);
       int packet=0;
       do
       {
           System.out.println("Sports Photography");
           System.out.println("------------------");
           System.out.println("1. Starter Packet");
           System.out.println("2. Memory Packet");
           System.out.println("3. All Star Packet");    
           System.out.println("4. Champion Packet ");
           System.out.println("5. Collector Packet");
           System.out.println("");
           System.out.print("Select packet -->");
           packet = keyboard.nextInt();
           if(packet == 1)
           {
              photoPacket = new StarterPacket();
           }
           if(packet == 2)
           {
              photoPacket = new MemoryPacket();
           }
           if(packet == 3)
           {
              photoPacket = new AllStarPacket();
           }
           if(packet == 4)
           {
              photoPacket = new ChampionPacket();
           }
           if(packet == 5)
           {
              photoPacket = new CollectorPacket();
           }
           
           System.out.println();
           System.out.println("Picture Packet");
           System.out.println("============");
           System.out.println(photoPacket);
           System.out.println();
           System.out.println();     
       }
       while(true);
    }
    public static void main(String[] args)
    {
        SportsPhotography app = new SportsPhotography();
    }
}