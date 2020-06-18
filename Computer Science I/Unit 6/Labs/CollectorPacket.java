public class CollectorPacket extends ChampionPacket
{
    protected int photoWallets;
    public CollectorPacket()
    {
        photoWallets = 8;
    }
    public String getPackageName()
    {
        return "Collector Packet";
    }
    public String toString()
    {
        return super.toString() + "\nWallets = " + photoWallets;
    }
}