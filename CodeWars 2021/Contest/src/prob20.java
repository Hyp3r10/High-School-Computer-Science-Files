import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prob20 {
	public static void main(String[] args) throws IOException {
		//Scanner scan = new Scanner(System.in); // Used for submission
		Scanner scan = new Scanner(new File("prob20/prob20-1-in.txt")); // Used for testing
		int numTowers = scan.nextInt();
		ArrayList<Tower> towers = new ArrayList<Tower>();
		for(int i = 0; i < numTowers; i++) {
			String height = scan.next();
			String ID = scan.next();
			towers.add(new Tower(ID, height, numTowers));
		}
		Collections.sort(towers);
		for(Tower t : towers) {
			System.out.print(t.ID);
		}
		scan.close();
	}
}
class Tower implements Comparable<Tower> {
	String ID;
	String height;
	int numHeight;
	int numTowers;
	public Tower(String ID, String height, int numTowers) {
		this.ID = ID;
		this.height = height;
		this.numHeight = Integer.parseInt(height);
		this.numTowers = numTowers;
	}
	public int compareTo(Tower other) {
		int comp = Integer.compare(this.numHeight, other.numHeight);
		if(comp == 0) {
			return this.ID.compareTo(other.ID);
		}
		return comp;
	}
}