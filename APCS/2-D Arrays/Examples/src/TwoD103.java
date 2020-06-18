
public class TwoD103 {
	public static void main(String[] args) {
		int[][] twoD = {{1,2}, //Index 0
						//{3,4}, //Index 1
						{3,4,99}, //New Index 1 
						{5,6}};//Index 2
		//Arrays with ultiple sides are called jagged arrays
		
		
		
		
		//int len = twoD.length;
		int rowLength = twoD.length;
		int colLength0 = twoD[0].length;
		int colLength1 = twoD[1].length;
		int colLength2 = twoD[2].length;
		
		//System.out.println("length :: " + len);
		System.out.println("Row Length :: " + rowLength);
		System.out.println("Column Length @1 :: " + colLength0);
		System.out.println("Column Length @2 :: " + colLength1);
		System.out.println("Column Length @3 :: " + colLength2);
	}
}
