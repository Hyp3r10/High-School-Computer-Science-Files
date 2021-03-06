import java.util.ArrayList;
import java.util.Scanner;

public class GuessingGame {
	private static int targetNumber;
	public static void main(String[] args) {
		setNumber(2);
		guessNumber();
		setNumber(6);
		guessNumber();
	}
	public static void setNumber(int n) {
		targetNumber = n;
	}
	public static void guessNumber() {
		Scanner scan = new Scanner(System.in);
		int numGuessed = 0;
		int previousGuess = 0;
		boolean previous = true;
		while(numGuessed != targetNumber) {
			numGuessed = scan.nextInt();
			if(numGuessed == targetNumber) {
				System.out.println("right on");
				if(previous) {
					if(previousGuess < numGuessed) {
						System.out.println("Stan may be honest");
					}				
					else {
						System.out.println("Stan is dishonest");
					}
				}
				else {
					if(previousGuess > numGuessed) {
						System.out.println("Stan may be honest");
					}				
					else {
						System.out.println("Stan is dishonest");
					}
				}
				scan.nextLine();
				break;
			}
			else {
				int random = (int)(Math.random()*2);
				if(random == 0) {
					System.out.println("too low");
					previous = true;
				}
				else {
					System.out.println("too high");
					previous = false;
				}
				scan.nextLine();
			}
			previousGuess = numGuessed;
		}
	}

}
