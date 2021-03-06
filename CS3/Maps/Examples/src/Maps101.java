import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class Maps101 {
	public static void main(String[] args) {
		Map<Integer, String> team1 = new TreeMap<Integer, String>();
		team1.put(1, "Raymond");
		team1.put(11, "Michael");
		team1.put(8, "David");
		team1.put(3, "Numair");
		team1.put(5, "Chloe");
		System.out.println("Team 1: " + team1);

		System.out.println("\n");

		System.out.println("Element at index 1: " + team1.get(1));
		System.out.println("Element at index 5: " + team1.get(5));

		// Maps do not throw index out of bounds exceptions
		System.out.println("Element at index 2: " + team1.get(2));
		System.out.println("Element at index 99: " + team1.get(99));

		System.out.println("\n");

		// put() returns element val that was at the index previously
		System.out.println(team1.put(2, "Rushi"));
		System.out.println("Team 1: " + team1);
		System.out.println(team1.put(3, "Nat-The"));
		System.out.println("Team 1: " + team1);

		System.out.println("\n********************************\n");

		Map<Integer, String> team2 = new HashMap<Integer, String>();
		team2.put(1, "Raymond");
		team2.put(11, "Michael");
		team2.put(8, "David");
		team2.put(3, "Numair");
		team2.put(5, "Chloe");
		System.out.println("Team 1: " + team2);

		System.out.println("\n");

		System.out.println("Element at index 1: " + team2.get(1));
		System.out.println("Element at index 5: " + team2.get(5));

		// Maps do not throw index out of bounds exceptions
		System.out.println("Element at index 2: " + team2.get(2));
		System.out.println("Element at index 99: " + team2.get(99));

		System.out.println("\n");

		// put() returns element val that was at the index previously
		System.out.println(team2.put(2, "Rushi"));
		System.out.println("Team 1: " + team2);
		System.out.println(team2.put(3, "Nat-The"));
		System.out.println("Team 1: " + team2);
	}
}
