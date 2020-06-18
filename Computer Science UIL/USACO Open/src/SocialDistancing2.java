import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SocialDistancing2 {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("socdist2.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("socdist2.out")))) {
				int size = scan.nextInt(); scan.nextLine();
				ArrayList<Cow> list = new ArrayList<Cow>();
				int i = 0;
				while(scan.hasNextLine()) {
					String[] line = scan.nextLine().split(" ");
					list.add(new Cow(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
				}
				
				Collections.sort(list);
				System.out.println(list);
				
 			}
		}
	}
}
class Cow implements Comparable<Cow> {
	public int position;
	public boolean infected; 
	public Cow(int pos, int health) {
		this.position = pos;
		this.infected = health == 1;
	}
	@Override
	public int compareTo(Cow other) {
		if(this.position < other.position) {
			return -1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "" + this.position + " " + this.infected;
	}
}