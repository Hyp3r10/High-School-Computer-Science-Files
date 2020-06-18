import java.util.Scanner;

public class SumMatrix {
	public int[][] matrix;
	public Scanner scan;
	public int rows;
	public int columns;
	public int rowSum;
	public int columnSum;
	
	public static void main(String[] args) {
		SumMatrix app = new SumMatrix(); 
		app.getSize();
		app.getMatrix();
		app.getSumColumns();
	}
	public void getSize() {
		scan = new Scanner(System.in); 

		System.out.print("Enter the numebr of Rows :: ");
		rows = scan.nextInt();
		System.out.print("Enter the numebr of Columns :: ");
		columns = scan.nextInt();
		
		matrix = new int[rows][columns];
	}
	public void getMatrix() {
		System.out.println("");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = (int)((Math.random() * 10));
				System.out.print(matrix[i][j] + " ");
				rowSum += matrix[i][j];
			}
			System.out.println("    " + rowSum);
			rowSum = 0;
		}
	}
	public void getSumColumns() {
		System.out.println("");
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				columnSum += matrix[j][i];
			}
			System.out.print(columnSum + " ");
			columnSum = 0;
		}
	}
}
