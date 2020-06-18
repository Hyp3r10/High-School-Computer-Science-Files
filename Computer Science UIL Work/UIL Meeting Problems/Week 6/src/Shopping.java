import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("shopping.txt"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String[] temp = (file.nextLine().split(" "));
			
			double[] doubles = new double[temp.length];
			for(int j = 0; j < doubles.length; j++) {
				doubles[j] = Double.parseDouble(temp[j]);
			}

			double previous = 0.0;
			
			
			
			for(int j = 0; j < doubles.length; j++) {
				double current = permutation(doubles, Double.MAX_VALUE, 0, 200.00);
				if(current < previous) {
					previous = current;
				}
			}
			
			System.out.printf("%.2f%n",(200 - previous));
		}
		file.close();
	}
	public static double permutation(double[] list, double previous, int current, double max) {
		if(current < list.length) {
			int times = (int) (max / list[current]);
			if((times * list[current]) < previous) {
				previous = times * list[current];
			}
			previous = permutation(list, previous, current+1, max);
			return previous;
		}
		return previous;
	}
}
