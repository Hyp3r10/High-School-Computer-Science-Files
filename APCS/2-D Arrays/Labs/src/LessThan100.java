import java.util.Scanner;

public class LessThan100 {

	public int rows;
	public int columns;
	public Scanner scan;
	public int[][] matrix;

	public static void main(String[] args) {
		LessThan100 app = new LessThan100();
		app.getSize();
		app.generateMatrix();
		app.printMatrix();
		app.getLessThan100();
	}
	public void getSize() {
		scan = new Scanner(System.in); 

		System.out.print("Enter the numebr of Rows :: ");
		rows = scan.nextInt();
		System.out.print("Enter the numebr of Columns :: ");
		columns = scan.nextInt();
	}
	public void generateMatrix() {
		matrix = new int[rows][columns];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = (int)((Math.random() * 200) + 1);
			}
		}
	}
	public void printMatrix() {
		System.out.println("\nGenerated Matrix :: ");
		for(int[] i : matrix) {
			for(int num : i) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	public void getLessThan100() {
		System.out.println("\nNumbers Less Than 100\n");
		System.out.println(" Row         Column");

		for(int out = 0; out < matrix.length; out++) {
			for(int in = 0; in < matrix[out].length; in++) {
				if(matrix[out][in] < 100) {
					System.out.println("  " + out + "           " + in);
				}
			}
		}
	}
}
