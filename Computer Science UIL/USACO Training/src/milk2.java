/*
ID: punchwo1
LANG: JAVA
TASK: milk2
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class milk2 {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("milk2.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")))) {
				int numTimes = scan.nextInt();
				ArrayList<TimeInterval> orriginalTimes = new ArrayList<TimeInterval>();
				for(int index = 0; index < numTimes; index++) {
					orriginalTimes.add(new TimeInterval(scan.nextInt(), scan.nextInt()));
				}
				// finds all of the different overlapping times
				
				
				ArrayList<TimeInterval> overlappingTimes = (ArrayList<TimeInterval>) orriginalTimes.clone();
				ArrayList<TimeInterval> nonOverlappingTimes = new ArrayList<TimeInterval>();
				overlappingTimes.add(orriginalTimes.get(0));
				for(int i = 0; i < orriginalTimes.size()-1; i++) {
					for(int j = i+1; j < orriginalTimes.size(); j++) {
						if(overlappingTimes.get(i).overlaps(orriginalTimes.get(j))) {
							overlappingTimes.add(overlappingTimes.get(i).combineOverlappingTimeInterval(orriginalTimes.get(j)));
						}
					}
				}
				// finds all of the different nonoverlapping times
				for(int i = 0; i < overlappingTimes.size()-1; i++) {
					if(!overlappingTimes.get(i).overlaps(overlappingTimes.get(i+1))) {
						nonOverlappingTimes.add(overlappingTimes.get(i).combineNonoverlappingTimeInterval(overlappingTimes.get(i+1)));
					}
				}
				
				Collections.sort(overlappingTimes);
				if(nonOverlappingTimes.size() > 0) {
					Collections.sort(nonOverlappingTimes);
					out.println(overlappingTimes.get(overlappingTimes.size()-1).totalTime + " " + nonOverlappingTimes.get(nonOverlappingTimes.size()-1).totalTime);
				}
				else {
					out.println(overlappingTimes.get(overlappingTimes.size()-1).totalTime + " " + 0);
				}
				
			}
		}
	}
}
class TimeInterval implements Comparable<TimeInterval> {
	public int startTime;
	public int endTime;
	public int totalTime;
	public TimeInterval(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.totalTime = endTime - startTime;
	}
	public boolean overlaps(TimeInterval other) {
		return other.startTime <= this.endTime;
	}
	public TimeInterval combineOverlappingTimeInterval(TimeInterval other) {
		TimeInterval newTime = new TimeInterval(this.startTime, other.endTime);
		return newTime;
	}public TimeInterval combineNonoverlappingTimeInterval(TimeInterval other) {
		TimeInterval newTime = new TimeInterval(this.endTime, other.startTime);
		return newTime;
	}
	public int compareTo(TimeInterval other) {
		return Integer.compare(this.totalTime, other.totalTime);
	}
	public String toString() {
		return "" + startTime + " " + endTime +  " " + totalTime;  
	}
}
