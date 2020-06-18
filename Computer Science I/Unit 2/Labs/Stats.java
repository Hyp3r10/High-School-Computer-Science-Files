
/**
 * Holds all of the statistics of the player and has getters and setters for the statistics.
 **/
public class Stats
{
	//holds all of the statistics of the player
	private static boolean[] stats;
	
	public Stats()
	{
		stats=new boolean[12];
	}
	
	/**
	 * Return a boolean value indicating the state of the players statistic at the specified index of the array "stats". 
	 * 
	 * @param index		the index of the array "stats" that should be accessed
	 * @return 			the boolean value corresponding to the state of the statistic at "index" of "stats"
	 */
	public static boolean getStat(int index)
	{
		return stats[index];
	}
	
	/**
	 * Sets a boolean value in the array "stats" at the specified index to the opposite of itself. 
	 * 
	 * @param index		the index of the array that should be accessed
	 */
	public static void setStat(int index, boolean changeTo)
	{
		stats[index]=changeTo;
	}
	
	/* A table of what each index of "stats" represents
	 * 
	 * index    variable
	 * 
	 * 0        if the player has the pendant mark and has taken the pendant from House
	 * 1		if the player is by the chest from House
	 * 2		if the player is by the bed from House
	 * 3		if the player is by the sacks from Shack
	 * 4		if the player is by the scraps from Shack
	 * 5		if the player has already scavenged through the scraps from Shack
	 * 6		if the player has already grabbed the bread and/or heard the bread memory from Shack
	 * 7		if the player has already grabbed the carrot and/or heard the carrot memory from Shack
	 * 8		if the player has grabbed the sword from Cave
	 * 9		if the player is by the rock from DeepCave
	 * 10		if the player is by the waterfall from DeepCave
	 * 11		if the player has opened the pot with the wrench from DeepCave
	 * 12		if the player has filled the pot with water from DeepCave
	 * 13		if the player has used the pendant to heat up the pot from DeepCave
	 * 14		if the player has put the carrot into the pot
	 * 15		if the player has put the bread into the pot
	 */
}
