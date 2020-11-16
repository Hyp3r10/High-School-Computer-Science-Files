
public class Backtracking101 {
	public static void main(String[] args) {
		Backtracking101 tester = new Backtracking101();
		tester.printBinary(4);
	}
	public void printBinary(int length) {
		if(length == 0) {
			System.out.println();
		}
		else {
			printBinaryHelper("", length);
		}
	}
	private void printBinaryHelper(String curr, int length) {
		if(curr.length() == length) {
			System.out.print(curr + " ");
		}
		else {
			printBinaryHelper(curr + "0", length);
			printBinaryHelper(curr + "1", length);
		}
	}
}
