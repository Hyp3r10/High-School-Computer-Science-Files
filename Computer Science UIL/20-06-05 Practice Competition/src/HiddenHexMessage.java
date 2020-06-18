import java.util.Scanner;
/**
 * @author MatthewSheldon
 */
public class HiddenHexMessage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		char[] arr = line.toCharArray();
		String hexOutput = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != ' ') {
				hexOutput += Integer.toHexString((int) arr[i]);
			}
		}

		String firstOutput = "";
		for(int i = 0; i < hexOutput.length(); i+=2) {
			if(i != hexOutput.length()-2) {
				firstOutput += hexOutput.substring(i, i+2) + " ";
			}
			else {
				firstOutput += hexOutput.substring(i, i+2);
			}
		} 
		System.out.println(firstOutput);


		String fours = "";
		for(int i = hexOutput.length()-1; i >= 0; i-=4) {
			fours = hexOutput.charAt(i) + fours;
		}
		System.out.println(fours);

		String secret = "";
		for(int i = 0; i < fours.length(); i+=2) {
			secret += (char) Integer.parseInt(fours.substring(i, i+2), 16);
		}
		System.out.println(secret);
	}
}
