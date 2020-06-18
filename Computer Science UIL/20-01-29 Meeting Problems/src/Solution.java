import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static Stack<int[]> path;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt(); int x = scan.nextInt();
		int startx = 0; int starty = 0;
		scan.nextLine();
		String[][] maze = new String[x][y];
		for(int i = 0; i < x; i++) {
			String temp = scan.nextLine();
			for(int j = 0; j < y; j++) {
				maze[i][j] = "" + temp.charAt(j);
				if(maze[i][j].equals("o")) {
					startx = i;
					starty = j;
				}
			}
		}
		path = new Stack<int[]>();
		path.push(new int[] {startx, starty});
		depthFirstSearch(maze, new boolean[x][y], startx, starty);
		while (!path.isEmpty()) {
			int[] temp = path.pop();
			maze[temp[0]][temp[1]] = "*";
		}
		for(String[] temp : maze) {
			for(String tempString : temp) {
				System.out.print(tempString);
			}
			System.out.println();
		}
	}
	public static boolean depthFirstSearch(String[][] maze, boolean[][] visited, int r, int c) {
		if(maze[r][c].equals("X")) {
			return true;
		}
		else {
			// if the cell above the current cell is in bounds and is not a wall... check the cell above
			if(r-1 < maze.length && c < maze[r-1].length && r-1 >= 0 && c >= 0 && !maze[r-1][c].equals("I") && !visited[r-1][c]) {
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
			if(r < maze.length && c+1 < maze[r].length && r >= 0 && c+1 >= 0 && !maze[r][c+1].equals("I") && !visited[r][c+1]) {
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
			if(r+1 < maze.length && c < maze[r+1].length && r+1 >= 0 && c >= 0 && !maze[r+1][c].equals("I") && !visited[r+1][c]) {
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
			if(r < maze.length && c-1 < maze[r].length && r >= 0 && c-1 >= 0 && !maze[r][c-1].equals("I") && !visited[r][c-1]) {
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
