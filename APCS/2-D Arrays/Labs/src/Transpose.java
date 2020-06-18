
public class Transpose {
	
	public int[][] matrix = new int[5][5];
	
	public static void main(String[] args) {
		Transpose app = new Transpose();
		app.generateMatrix();
		app.printOrriginalMatrix();
		app.printTranspose();
	}
	public void generateMatrix() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = (int)((Math.random() * 201) - 100);
			}
		}
	}
	public void printOrriginalMatrix() {
		System.out.println("Original Matrix :: ");
		for(int out = 0; out < matrix.length; out++) {
			for(int in = 0; in < matrix[out].length; in++) {
				System.out.print(matrix[out][in] + " ");
			}
			System.out.println("");
		}		
	}
	public void printTranspose() {
		System.out.println("\nTranspose :: ");
		for(int out = 0; out < matrix.length; out++) {
			for(int in = 0; in < matrix[out].length; in++) {
				System.out.print(matrix[in][out] + " ");
			}
			System.out.println("");
		}		
	}
}
