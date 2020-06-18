import java.util.PriorityQueue;
import java.util.Scanner;

public class AStarBest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		boolean[][] visited = new boolean[size][size];
		int[][] maze = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				maze[i][j] = scan.nextInt();
			}
		}
		
		int goalR = 0;
		int goalC = 0;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(maze[i][j] == 2) {
					goalR = i;
					goalC = j;
					break;
				}
			}
		}
		
		boolean found = false;
		Position goal = new Position(goalR, goalC);
		PriorityQueue<Position> toSearch = new PriorityQueue<Position>();
		toSearch.add(new Position(0, 0, goal));
		while(!toSearch.isEmpty()) {
			Position currentPosition = toSearch.poll();
			if(currentPosition.r >= 0 && currentPosition.r < visited.length && currentPosition.c >= 0 && currentPosition.c < visited.length && !visited[currentPosition.r][currentPosition.c]) {
				continue;
			}
			else if(currentPosition.r == goalR && currentPosition.c == goalC) {
				found = true;
				break;
			}
		
			visited[currentPosition.r][currentPosition.c] = true;
			
			if(maze[currentPosition.r-1][currentPosition.c] != 0) {
				toSearch.add(new Position(currentPosition.r-1, currentPosition.c, goal));
			}
			if(maze[currentPosition.r][currentPosition.c-2] != 0) {
				toSearch.add(new Position(currentPosition.r, currentPosition.c-2, goal));
			}
			if(maze[currentPosition.r+1][currentPosition.c] != 0) {
				toSearch.add(new Position(currentPosition.r+1, currentPosition.c, goal));
			}
			if(maze[currentPosition.r][currentPosition.c+1] != 0) {
				toSearch.add(new Position(currentPosition.r, currentPosition.c+1, goal));
			}
		}
			
		while(!toSearch.isEmpty()) {
			Position current = toSearch.poll();
			System.out.println(current.r + " " + current.c);
		}
	}
}
class Position implements Comparable<Position> {
	public int r, c;
	public double distanceToGoal;
	public Position(int r, int c) {
		this.r = r;
		this.c = c;
		distanceToGoal = Math.sqrt(Math.pow(r - r, 2) + Math.pow(c - c, 2));
	}
	public Position(int r, int c, Position goal) {
		this.r = r;
		this.c = c;
		distanceToGoal = Math.sqrt(Math.pow(r - goal.r, 2) + Math.pow(c - goal.c, 2));
	}
	public int compareTo(Position other) {
		return Double.compare(this.distanceToGoal, other.distanceToGoal);
	}
}