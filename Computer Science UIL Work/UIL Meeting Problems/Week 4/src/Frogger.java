import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Frogger {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("frogger.dat"));
		int numTimes = file.nextInt();
		file.nextLine();

		for(int i = 0; i < numTimes; i++) {
			int rSize = file.nextInt();
			int cSize = file.nextInt();
			file.nextLine();

			int startingR = 0, startingC = 0;

			// Initialize the maze
			String[][] maze = new String[rSize][cSize];
			for(int k = 0; k < maze.length; k++) {
				String temp = file.nextLine();
				for(int j = 0; j < maze[k].length; j++) {
					maze[k][j] = temp.substring(j, j+1);
					if(maze[k][j].equals("$")) {
						startingR = k;
						startingC = j;
					}
				}
			}

			// Create the queue
			Queue<FrogPath> q = new LinkedList<>();
			q.offer(new FrogPath(maze, new boolean[maze.length][maze[0].length], startingR, startingC));

			// Used to end and fins the shortest path
			boolean found = false;
			boolean[][] shortest = null;
			while(!found) {
				// Needed?
				if(q.size() == 0) {
					break;
				}

				FrogPath curr = q.poll();
				int r = curr.currR;
				int c = curr.currC;
				boolean[][] previous = curr.previous;

				// If we find the end... 
				if(c > -1 && r > -1 && r < maze.length && c < maze.length && maze[r][c].equals("@")) {
					found = true;
					curr.previous[r][c] = true;
					shortest = curr.previous;
				}

				//Else we search adjacent
				if(c > -1 && r > -1 && r < maze.length && c < maze.length && !maze[r][c].equals("*") && !maze[r][c].equals("@")) {
					int j = 1;
					if(maze[r][c].equals("1")) {
						j+=1;
					}
					if(maze[r][c].equals("2")) {
						j+=2;
					}
					if(maze[r][c].equals("3")) {
						j+=3;
					}
					if(maze[r][c].equals("4")) {
						j+=4;
					}

					if(r > 0 && !previous[r][c]) {
						q.offer(curr.move(r-j, c));
					}
					if(c > 0 && !previous[r][c]) {
						q.offer(curr.move(r, c-j));
					}
					if(r < maze.length-1 && !previous[r][c]) {
						q.offer(curr.move(r+j, c));
					}
					if(c < maze[r].length-1 && !previous[r][c]) {
						q.offer(curr.move(r, c+j));
					}
				}

			} 

			int num = 0;
			if(found) {
				for(int k = 0; k < maze.length; k++) {
					for(int l = 0; l < maze[k].length; l++) {
						if(shortest[k][l]) {
							num++;
							System.out.print("P");
						}
						else {
							System.out.print(maze[k][l]);
						}
					}
					System.out.println();
				}
			}
			System.out.println(num + "\n");
		}
	}
}

// Finished
class FrogPath {
	public boolean[][] previous;
	public String[][] maze;
	public int currR;
	public int currC;

	public FrogPath(String[][] maze, boolean[][] previous, int r, int c) {
		this.previous = previous;
		currR = r; 
		currC = c;
		this.maze = maze;
	}

	public FrogPath move(int r, int c) {
		boolean[][] newPrevious = clonePrevious();
		newPrevious[currR][currC] = true;
		return new FrogPath(maze, newPrevious, r, c);
	}

	public boolean[][] clonePrevious() {
		boolean[][] newP = new boolean[previous.length][previous[0].length];
		for(int i = 0; i < newP.length; i++) {
			for(int j = 0; j < previous[i].length; j++) {
				newP[i][j] = previous[i][j];
			}
		}
		return newP;
	}
}
