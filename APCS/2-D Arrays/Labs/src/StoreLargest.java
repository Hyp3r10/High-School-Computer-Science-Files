
public class StoreLargest {

	public int[][] matrix1 = new int[4][4];
	public int[][] matrix2 = new int[4][4];
	public int[][] largestMatrix = new int[4][4];

	public static void main(String[] args) {
		StoreLargest app = new StoreLargest();
		app.getMatrices();
		app.printMatrices();
		app.getLargestElements();
		app.printLargestElements();
	}
	public void getMatrices() {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrix1[i][j] = (int)((Math.random() * 9));
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrix2[i][j] = (int)((Math.random() * 10));
			}
		}
	}
	public void printMatrices() {
		System.out.println("Matrix 1 :: ");
		for(int[] theArrayInTheCurrentIndex : matrix1) {
			for(int num : theArrayInTheCurrentIndex) {
				System.out.print(num + " ");
			}
			System.out.println("");
		}
		System.out.println("\nMatrix 2 :: ");
		for(int[] theArrayInTheCurrentIndex : matrix2) {
			for(int num : theArrayInTheCurrentIndex) {
				System.out.print(num + " ");
			}
			System.out.println("");
		}		
	}
	public void getLargestElements() {
		int in = 0;
		int out = 0;
		for(int[] theArrayInTheCurrentIndex : largestMatrix) {
			for(int num : theArrayInTheCurrentIndex) {
				if(matrix1[out][in] > matrix2[out][in]) {
					largestMatrix[out][in] = matrix1[out][in];
				}
				else if(matrix1[out][in] < matrix2[out][in]) {
					largestMatrix[out][in] = matrix2[out][in];
				}
				else {
					largestMatrix[out][in] = matrix1[out][in];
				}
				in++;
			}
			out++;
			in = 0;
		}		
	}
	public void printLargestElements() {
		System.out.println("\nLargest Elements");
		for(int out = 0; out < largestMatrix.length; out++) {
			for(int in = 0; in < largestMatrix[out].length; in++) {
				System.out.print(largestMatrix[out][in] + " ");
			}
			System.out.println("");
		}	
	}
}
