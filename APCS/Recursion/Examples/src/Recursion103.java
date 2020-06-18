
public class Recursion103 {
	public static void main(String[] args) {
		System.out.println("Calling iterative method :: ");
		count1(10,25);
		System.out.println("\n\nCalling recursive method :: ");
		count2(26,40);
		System.out.println("\n\nExecution Terminated");
	}
	//Iterative Count
	public static void count1(int a, int b) {
		for(int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}
	//Recursive Skip
	public static void count2(int a, int b) {
		if(a <= b) {
			System.out.print(a + " ");
			count2(a+1,b);
		}
	}
}
