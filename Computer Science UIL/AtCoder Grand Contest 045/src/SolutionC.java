import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class SolutionC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		
		long numCombinations = getSolution(N, A, B);
		System.out.println(numCombinations);
	}
	public static long getSolution(long N, long A, long B) {
		Queue<String> queue = new LinkedList<String>();
		TreeSet<String> listOfUniques = new TreeSet<String>();
		String start = "";
		for(int i = 0; i < N; i++) {
			start += "0";
		}
		queue.add(start);
		listOfUniques.add(start);

		while(queue.size() != 0) {
			String curr = queue.poll();
			ArrayList<String> list = getPermutations(curr, A, B);
			
			for(String temp : list) {
				if(!listOfUniques.contains(temp)) {
					listOfUniques.add(temp);
					queue.add(temp);
				}
			}
		}
		
		return listOfUniques.size();
	}
	public static ArrayList<String> getPermutations(String current, long A, long B) {
		ArrayList<String> permutations = new ArrayList<String>();
		
		for(int startA = 0; startA <= current.length()-A; startA++) {
		}
		
		return permutations;
	}
}