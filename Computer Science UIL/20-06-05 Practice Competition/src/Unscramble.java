import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author MatthewSheldon
 */
public class Unscramble {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		for(int i = 0; i < numTimes; i++) {
			Scanner temp = new Scanner(scan.nextLine());
			ArrayList<Integer> orriginal = new ArrayList<Integer>();
			while(temp.hasNextInt()) {
				orriginal.add(temp.nextInt());
			}
			Integer[] ascending = orriginal.toArray(new Integer[orriginal.size()]);
			Arrays.sort(ascending);
			
			ArrayList<Integer> descending = new ArrayList<Integer>();
			Integer[] tempArr = orriginal.toArray(new Integer[orriginal.size()]);
			Arrays.sort(tempArr);
			for(Integer tempInt : tempArr) {
				descending.add(tempInt);
			}
			Collections.reverse(descending);
			
			int aMoved = 0;
			int dMoved = 0;
			for(int j = 0; j < orriginal.size(); j++) {
				if(orriginal.get(j) != ascending[j]) {
					aMoved++;
				}
				if(orriginal.get(j) != descending.get(j)) {
					dMoved++;
				}
			}
			
			if(aMoved < dMoved) {
				System.out.println(aMoved);
			}
			else {
				System.out.println(dMoved);
			}
		}
	}
}
