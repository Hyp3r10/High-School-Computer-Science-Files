import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class StuckInARut {
	static class Square implements Comparable<Square> {
		public int x, y;
		public boolean eaten;
		public Square(int x, int y) {
			this.x = x;
			this.y = y;
			this.eaten = false;
		}
		public void eat() {
			this.eaten = true;
		}
		public boolean canMove() {
			return this.eaten;
		}
		public int compareTo(Square other) {
			if(this.x == other.x && this.y == other.y) {
				return 0;
			}
			int compX = Integer.compare(this.x, other.x);
			if(compX == 0) {
				return Integer.compare(this.y, other.y);
			}
			return compX;
		}
		public String toString() {
			return "" + this.x + " " + this.y;
		}
	}
	static class Cow {
		public int x, y, index;
		public boolean north;
		public int numEaten;
		public Cow(int x, int y, boolean north, int index) {
			this.x = x;
			this.y = y;
			this.north = north;
			this.index = index;
		}
		public void move() {
			int trash = north ? this.y++ : this.x++;
		}
		public void eat() {
			this.numEaten++;
		}
		public String getNumEaten() {
			if(numEaten == 50000  || x == Math.pow(10, 9) - 1 || y == Math.pow(10, 9) - 1) {
				return "Infinity";
			}
			return "" + (1+this.numEaten);
		}
		public boolean canMove() {
			int x = north ? this.x : this.x+1;
			int y = north ? this.y+1 : this.y;
			return !eaten.contains(new Square(x,y)) && (this.x != Math.pow(10, 9) - 1) && (y != Math.pow(10, 9) - 1) && this.numEaten < 50000 ;
		}
	}
	public static Cow[] cows;
	public static TreeSet<Square> eaten;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCows = scan.nextInt(); scan.nextLine();
		eaten = new TreeSet<Square>();
		cows = new Cow[numCows];
		for(int i = 0; i < numCows; i++) {
			String[] line = scan.nextLine().split(" ");
			cows[i] = new Cow(Integer.parseInt(line[1]), Integer.parseInt(line[2]), line[0].equals("N"), i);
		}
		solve();
		for(Cow temp : cows) {
			System.out.println(temp.getNumEaten());
		}
	}
	public static void solve() {
		Queue<Square> toUpdate = new LinkedList<Square>();
		while(true) {
			// For each movable cow, attempt to move them
			for(int i = 0; i < cows.length; i++) {
				Cow curr = cows[i];
				if(curr.canMove()) {
					// If facing north and can a north spot exits
					if(curr.north && inBounds(curr.x, curr.y+1)) {
						// If the spot hasn't already been eaten
						if(!eaten.contains(new Square(curr.x,curr.y+1))) {
							curr.eat();
							toUpdate.add(new Square(curr.x,curr.y+1));
						}
						curr.move();
					}
					// If we are facing east and an east spot exists
					else if(!curr.north && inBounds(curr.x+1, curr.y)) {
						// If the spot hasn't already been eaten
						if(!eaten.contains(new Square(curr.x+1,curr.y))) {
							curr.eat();
							toUpdate.add(new Square(curr.x+1,curr.y));
						}
						curr.move();
					}
				}
				cows[i] = curr;
			}
			// update the squares that have now been visited
			while(!toUpdate.isEmpty()) {
				eaten.add(toUpdate.poll());
			}
			// Determine if we are done
			boolean done = true;
			for(int i = 0; i < cows.length; i++) {
				if(cows[i].canMove()) {
					done = false;
				}
			}
			if(done) {
				return;
			}
		}
	}
	public static boolean inBounds(int x, int y) {
		return x >= 0 && x < (int) Math.pow(10, 9) && y >= 0 && y < (int) Math.pow(10, 9);
	}
}
