/**
 * @author MatthewSheldon
 */
import java.util.Scanner;

public class Constanza {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numColors = {0,0,0,0,0,0,0};
		while(scan.hasNextLine()) {
			String color = scan.nextLine();
			switch(color) {
				case "red" : {
					numColors[0]++;
					break;
				}
				case "orange" : {
					numColors[1]++;
					break;
				}
				case "yellow" : {
					numColors[2]++;
					break;
				}
				case "green" : {
					numColors[3]++;
					break;
				}
				case "blue" : {
					numColors[4]++;
					break;
				}
				case "indigo" : {
					numColors[5]++;
					break;
				}
				case "violet" : {
					numColors[6]++;
					break;
				}
			}
		}
		System.out.println("red    " + getStars(numColors[0]));
		System.out.println("orange " + getStars(numColors[1]));
		System.out.println("yellow " + getStars(numColors[2]));
		System.out.println("green  " + getStars(numColors[3]));
		System.out.println("blue   " + getStars(numColors[4]));
		System.out.println("indigo " + getStars(numColors[5]));
		System.out.println("violet " + getStars(numColors[6]));
	}
	public static String getStars(int numStars) {
		String stars = "";
		for(int i = 0; i < numStars; i++) {
			stars += "*";
		}
		return stars;
	}
}
