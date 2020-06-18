import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("A.dat"));
		ArrayList<int[][]> bulletins = new ArrayList<int[][]>();
		String line = file.nextLine();

		while(!line.equals("0")) {

			// Assign the amount of posters and the width and height of the bulitin board
			Scanner temp = new Scanner(line);
			int numTimes = temp.nextInt();
			int w = temp.nextInt();
			int h = temp.nextInt();
			int[][] bulletin = new int[w][h]; 

			Polygon[] posters = new Polygon[numTimes];

			// Initialize the ArrayList of Polygons with the data set
			for(int i = 0; i < posters.length; i++) {
				line = file.nextLine();
				Scanner temp2 = new Scanner(line);
				int x1 = temp2.nextInt();
				int y1 = temp2.nextInt();
				int x2 = temp2.nextInt();
				int y2 = temp2.nextInt();

				posters[i] = (new Polygon(x1, y1, x2, y2));
				temp2.close();
			}

			// Any area that is covered by at least one poster
			int areaCovered = 0;
			// The maximum number of poster depth (overlap)
			int maxDepth = 0;
			// The are of only the maxDepth area
			int maxDepthArea = 0;
			// The real area of the whole bulletin
			int area = w * h;

			// Gets the maxDepth of the posters and makes a 2D array full of depth values of the bulletin
			for(int i = 0; i < posters.length; i++) {
				for(int j = posters[i].x1; j < posters[i].x2; j++) {
					for(int k = posters[i].y1; k < posters[i].y2; k++) {
						bulletin[j][k]++;
						if(bulletin[j][k] > maxDepth) {
							maxDepth = bulletin[j][k];
						}
					}
				}
			}

			// Calculates the area of the maxDepth posters and the total area covered
			for(int i = 0; i < bulletin.length; i++) {
				for(int j = 0; j < bulletin[i].length; j++) {
					if(bulletin[i][j] == maxDepth) {
						maxDepthArea++;
					}
					if(bulletin[i][j] > 0) {
						areaCovered++;
					}
				}
			}

			bulletins.add(bulletin);
			System.out.println((area - areaCovered) + " " + maxDepth + " " + maxDepthArea);
			line = file.nextLine();
			temp.close();
		}
	}
}
class Polygon {
	public int x1, y1, x2, y2;

	public Polygon(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public String toString() {
		return "x1 :: " + x1 + "\ny1 :: " + y1 + "\nx2 :: " + x2 + "\ny2 :: " + y2 + "\n\n";
	}
 }