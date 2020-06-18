public class ChampionPacket extends AllStarPacket
{
	protected int photo5x7;
	public ChampionPacket()
	{
	    photo5x7 = 2;
	}
	public String getPacketName()
	{
	    return "Champion Packet";
	}
	public String toString()
	{
	    return super.toString() + "\n5 x 7 = " + photo5x7;
	}
}