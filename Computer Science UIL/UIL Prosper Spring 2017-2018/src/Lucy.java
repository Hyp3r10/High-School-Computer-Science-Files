/**
 * @author MatthewSheldon
 */
import java.util.Scanner;

public class Lucy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int numRows = scan.nextInt(); scan.nextLine();
			for(int j = 0; j < numRows; j++) {
				System.out.println(getRLE(scan.nextLine()));
				
			}
			System.out.println("=====");
		}
	}
	public static String getRLE(String line) {
		String output = "";
		for(int i = 0; i < line.length(); i++) {
			int count = 1;
			while(i < line.length() - 1 && line.charAt(i) == line.charAt(i + 1)) {
				count++;
				i++;
			}
			output += line.charAt(i);
			output += count;
		}
		return output;
	}
	public static String decode(String string) {
        if (string == null || string.isEmpty()) return "";

        StringBuilder builder = new StringBuilder();
        char[] chars = string.toCharArray();
        boolean preIsDigit = false;
        String digitString = "";
        for(char current: chars) {
            if (!Character.isDigit(current)) {
                if (preIsDigit){
                    String multipleString = new String(new char[Integer.valueOf(digitString)]).replace("\0",current+"");
                    builder.append(multipleString);
                    preIsDigit = false;
                    digitString = "";
                } else{
                    builder.append(current);
                }
            } else {
                digitString+=current;
                preIsDigit = true;
            }
        }
        return builder.toString();
    }
}
