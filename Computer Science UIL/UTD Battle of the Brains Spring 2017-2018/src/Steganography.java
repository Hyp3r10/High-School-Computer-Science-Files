/**
 * @author MatthewSheldon
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Steganography {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		do {
			ArrayList<Bit> bits = new ArrayList<Bit>();
			String input = "";
			do {
				input += line;
				line = scan.nextLine();
			} while (!line.equals("*"));
			input = input.replaceAll("[\\S]", "X");
			String[] spaces = getArr(input);
			bits = getBits(spaces);
			for(int i = 0; i < bits.size(); i++) {
				System.out.print(bits.get(i).getLetter());
			}
			System.out.println();
			line = scan.nextLine();
		} while (!line.equals("#"));
	}
	public static String[] getArr(String input) {
		ArrayList<String> spaces = new ArrayList<String>();
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				count++;
			}
			else {
				if(count > 0) {
					String temp = "";
					for(int j = 0; j < count; j++) {
						temp += ' ';
					}
					spaces.add(temp);
				}
				count = 0;
			}
		}
		if(count > 0) {
			String temp = "";
			for(int j = 0; j < count; j++) {
				temp += ' ';
			}
			spaces.add(temp);
		}
		String[] temp = new String[spaces.size()];
		return spaces.toArray(temp);
	} 
	public static ArrayList<Bit> getBits(String[] arr) {
		ArrayList<Bit> bits = new ArrayList<Bit>();
		Bit temp = new Bit();
		for(String curr : arr) {
			if(temp.canAddBit()) {
				temp.addBit(curr.length() % 2 == 0 ? 1 : 0);
			}
			else {
				bits.add(temp);
				temp = new Bit();
				temp.addBit(curr.length() % 2 == 0 ? 1 : 0);
			}
		}
		temp.paddZeros();
		bits.add(temp);
		return bits;
	}
}
class Bit {
	public int[] bits;
	public int currIndex;
	public Bit() {
		bits = new int[5];
		currIndex = 0;
	}
	public boolean canAddBit() {
		return currIndex != 5;
	}
	public void addBit(int num) {
		if(currIndex != 5) {
			bits[currIndex] = num;
			currIndex++;
		}
	}
	public void paddZeros() {
		if(currIndex < 5) {
			for(int i = currIndex; i < 5; i++) {
				bits[i] = 0;
			}
		}
	}
	public char getLetter() {
		String sequence = "";
		for(int curr : bits) {
			sequence += curr;
		}
		int letterCode = Integer.parseInt(sequence, 2);
		switch(letterCode) {
			case 0 : {
				return ' ';
			}
			case 27 : {
				return '\'';
			}
			case 28 : {
				return ',';
			}
			case 29 : {
				return '-';
			}
			case 30 : {
				return '.';
			}
			case 31 : {
				return '?';
			}
			default : {
				return (char)(('A' - 1) + letterCode);
			}
		}
	}
}
