import java.util.Arrays;

public class HashTable101 {
	public static void main(String[] args) {
		Object[] hashTable = new Object[10];
		Character c = 'g';
		System.out.println("hashCode for \'c\': " + c.hashCode());
		hashTable[c.hashCode() % 10] = c;
		Character d = 'A';
		hashTable[d.hashCode() % 10] = d;
		Integer num = 118;
		hashTable[num.hashCode() % 10] = num;
		Character e = 'e';
		hashTable[e.hashCode() % 10] = e;
		System.out.println("Hash Table: " + Arrays.toString(hashTable));
	}
}
