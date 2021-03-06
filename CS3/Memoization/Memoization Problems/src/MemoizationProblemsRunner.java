
public class MemoizationProblemsRunner {
	public static void main(String[] args) {
		double timer = System.nanoTime();
		Pascal pascalTester = new Pascal();
		System.out.print("Test case \"printPascalRow(9)\": ");
		pascalTester.printPascalRow(9);
		System.out.print("\nTest case \"printPascalRow(40)\": ");
		pascalTester.printPascalRow(40);
		System.out.println();
		
		NumberOfPaths pathTester = new NumberOfPaths();
		System.out.println("Test case \"new int[2][4]\": " + pathTester.numPaths(new int[2][4]) + "\n");
		System.out.println("Test case \"new int[3][4]\": " + pathTester.numPaths(new int[3][4]) + "\n");
		System.out.println("Test case \"new int[20][12]\": " + pathTester.numPaths(new int[20][12]) + "\n");
		
		MinimumCoins coinsTester = new MinimumCoins();
		System.out.println("Test case \"minCoinsMap(11, new int[] {9, 6, 5, 1})\": " + coinsTester.minCoinsMap(11, new int[] {9, 6, 5, 1}) + "\n");
		System.out.println("Test case \"minCoinsMap(1000, new int[] {12, 8, 5, 2, 1})\": " + coinsTester.minCoinsMap(1000, new int[] {12, 8, 5, 2, 1}) + "\n");
		System.out.println("Test case \"minCoinsArray(11, new int[] {9, 6, 5, 1})\": " + coinsTester.minCoinsArray(11, new int[] {9, 6, 5, 1}) + "\n");
		System.out.println("Test case \"minCoinsArray(1000, new int[] {12, 8, 5, 2, 1})\": " + coinsTester.minCoinsArray(1000, new int[] {12, 8, 5, 2, 1}) + "\n");
		
		System.out.println("Executed in " + (double) (System.nanoTime()-timer) / 1000000000  + " seconds... not 24 hours :P");
	}
}
