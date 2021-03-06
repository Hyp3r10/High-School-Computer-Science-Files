
public class TwoD104 {
	public static void main(String[] args) {
		int[][] twoD = {{1,2}, //Index 0
				//{3,4}, //Index 1
				{3,4,99}, //New Index 1 
				{5,6}};//Index 2
		//Arrays with ultiple sides are called jagged arrays


		int count = 1;
		for(int out = 0; out < twoD.length; out++) {
			for (int in = 0; in < 2; in++) {
				System.out.print(count + " ");
				count++;			
			}
			System.out.println();
		}
		System.out.println("\n");

		for(int out = 0; out < 3; out++) {
			for(int in = 0; in < 2; in++) {
				System.out.print("[" + out + "][" + in + "] ");
			}
			System.out.println("");
		}

		System.out.println("\n");

		for(int out = 0; out < twoD.length; out++) {
			for(int in = 0; in < twoD[out].length; in++) {
				System.out.print(twoD[out][in] + " ");
			}
			System.out.println("");
		}
	}
}
