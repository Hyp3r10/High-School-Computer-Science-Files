import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem30B {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr30b.txt"));
		int numTimes = file.nextInt();
		file.nextLine();

		for(int i = 0; i < numTimes; i++) {
			String[] split = file.nextLine().split("-");
			int[] sums = new int[3];
			for(int j = 0; j < split.length; j++) {
				for(int k = 0; k < split[j].length(); k++) {
					sums[j] += Integer.parseInt(split[j].substring(k, k+1));
				}
				System.out.println("Sum " + (j+1) + " :: " + sums[j]);
			}
			System.out.println();
		}
	}
}
