import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Photoshoot {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("photo.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")))) {
				int numCows = scan.nextInt();
				scan.nextLine();

				String[] tempCows = scan.nextLine().split(" ");
				int[] cows = new int[tempCows.length];
				int i = 0;
				for(String temp : tempCows) {
					cows[i] = Integer.parseInt(temp);
					i++;
				}

				ArrayList<Integer> listOfCows = new ArrayList<Integer>();
				listOfCows.add(cows[0]-1);
				out.print(listOfCows.get(0) + " ");
				for(i = 0; i < numCows-1; i++) {
					listOfCows.add(cows[i]-listOfCows.get(i));
					out.print(listOfCows.get(i+1));
					if(i < numCows-2) {
						out.print(" ");
					}
				}
			}
		}
	}

	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCows = scan.nextInt();
		scan.nextLine();

		String[] tempCows = scan.nextLine().split(" ");
		int[] cows = new int[tempCows.length];
		int i = 0;
		for(String temp : tempCows) {
			cows[i] = Integer.parseInt(temp);
			i++;
		}

		ArrayList<Integer> listOfCows = new ArrayList<Integer>();
		listOfCows.add(cows[0]-1);
		for(i = 0; i < numCows-1; i++) {
			listOfCows.add(cows[i]-listOfCows.get(i));
		}

		System.out.println(listOfCows);
	}*/
}
