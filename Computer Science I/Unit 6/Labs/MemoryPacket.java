public class MemoryPacket extends StarterPacket
{
    protected int photo5x7;
    protected int photoWallets;
    public MemoryPacket()
    {
        photo5x7 = 2;
        photoWallets = 8;
    }
    public String getPacketName()
    {
        return "Memory Packet";
    }
    public String toString()
    {
        return super.toString() + "\n5 x 7 = " + photo5x7 + 
                                  "\nWallets = " + photoWallets;
    }
}