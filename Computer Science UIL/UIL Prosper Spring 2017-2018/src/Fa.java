/**
 * @author MatthewSheldon
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Fa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int numElements = scan.nextInt();
			int[] numbers = new int[numElements];
			for(int i = 0; i < numElements; i++) {
				numbers[i] = scan.nextInt();
			}
			BalancingPoint balancingPoint = new BalancingPoint(numbers);
			System.out.println(balancingPoint.getBestFulcrum());
		}
	}
}
class BalancingPoint {
	public int[] numbers; 
	public ArrayList<Fulcrum> fulcrums;
	public BalancingPoint(int[] numbers) {
		this.numbers = numbers;
		this.fulcrums = new ArrayList<Fulcrum>();
		getFulcrums();
	}
	public void getFulcrums() {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					int before = 0;
					int after = 0;
					for(int l = 0; l < i; l++) {
						before += numbers[l];
					}
					for(int r = i+1; r < numbers.length; r++) {
						after += numbers[r];
					}
					fulcrums.add(new Fulcrum(before, after, i));
				} 
				else {
					int before = 0;
					int after = 0;
					for(int l = 0; l <= i; l++) {
						before += numbers[l];
					}
					for(int r = i+1; r < numbers.length; r++) {
						after += numbers[r];
					}
					fulcrums.add(new Fulcrum(before, after, i, i+1));
				}
			}
		}
	}
	public String getBestFulcrum() {
		Collections.sort(fulcrums);
		return fulcrums.get(0).toString();
	}
}
class Fulcrum implements Comparable<Fulcrum> {
	public int before;
	public int after;
	public int pointOne;
	public int pointTwo;
	public boolean isSplit;
	public int difference;
	public Fulcrum(int before, int after, int point) {
		this.before = before;
		this.after = after;
		this.pointOne = point;
		this.isSplit = false;
		this.difference = Math.abs(this.before - this.after);
	}
	public Fulcrum(int before, int after, int pointOne, int pointTwo) {
		this.before = before;
		this.after = after;
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.isSplit = true;
		this.difference = Math.abs(this.before - this.after);
	}
	public int compareTo(Fulcrum other) {
		return Integer.compare(this.difference, other.difference);
	}
	public String toString() {
		if(isSplit) {
			return (before + " " + pointOne + "^" + pointTwo + " " + after);
		}
		else {
			return (before + " ^" + pointOne + " " + after);
		}
	}
}