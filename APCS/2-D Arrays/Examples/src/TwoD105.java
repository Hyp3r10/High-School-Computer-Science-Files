
public class TwoD105 {
	public static void main(String[] args) {
		int[][] twoD = {{1,2}, //Index 0
				//{3,4}, //Index 1
				{3,4,99}, //New Index 1 
				{5,6}};//Index 2
		for(int out = 0; out < twoD.length; out++) {
			for(int in = 0; in < twoD[out].length; in++) {
				System.out.print(twoD[out][in] + " ");
			}
			System.out.println("");
		}		
		System.out.println("\n");
		for(int[] theArrayInTheCurrentIndex : twoD) {
			for(int num : theArrayInTheCurrentIndex) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
