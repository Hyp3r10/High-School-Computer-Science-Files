import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DepthFirstSearch {
	public static Stack<int[]> path;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("newMaze.dat"));
		int size = scan.nextInt();
		int[][] maze = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				maze[i][j] = scan.nextInt();
			}
		}
		path = new Stack<int[]>();
		path.push(new int[] {size-1, 0});
		System.out.println(depthFirstSearch(maze, new boolean[size][size], size-1, 0));
		while (!path.isEmpty()) {
			int[] temp = path.pop();
			maze[temp[0]][temp[1]] = 9;
		}
		for(int[] temp : maze) {
			for(int tempInt : temp) {
				System.out.print(tempInt + " ");
			}
			System.out.println();
		}
	}
	public static boolean depthFirstSearch(int[][] maze, boolean[][] visited, int r, int c) {
		if(maze[r][c] == 2) {
			return true;
		}
		else {
			// if the cell above the current cell is in bounds and is not a wall... check the cell above
			if(r-1 < maze.length && c < maze.length && r-1 >= 0 && c >= 0 && maze[r-1][c] != 0 && !visited[r-1][c]) {
				visited[r-1][c] = true;
				path.push(new int[] {r-1, c});
				if(depthFirstSearch(maze, visited, r-1, c)) {
					return true;
				} 
				else {
					path.pop();
				}
			}
			// if the cell above the current cell is in bounds and is not a wall... check the cell right
			if(r < maze.length && c+1 < maze.length && r >= 0 && c+1 >= 0 && maze[r][c+1] != 0 && !visited[r][c+1]) {
				visited[r][c+1] = true;
				path.push(new int[] {r, c+1});
				if(depthFirstSearch(maze, visited, r, c+1)) {
					return true;
				} 
				else {
					path.pop();
				}
			}
			// if the cell above the current cell is in bounds and is not a wall... check the cell below 
			if(r+1 < maze.length && c < maze.length && r+1 >= 0 && c >= 0 && maze[r+1][c] != 0 && !visited[r+1][c]) {
				visited[r+1][c] = true;
				path.push(new int[] {r+1, c});
				if(depthFirstSearch(maze, visited, r+1, c)) {
					return true;
				} 
				else {
					path.pop();
				}
			}
			// if the cell above the current cell is in bounds and is not a wall... check the cell left 
			if(r < maze.length && c-1 < maze.length && r >= 0 && c-1 >= 0 && maze[r][c-1] != 0 && !visited[r][c-1]) {
				visited[r][c-1] = true;
				path.push(new int[] {r, c-1});
				if(depthFirstSearch(maze, visited, r, c-1)) {
					return true;
				} 
				else {
					path.pop();
				}
			}
		}
		return false;
	}
}
