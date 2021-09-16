import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ProblemI {
	public static Alphabet allCharactersForAllWords;
	public static Dice[] allDice;
	public static HashSet<Character> allCharactersAmongAllDice;
	public static String[] allValidWords;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numDice = scan.nextInt();
		int numWords = scan.nextInt(); scan.nextLine();
		allDice = new Dice[numDice];
		allValidWords = new String[numWords];
		allCharactersForAllWords = new Alphabet();
		for(int i = 0; i < numWords; i++) {
			allValidWords[i] = scan.nextLine();
			allCharactersForAllWords.add(allValidWords[i]);
		}
		for(int i = 0; i < numDice; i++) {
			allDice[i] = new Dice(scan.nextLine());
		}
		for(int i = 0; i < numDice; i++) {
			if(allDice[i].characters.size() == 0) {
				allCharactersAmongAllDice = allCharactersForAllWords.alphabet;
				break;
			}
			else {
				for(Character c : allDice[i].characters) {
					allCharactersAmongAllDice.add(c);
				}
			}
		}
		System.out.println(allCharactersForAllWords);
		System.out.println(Arrays.toString(allDice));
		System.out.println(allCharactersAmongAllDice);
		System.out.println(Arrays.toString(allValidWords));
	}
}
class Alphabet {
	public HashSet<Character> alphabet;
	public Alphabet() {
		alphabet = new HashSet<Character>();
	}
	public void add(String word) {
		for(Character temp : word.toCharArray()) {
			this.alphabet.add(temp);
		}
	}
	public String toString() {
		return this.alphabet.toString();
	}
}
class Dice {
	// Note that a set size of 0 indicates a dice that is a wildcard. 
	public HashSet<Character> characters;
	public Dice(String word) {
		for(Character temp : word.toCharArray()) {
			characters.add(temp);
			if(temp == '*') {
				characters.clear();
				break;
			}
		}
	}
	public boolean contains(Character c) {
		return characters.size() == 0 || this.characters.contains(c);
	}
	public String toString() {
		return this.characters.toString();
	}
}