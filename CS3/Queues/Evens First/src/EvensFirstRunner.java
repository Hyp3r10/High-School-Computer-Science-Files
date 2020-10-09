import java.util.LinkedList;
import java.util.Queue;

public class EvensFirstRunner {
	public static void main(String[] args) {
		EvensFirst tester = new EvensFirst();
		String[] temp = "3 5 4 17 6 83 1 84 16 37".split(" ");
		Queue<Integer> test1 = new LinkedList<Integer>();
		for(String curr : temp) {
			test1.add(Integer.parseInt(curr));
		}
		System.out.println(tester.putEvensFirst(test1));
	}
}
