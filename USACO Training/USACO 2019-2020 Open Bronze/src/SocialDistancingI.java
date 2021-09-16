
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SocialDistancingI {
	public static String[] original;
	public static int[] dp;
	public static ArrayList<Cow> cows;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("socdist1.in"));
		PrintWriter out = new PrintWriter(new File("socdist1.out"));
		int size = scan.nextInt(); scan.nextLine();
		original = scan.nextLine().split("");
		
		transformDP(original, size);
		generateCows();
		out.print(determineWhereToPlaceCows());
		out.close();
	}
	public static int determineWhereToPlaceCows() {
		String[] tempOriginal = copy(original);
		int maxD = Integer.MIN_VALUE;
		for(int i = 0; i < cows.size()-1; i++) {
			for(int j = i+1; j < cows.size(); j++) {
				Cow cow1 = cows.get(i);
				Cow cow2 = cows.get(j);
				original = copy(tempOriginal);
				original[cow1.pos] = "1";
				original[cow2.pos] = "1";
				if(Math.abs(cow1.pos - cow2.pos) == 1) {
					continue;
				}
				transformDP(original, original.length);
				System.out.println(Arrays.toString(original));
				System.out.println(Arrays.toString(dp));
				System.out.println(determineHighestD() + "\n\n");
				maxD = Math.max(maxD, determineHighestD());
			}
		}
		return maxD;
	}
	public static boolean inBounds(int i) {
		return i >= 0 && i < original.length;
	}
	public static String[] copy(String[] original) {
		String[] newArr = new String[original.length];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = original[i];
		}
		return newArr;
	}
	public static void transformDP(String[] original, int size) {
		dp = new int[size];
		for(int i = 0; i < original.length; i++) {
			int curr = 0;
			if(original[i].equals("0")) {
				if(i == 0) {
					curr = goRight(i);
				}
				else if(i == original.length-1) {
					curr = goLeft(i);
				}
				else {
					curr = Math.min(goLeft(i), goRight(i));
				}
			}
			else {
				curr = Integer.MIN_VALUE;
			}
			dp[i] = curr;
		}
	}
	public static int determineHighestD() {
		int max = 1;
		int start = 0;
		for(int i = 0; i < dp.length; i++) {
			if(dp[i] != Integer.MIN_VALUE) {
				continue;
			}
			else {
				
				max = Math.max(max, (i-start));
				start = i;
			}
		}
		max = Math.max(max, (dp.length-1-start));
		return max;
	}
	private static int goLeft(int start) {
		int count = 0;
		for(int i = start; i >= 0; i--) {
			if(original[i].equals("1")) {
				return count;
			}
			else {
				count++;
			}
		}
		return count;
	}
	private static int goRight(int start) {
		int count = 0;
		for(int i = start; i < dp.length; i++) {
			if(original[i].equals("1")) {
				return count;
			}
			else {
				count++;
			}
		}
		return count;
	}
	public static void generateCows() {
		cows = new ArrayList<Cow>();
		for(int i = 0; i < dp.length; i++) {
			if(dp[i] >= 2) {
				cows.add(new Cow(i, dp[i]));
			}
		}
	}
}
class Cow implements Comparable<Cow> {
	public int pos;
	public int dist;
	public Cow(int index, int distance) {
		this.pos = index;
		this.dist = distance;
	}
	public int compareTo(Cow other) {
		return Integer.compare(this.dist, other.dist);
	}
	public String toString() {
		return "" + pos + " : " + dist;
	}
}
