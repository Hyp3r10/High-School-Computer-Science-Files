
public class Recursion101 {
	private int m=0;
	public static void main(String[] args) {
		Recursion101 test = new Recursion101();
		System.out.println("Calling iterative count method :: ");
		count1();
		
		System.out.println("\n\nCalling recursive count method :: ");
		test.count2();
		
		System.out.println("\n\nExecution Terminated");
	}
	// Iterative Count
	public static void count1() {
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
	}
	// Recursive Count
	public void count2() {
		m++;
		System.out.print(m+" ");
		if(m<100) { // Base Case (This is used to terminate the recursive calls)
			count2();
		}
	}
}
