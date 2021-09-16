import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DoYouKnowYourABC {
	static class ABC {
		public long A, B, C;
		public ABC(long a, long b, long c) {
			this.A = a;
			this.B = b;
			this.C = c;
		}
		public ArrayList<Long> getGame() {
			ArrayList<Long> list = new ArrayList<Long>();
			list.add(A);
			list.add(B);
			list.add(C);
			list.add(A+B);
			list.add(B+C);
			list.add(C+A);
			list.add(A+B+C);
			Collections.sort(list);
			return list;
		}
		public boolean equals(ArrayList<Long> correct) {
			ArrayList<Long> thisList = getGame();
			for(int i = 0; i < thisList.size(); i++) {
				if(correct.get(i) != thisList.get(i)) {
					return false;
				}
			}
			return true;
		} 
		public String toString() { 	
			return "" + A + " " + B + " " + C;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		ArrayList<Long> correct = new ArrayList<Long>();
		for(int i = 0; i < line.length; i++) {
			correct.add(Long.parseLong(line[i]));
		}
		System.out.println((correct));
		System.out.println(getCorrect(correct));
	}
	public static ABC getCorrect(ArrayList<Long> correct) {
		ABC curr = new ABC(0,0,0);
		for(int a = 0; a < 4; a++) {
			for(int b = a+1; b < 5; b++) {
				for(int c = b+1; c < 6; c++) {
					curr = new ABC(correct.get(a), correct.get(b), correct.get(c));
					if(curr.equals(correct)) {
						return curr;
					}
				}
			}
		}
		return new ABC(correct.get(0), correct.get(1), correct.get(2));
	}
	public static ArrayList<Integer> copy(ArrayList<Integer> original) {
		ArrayList<Integer> copy = new ArrayList<Integer>();
		for(Integer temp : original) {
			copy.add(temp);
		}
		return copy;
	}
} 
