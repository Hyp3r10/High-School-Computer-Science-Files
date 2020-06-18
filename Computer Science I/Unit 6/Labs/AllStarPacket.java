public class AllStarPacket extends StarterPacket
{
    protected int photoMagazineCover;
    protected int photoTradingCards;
    public AllStarPacket()
    {
        photoMagazineCover = 1;
        photoTradingCards = 16;
    }
    public String getPacketName()
    {
        return "AllStar Packet";
    }
    public String toString()
    {
        return super.toString() + "\nMagazine Cover = " + photoMagazineCover + 
                                  "\nTrading Cards  = " + photoTradingCards;
    }
}