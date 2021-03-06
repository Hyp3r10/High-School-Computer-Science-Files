/*
ID: punchwo1
LANG: JAVA
TASK: beads
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class beads {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("beads.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")))) {
				int N = scan.nextInt(); scan.nextLine();
				String necklace = scan.nextLine();
				necklace += necklace;
				int max = 0; 
				for(int i = 0; i < N; i++) {
					int current = countBeads(necklace, i);
					if(current > max) {
						if(current >= N) {
							max = N;
						}
						else {
							max = current;
						}
					}
				}
				out.println(max);
			}
		}
	}
	public static int countBeads(String necklace, int i) {
		char[] beadNecklace = necklace.toCharArray();
		int count = 0;
		// go ahead and add all wild characters prior to a non-wild bead to the count, increase the starting position of i
		if(beadNecklace[i] == 'w') {
			for(int j = i; j < beadNecklace.length; j++) {
				if(beadNecklace[j] != 'w') {
					break;
				}
				else {
					count++;
					i++;
				}
			}
		}
		// if we are in the size of the necklace
		if(i < beadNecklace.length) {
			// if the first character after any wild beads is a red bead
			if(beadNecklace[i] == 'r') {
				// search for the first occurrence of something other than r or w
				for(int j = i; j < beadNecklace.length; j++) {
					if(beadNecklace[j] == 'b') {
						break;
					}
					else {
						count++;
						i++;
					}
				}
				// search for the first occurrence of something other than b or w
				for(int j = i; j < beadNecklace.length; j++) {
					if(beadNecklace[j] == 'r') {
						break;
					}
					else {
						count++;
					}
				}
			}
			// if the first character after any wild beads is a blue bead
			else if(beadNecklace[i] == 'b') {
				// search for the first occurrence of something other than b or w
				for(int j = i; j < beadNecklace.length; j++) {
					if(beadNecklace[j] == 'r') {
						break;
					}
					else {
						count++;
						i++;
					}
				}
				// search for the first occurrence of something other than r or w
				for(int j = i; j < beadNecklace.length; j++) {
					if(beadNecklace[j] == 'b') {
						break;
					}
					else {
						count++;
					}
				}
			}
			// do not consider any wild beads (because they would already have been added per the first loop)
		}
		return count;
	}
}
