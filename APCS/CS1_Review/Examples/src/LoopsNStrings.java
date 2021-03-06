import java.util.Scanner;
public class LoopsNStrings {
	private void countToTwenty(int start) {
		System.out.println("\nForLoop");
		for(int i = start; i <= 20; i++) {
			if(i != 20) {
				System.out.print(i + ", ");	
			}
			else {
				System.out.print(i);
			}	
		}
		System.out.println("\nWhile loop");
		int num1 = start;
		while(num1 <= 20) {
			if(num1 != 20) {
				System.out.print(num1 + ", ");	
			}
			else {
				System.out.print(num1);
			}	
			num1++;
		}
	}
	private void guessMyNumber() {
		Scanner user = new Scanner(System.in);
		int number;
		do {
			System.out.print("\nGuess my number (up to 100) :: ");
			number = user.nextInt();
			
		}while(number != 50);
		System.out.println("\nYes! The number was 50!");
	}
	private void stringStuff() {
		String phrase = "Star Warz";
		int len = phrase.length();
		System.out.println("\nThe length of the string is :: " + len + " characters");
		System.out.println("The first character of " + phrase + " is :: " + phrase.charAt(0));
		System.out.println("The ASCII vlaue of it is :: " + ((int) phrase.charAt(0)));
		System.out.println("The first letter as a String is :: " + phrase.substring(0,1));
		System.out.println("The second word of the phrase is :: " + phrase.substring(5,9));
		System.out.println("The second word of the phrase is :: " + phrase.substring(5));
	}
	public static void main(String[] args) {
		LoopsNStrings test = new LoopsNStrings();
		Scanner user = new Scanner(System.in);
		System.out.print("What mumber would you like to start at :: ");
		int start = user.nextInt();
		test.countToTwenty(start);
		test.guessMyNumber();
		test.stringStuff();
	}
}
