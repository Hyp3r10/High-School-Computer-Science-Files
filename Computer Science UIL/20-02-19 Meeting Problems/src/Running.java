import java.util.Scanner;

public class Running {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			System.out.println(getNumTimes(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
		}
	}
	public static int lcm(int[] arr) 
	{ 
		int lcm = 1; 
		int divisor = 2; 

		while (true) { 
			int counter = 0; 
			boolean divisible = false; 

			
			
			for (int i = 0; i < arr.length; i++) { 
				if (arr[i] == 0) { 
	                return 0; 
	            } 
	            else if (arr[i] < 0) { 
	                arr[i] = arr[i] * (-1); 
	            } 
				if (arr[i] == 1) { 
					counter++; 
				} 
				if (arr[i] % divisor == 0) { 
					divisible = true; 
					arr[i] = arr[i] / divisor; 
				} 
			} 
			if (divisible) { 
				lcm *= divisor; 
			} 
			else { 
				divisor++; 
			} 
			if (counter == arr.length) { 
				return lcm; 
			} 
		}
	}

	public static int getNumTimes(int limmit, int speed1, int speed2, int speed3) {
		System.out.println(lcm(new int[] {speed1, speed2, speed3}));
		return limmit;
	}
}
