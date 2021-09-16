/*
ID: punchwo1
LANG: JAVA
PROG: milk2
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class milk2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("milk2.in"));
		PrintWriter out = new PrintWriter(new File("milk2.out"));
		
		
		int numFarmers = scan.nextInt();
		Interval[] intervals = new Interval[numFarmers];
		for(int i = 0; i < numFarmers; i++) {
			intervals[i] = new Interval(scan.nextInt(), scan.nextInt());
			
		}
		Arrays.sort(intervals);
		int low = intervals[0].low;
		int high = intervals[0].high;
		int maxInterval = high-low;
		int maxGap = 0;
		for(int i = 1; i < intervals.length; i++) {
			Interval curr = intervals[i];
			if(curr.low <= high) {
				high = Math.max(curr.high, high);
			}
			else {
				maxInterval = Math.max(high-low, maxInterval);
				maxGap = Math.max(curr.low-high, maxGap);
				low = curr.low;
				high = curr.high;
				
			}
		}
		out.println(maxInterval + " " + maxGap);
		out.close();
	}
}
class Interval implements Comparable<Interval> {
    public int low;
    public int high;
    public Interval(int low, int high) {
        this.low = low;
        this.high = high;
    }
    public int compareTo(Interval other) {
    	return this.low - other.low;
    }
}
