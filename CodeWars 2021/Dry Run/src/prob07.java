import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class prob07 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob07/prob07-1-in.txt")); // Used for testing
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int numTimes = scan.nextInt();
		int lonely = 0;
		for(int i = 0; i < numTimes; i++) {
			String name = scan.next();
			lonely += name.equals("Lonely") ? 1 : 0;
			int curr = scan.nextInt();
			int tot = 1;
			if(map.containsKey(curr)) {
				tot += map.get(curr);
			}
			map.put(curr, tot);
		}
		int duplicate = 0;
		for(Integer key : map.keySet()) {
			if(map.get(key) > 1 && key != 0) {
				duplicate++;
			}
		}
		System.out.println("Lonely Cubes: " + lonely);
		System.out.println("Duplicate Cube Assignments: " + duplicate);
		System.out.println("Test Subjects without Cubes: " + map.get(0));
		scan.close();
	}
}
