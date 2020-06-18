import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Temp {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt(); scan.nextLine();
		String[] line = scan.nextLine().split("");
		boolean[] cows = new boolean[size];
		int i = 0;
		for(String cow : line) {
			if(cow.equals("1")) {
				cows[i] = true;
			}
			i++;
		}


		int index1 = -1;
		ArrayList<Distance> list = new ArrayList<Distance>();
		for(i = 0; i < size; i++) {
			if(cows[i]) {
				list.add(new Distance(index1, i));
				index1 = i;
			}
		}
		System.out.println(list);

		Distance largestDistance1 = null, largestDistance2 = null;
		Collections.sort(list);
		largestDistance1 = list.get(0);
		largestDistance2 = list.get(1);
		cows[largestDistance1.getNewCord()] = true;
		cows[largestDistance2.getNewCord()] = true;

		index1 = -1;
		ArrayList<Distance> newList = new ArrayList<Distance>();
		for(i = 0; i < size; i++) {
			if(cows[i]) {
				newList.add(new Distance(index1, i));
				index1 = i;
			}
		}

		Collections.sort(newList);
		System.out.print(newList.get(0).distance);
	}
}
/*class Distance implements Comparable<Distance> {
	public int first;
	public int second; 
	public int distance;
	public Distance(int first, int second) {
		this.first = first;
		this.second = second;
		this.distance = calculateDistance();
	}
	public int calculateDistance() {
		return (int) Math.abs(second - first);
	}
	public int getNewCord() {
		return first + distance/2;
	}
	@Override
	public int compareTo(Distance other) {
		if(this.distance > other.distance) {
			return -1;
		}
		else if(this.distance < other.distance){
			return 1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "first: " + first + " second: " + second + " distance: " + distance + "\n";
	}
}
*/