import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AStar {
	public static Queue<Path> path;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("newMaze.dat"));
		int size = scan.nextInt();
		int[][] maze = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				maze[i][j] = scan.nextInt();
			}
		}
		path = new LinkedList<>();
		path.offer(new Path(maze, new boolean[size][size], size-1, 0));
		System.out.println(aStarSearch(path.peek(), size-1, 0));
		
		Path shortest = path.poll();
	}
	public static boolean aStarSearch(Path curr, int r, int c) {
		if(curr.maze[r][c] == 2) {
			return true;
		}
		else {
			if(c > -1 && r > -1 && r < curr.maze.length && c < curr.maze.length) {
				if(r-1 > 0 && !curr.visited[r-1][c] && curr.maze[r-1][c] != 0) {
					path.offer(curr.move(r-1, c));
					return aStarSearch(path.peek(), r-1, c);
				}
				if(c-1 > 0 && !curr.visited[r][c-1] && curr.maze[r][c-1] != 0) {
					path.offer(curr.move(r, c-1));
					return aStarSearch(path.peek(), r, c-1);
				}
				if(r+1 < curr.maze.length && !curr.visited[r+1][c] && curr.maze[r+1][c] != 0) {
					path.offer(curr.move(r+1, c));
					return aStarSearch(path.peek(), r+1, c);
				}
				if(c+1 < curr.maze[r].length && !curr.visited[r][c+1] && curr.maze[r][c+1] != 0) {
					path.offer(curr.move(r, c+1));
					return aStarSearch(path.peek(), r, c+1);
				}
			}
		}
		return false;
	}
	
}
class Path {
	public boolean[][] visited; 
	public int[][] maze;
	public int currR;
	public int currC;

	public Path(int[][] maze, boolean[][] visited, int r, int c) {
		this.visited = visited;
		currR = r;
		currC = c;
		this.maze = maze;

	}
	public Path move(int r, int c) {
		boolean[][] newvisited = clonevisited();
		newvisited[currR][currC] = true;
		return new Path(maze, newvisited, r, c);
	}
	
	public boolean[][] clonevisited() {
		boolean[][] newA = new boolean[visited.length][visited.length];
		
		for(int o = 0; o < newA.length; o++) {
			for(int i = 0; i < visited[o].length; i++) {
				newA[o][i] = visited[o][i];
			}
		}
		
		return newA;
	}
}
