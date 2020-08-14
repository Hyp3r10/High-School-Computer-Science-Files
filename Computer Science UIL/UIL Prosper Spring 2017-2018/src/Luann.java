/**
 * @author MatthewSheldon
 */
import java.util.Scanner;

public class Luann {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int numCoords = scan.nextInt();
			boolean[][] map = new boolean[numCoords][numCoords];
			for(int j = 0; j < numCoords; j++) {
				int x = scan.nextInt()-1;
				int y = scan.nextInt()-1;
				map[y][x] = true;
			}
			printMap(map);
		}
	}
	public static void printMap(boolean[][] map) {
		for(int y = map.length-1; y >= 0; y--) {
			System.out.print(y+1 + "|");
			for(int x = 0; x < map.length; x++) {
				System.out.print(map[y][x] ? "X" : " ");				
			}
			System.out.println();
		}
		System.out.print("  ");
		for(int i = 0; i < map.length; i++) {
			System.out.print("_");
		}
		System.out.println();
		System.out.print("  ");
		for(int i = 0; i < map.length; i++) {
			System.out.print(i+1);
		}
		System.out.println();
		System.out.println("=====");
	}
}
