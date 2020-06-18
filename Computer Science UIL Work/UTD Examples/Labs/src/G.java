import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class G {
	public static ArrayList<String> binary;
	public static String[] spaces;

	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("G.dat"));
		binary = new ArrayList<String>();
		spaces = new String[0];
		String code = "";

		String line = file.nextLine();

		while(!line.equals("#")) {
			if(line.equals("*")) {
				for(int i = 0; i < binary.size(); i++) {
					int num = toDecimal(binary.get(i));

					code = "";

					if(num == 0) {code += " ";}
					else if(num >= 1 && num <= 27) {code += String.valueOf(((char) (num + 64)));}
					else if(num == 27) {code += "'";}
					else if(num == 28) {code += ",";}
					else if(num == 29) {code += "-";}
					else if(num == 30) {code += ".";}
					else {code += "?";}
					System.out.print(code);
				}
				System.out.println();
				binary.clear();
				spaces = new String[0];
				line = file.nextLine();
			}
			else {
				String temp = line;
				boolean done = false;

				// Continue through the input file until you hit an "*" -- add all of the lines onto a temp String
				while(!done) {
					String superTemp = file.nextLine();
					if(superTemp.equals("*")) {
						done = true;
						line = superTemp;
					}
					else {
						temp += superTemp;
					}
				}

				// Creates an Array full of only the spaces
				String[] tempArray = temp.split("[^ ]+");
				spaces = new String[tempArray.length-1];
				for(int i = 1; i < tempArray.length; i++) {
					spaces[i-1] = tempArray[i];
				}

				// Go through the spaces array, split it into bits of five, then change the spaces into their respective binary values.
				spacesToBinary();
			}
		}
	}


	// Changes String binary to int decimal
	private static int toDecimal(String binary) {
		int decimal = 0;

		for(int i = binary.length()-1; i >= 0; i--) {
			if(i == 4) {
				if(binary.charAt(i) == '1') {decimal += 1;}
			}
			else if(i == 3) {
				if(binary.charAt(i) == '1') {decimal += 2;}
			}
			else if(i == 2) {
				if(binary.charAt(i) == '1') {decimal += 4;}
			}
			else if(i == 1) {
				if(binary.charAt(i) == '1') {decimal += 8;}
			}
			else {
				if(binary.charAt(i) == '1') {decimal += 16;}
			}
		}

		return decimal;
	}

	// Converts the Array of spaces into an ArrayList of 5-bit Binary Representations
	private static void spacesToBinary() {
		String stringBinary = ""; 
		for(int i = 0; i < spaces.length; i++) {
			if(spaces[i].length() % 2 == 0) { stringBinary += "1"; }
			else if(spaces[i].length() % 2 == 1) { stringBinary += "0"; }

			if(i != 0 && (i+1) % 5 == 0) {
				binary.add(stringBinary);
				stringBinary = "";
			} 
			else if(i+1 == spaces.length) {
				for(int k = (i+1)%5; k < 5; k++) {
					stringBinary += "0";
				}
				binary.add(stringBinary);
				stringBinary = "";
			}
		}
	} 
}
