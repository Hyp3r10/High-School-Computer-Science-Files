import java.util.Arrays;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int numElements = scan.nextInt();
			int[] numbers = new int[numElements];
			for(int j = 0; j < numElements; j++) {
				numbers[j] = scan.nextInt();
			}
			boolean same = true;
			int k = -1;
			Arrays.sort(numbers);
			int maxNumber = numbers[numbers.length-1];
			for(int o = 1; o <= maxNumber * 100; o++) {
				int[] tempArr = new int[numbers.length];
				int index = 0;
				for(int value : numbers) {
					tempArr[index] = getXOR(value, o);
					index++;
				}
				same = true;
				Arrays.sort(tempArr);
				
				for(int l = 0; l < tempArr.length; l++) {
					if(tempArr[l] != numbers[l]) {
						same = false;
						l = tempArr.length;
					}
				}
				if(same) {
					k = o;
					break;
				}
			}
			System.out.println(k); 
		}
	}
	public static int getXOR(long value, long xor) {
		
		String binaryValue = Long.toBinaryString(value);
		String binaryXOR = Long.toBinaryString(xor);
		while(binaryValue.length() != binaryXOR.length()) {
			if(binaryValue.length() < binaryXOR.length()) {
				binaryValue = "0" + binaryValue;
			}
			if(binaryValue.length() > binaryXOR.length()) {
				binaryXOR = "0" + binaryXOR;
			}
		}
		
		String result = "";
		for(long index = 0; index < binaryValue.length(); index++) {
			if(binaryValue.charAt((int) index) == binaryXOR.charAt((int) index)) {
				result = result + "0";
			}
			else {
				result = result + "1";
			}
		}
		return Integer.parseInt(result, 2);
	}
}
