import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author MatthewSheldon
 */
public class MaskedMaskRobber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt(); 
		int[][] orriginal = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				orriginal[i][j] = scan.nextInt();
			}
		}
		
		int[] result = getHighestSum(orriginal);
		System.out.println(result[1] + " " + result[0]);
		
	}
	public static int[] getHighestSum(int[][] grid) {
		int highestSum = -1;
		int x1 = -1; 
		int y1 = -1;
		for(int y = 0; y < grid.length; y++) {
			for(int x = 0; x < grid[y].length; x++) {
				ArrayList<Integer> surroundingNodes = new ArrayList<Integer>();
				// top left
				if(y-1 >= 0 && x-1 >= 0) {
					surroundingNodes.add(grid[y-1][x-1]);
				}
				// top middle
				if(y-1 >= 0 && x < grid.length) {
					surroundingNodes.add(grid[y-1][x]);
				}
				// top right
				if(y-1 >= 0 && x+1 < grid.length) {
					surroundingNodes.add(grid[y-1][x+1]);
				}
				// middle left
				if(y < grid.length && x-1 >= 0) {
					surroundingNodes.add(grid[y][x-1]);
				}
				// middle right
				if(y < grid.length && x+1 < grid.length) {
					surroundingNodes.add(grid[y][x+1]);
				}
				// bottom left
				if(y+1 < grid.length && x-1 >= 0) {
					surroundingNodes.add(grid[y+1][x-1]);
				}
				// bottom middle
				if(y+1 < grid.length && x >= 0) {
					surroundingNodes.add(grid[y+1][x]);
				}
				// bottom right
				if(y+1 < grid.length && x+1 < grid.length) {
					surroundingNodes.add(grid[y+1][x+1]);
				}
				
				Collections.sort(surroundingNodes, Collections.reverseOrder());
				int total = surroundingNodes.get(0) + surroundingNodes.get(1);
				if(total > highestSum) {
					highestSum = total;
					x1 = x; 
					y1 = y;
				}
				if(total == highestSum) {
					if(y1 > y) {
						highestSum = total;
						x1 = x; 
						y1 = y;
					}
					if(y1 == y) {
						if(x1 > x) {
							highestSum = total;
							x1 = x; 
							y1 = y;
						}
					}
				}
			}
		}
		
		return new int[] {x1, y1, highestSum};
	}
}
