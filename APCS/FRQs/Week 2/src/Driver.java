public class Driver
{
	public static void main(String[] args)
	{
		boolean [][] map = {{false, true, true, false, true, false, true, false, false},
		                    {false, true, false, false, false, false, true, false, false},
		                    {false, true, false, true, true, false, false, true, true},
		                    {true, false, true, false, true, true, false, false, false},
		                    {false, true, false, false, true, false, false, true, false},
		                    {true, false, false, true, false, true, false, false, false}};
		                    
		TreasureMap treasure = new TreasureMap(map);
		
		
		// test hasTreasure method
		System.out.println("hasTreasure(3,4) --> " + treasure.hasTreasure(3,4));
		System.out.println("hasTreasure(1,7) --> " + treasure.hasTreasure(1,7));
		System.out.println("hasTreasure(7,2) --> " + treasure.hasTreasure(7,2));
		System.out.println();
		                    
		// test numAdjacent method
		System.out.println("numAdjacent(3,3) --> " + treasure.numAdjacent(3,3));
		System.out.println("numAdjacent(2,4) --> " + treasure.numAdjacent(2,4));
		System.out.println("numAdjacent(4,7) --> " + treasure.numAdjacent(4,7));
		System.out.println();	
		
	}
}