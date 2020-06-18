
public class Recursion102 {
	public static void main(String[] args) {
		System.out.println("Calling iterative method :: ");
		skip1(4);
		System.out.println("\n\nCalling recursive method :: ");
		skip2(3);
		System.out.println("\n\nExecution Terminated");
	}
	//Iterative Skip
	public static void skip1(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println("<skip>");
		}
	}
	//Recursive Skip
	public static void skip2(int n) {
		if(n>0) {
			//System.out.println("<Skip>");
			System.out.println("Pushing on the stack");
			skip2(n-1);
			System.out.println("Popping of the stack");
			System.out.println("<Skip>");
		}
	}
}
