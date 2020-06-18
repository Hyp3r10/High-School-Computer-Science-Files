import java.util.Scanner;

/**
 * @author MatthewSheldon
 */
public class Reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String[] orriginal = scan.nextLine().split(" ");
			boolean[] needToFlip = new boolean[orriginal.length];
			String vowels = "AEIOUaeiou";
			for(int i = 0; i < orriginal.length; i++) {
				for(int j = 0; j < vowels.length(); j++) {
					if(orriginal[i].charAt(0) == vowels.charAt(j)) {
						j = vowels.length();
						needToFlip[i] = true;
					}
				}
			}
			for(int i = 0; i < orriginal.length; i++) {
				if(needToFlip[i]) {
					int flipIndex = i;
					for(int j = orriginal.length-1; j > i; j--) {
						if(needToFlip[j]) {
							flipIndex = j;
							needToFlip[j] = false;
							j = i;
						}
					}
					needToFlip[i] = false;
					String temp = orriginal[i];
					orriginal[i] = orriginal[flipIndex];
					orriginal[flipIndex] = temp;
				}
			}
			
			for(String temp : orriginal) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}
}
