import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bottles {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("bottles.dat"));
		int numTimes = scan.nextInt(); scan.nextLine();
		while(numTimes-->0) {
			Scanner line = new Scanner(scan.nextLine());
			ArrayList<Integer> volumes = new ArrayList<Integer>();
			line.nextInt();
			while(line.hasNextInt()) {
				volumes.add(line.nextInt());
			}
			System.out.println(bottles(volumes, 0, new int[volumes.size()]));
		}
	}
	/**
	 * Determines the maximum volume obtainable from drinking
	 * bottles where no two directly adjacent bottles can be drunk
	 * storing previous maximums in a dp array.
	 * @param volumes	The list of different volumes of each bottle
	 * @param index		The index of the bottle we are currently looking at
	 * @param dp		The dp array storing previous results
	 * @return			The maximum volume following constraints
	 */
	public static int bottles(ArrayList<Integer> volumes, int index, int[] dp) {
		if(index >= volumes.size()) {
			return dp[volumes.size()-1];
		}
		if(index == 0) {
			dp[index] = volumes.get(index);
			return bottles(volumes, index+1, dp);
		}
		else if(index == 1) {
			dp[index] = Math.max(dp[0], volumes.get(1));
			return bottles(volumes, index+1, dp);
		}
		else {
			dp[index] = Math.max(dp[index-2] + volumes.get(index), dp[index-1]);
			return bottles(volumes, index+1, dp);
		}
	}
}

