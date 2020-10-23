public class Runner 
{
	public static void main(String[] args) 
	{
		MyBST a = new MyBST();

		a.insert(3); a.insert(8); a.insert(1);  a.insert(4);  a.insert(0); a.insert(2); 
		a.insert(10); a.insert(11); a.insert(5); a.insert(9); a.insert(3); a.insert(6);
		
		System.out.println("Size of tree: " + a.size()); //9

		System.out.println("\nCheck if Node with value 4 exists:   " + a.contains(4)); //true
		System.out.println("Check if Node with value -1 exists:  " + a.contains(-1));   //false
		
		System.out.println("\nMin value: " + a.getMin());
		System.out.println("Max value: "   + a.getMax());

		System.out.println("\nOriginal Tree: ");
		a.print();
		
		System.out.println("\nIn-order traversal: ");
		a.inOrder();
		
		System.out.println("\n\nDelete node that doesn't exist (shouldn't change): ");
		a.delete(7);
		a.print();
		
		System.out.println("\nDelete leaf node (value 2): ");
		a.delete(2);
		a.print();
		
		System.out.println("\nDelete node (value 1) with one child: ");
		a.delete(1);
		a.print();
		
		System.out.println("\nDelete node (value 4) with one child: ");
		a.delete(4);
		a.print();
		
		
		System.out.println("\nDelete node (value 8) with two children: ");
		a.delete(8);
		a.print();
		
		MyBST b = new MyBST();
		System.out.println("\n\nThe tree from the print method example: ");
		b.insert(5); b.insert(2); b.insert(6); b.insert(1); b.insert(3); b.insert(9);
		b.print();
	}
}
