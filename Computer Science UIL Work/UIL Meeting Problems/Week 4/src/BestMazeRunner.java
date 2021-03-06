import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BestMazeRunner {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("maze.dat"));
		while(file.hasNext()) {
			// size of the board
			int size = file.nextInt();
			file.nextLine();

			// The whole board as one string
			String temp = file.nextLine();

			// Break up the tring into its respective size
			Scanner scan = new Scanner(temp);
			int[][] maze = new int[size][size];
			for(int k = 0; k < size; k++) {
				for(int j = 0; j < size; j++) {
					maze[k][j] = scan.nextInt();
				}
			}

			Queue<Path> queue = new LinkedList<>();
			queue.offer(new Path(maze, new boolean[maze.length][maze.length],  0, 0, null));

			boolean found = false;
			boolean[][] shortest = null;
			Path end = null;

			while(!found) {

				if(queue.size() == 0) {
					break;
				}

				Path curr = queue.poll();
				int r = curr.currR;
				int c = curr.currC;
				boolean[][] previous = curr.previous;
				

				if(c == maze[r].length-1 && maze[r][c] == 1) {
					found = true;
					curr.previous[r][c] = true;
					shortest = curr.previous;
					end = curr;
				}

				if(c > -1 && r > -1 && r < maze.length && c < maze.length && maze[r][c] == 1) {
					if(r > 0 && !previous[r][c]) {
						queue.offer(curr.move(r-1, c, curr));
					}
					if(c > 0 && !previous[r][c]) {
						queue.offer(curr.move(r, c-1, curr));
					}
					if(r < maze.length-1 && !previous[r][c]) {
						queue.offer(curr.move(r+1, c, curr));
					}
					if(c < maze[r].length-1 && !previous[r][c]) {
						queue.offer(curr.move(r, c+1, curr));
					}
				}
			}

			if(found) {
				while(end != null) {
					System.out.println(end);
					end = end.previousSquare;
				}
				
				
				int num = 0;
				for(int i = 0; i < maze.length; i++) {
					for(int o = 0; o < maze[i].length; o++) {
						if(shortest[i][o] == true) {
							System.out.print("P ");
							num++;
						}
						else {
							System.out.print(maze[i][o] + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println("path found -- " + num + " moves made\n");
			}
			else {
				for(int i = 0; i < maze.length; i++) {
					for(int o =0; o < maze.length; o++) {
						System.out.print(maze[i][o] + " ");
					}
					System.out.println();
				}
				System.out.println("path not found\n");
			} 
		}
	}
}
class Path {
	public boolean[][] previous; 
	public int[][] maze;
	public int currR;
	public int currC;
	public Path previousSquare;

	public Path(int[][] maze, boolean[][] previous, int r, int c, Path previousSquare) {
		this.previous = previous;
		currR = r;
		currC = c;
		this.maze = maze;
		this.previousSquare = previousSquare;

	}
	public Path move(int r, int c, Path previousSquare) {
		boolean[][] newPrevious = clonePrevious();
		newPrevious[currR][currC] = true;
		return new Path(maze, newPrevious, r, c, previousSquare);
	}
	
	public boolean[][] clonePrevious() {
		boolean[][] newA = new boolean[previous.length][previous.length];
		
		for(int o = 0; o < newA.length; o++) {
			for(int i = 0; i < previous[o].length; i++) {
				newA[o][i] = previous[o][i];
			}
		}
		
		return newA;
	}
	public String toString() {
		return "" + this.currR + " " + this.currC;
	}
}