
public class GenericRunner {
	public static void main(String[] args) {
		MinHeapGeneric<String> tester = new MinHeapGeneric<String>();
		tester.insert("Hello");
		tester.display();
		tester.insert("There");
		tester.display();
		tester.insert("General");
		tester.display();
		tester.insert("Kenobi");
		tester.display();
		tester.insert("Apple");
		tester.display();
		System.out.println(tester.popMinimum());
		tester.display();
		tester.insert("a");
		tester.display();
	}
}
