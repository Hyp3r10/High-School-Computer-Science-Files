
public class TwoD101 {
	public static void main(String[] args) {
		//One Dimensional Array
		int[] array = new int[5];
		
		//Two-Dimensional Array
	    //                     r  c
		int[][] twoD = new int[3][2];
		
		// "Row Major Order" (Left to right, then down [how you read])
		twoD[0][0] = 1;
		twoD[0][1] = 2;
		twoD[1][0] = 3;
		twoD[1][1] = 4;
		twoD[2][0] = 5;
		twoD[2][1] = 6;
		
		System.out.println(twoD[0][0] + "  " + twoD[0][1]);
		System.out.println(twoD[1][0] + "  " + twoD[1][1]);
		System.out.println(twoD[2][0] + "  " + twoD[2][1]);
	}
}
