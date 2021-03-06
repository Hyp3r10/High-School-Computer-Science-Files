
public class Factorial {
	public static void main(String[] args) {
		System.out.println("6! == " + fact1(6));
		System.out.println("6! == " + fact2(6));
	}
	public static int fact1(int num) {
		int fact = 1;
		for(int i = num; i>=1; i--) {
			fact *= i;
		}
		return fact;
	}
	public static int fact2(int num) {
		/*if(num > 1) {
			num *= fact2(num-1);
		}
		return num;*/
		
		//Alternatively
		if(num == 1) { // Base case is not always explicit (but still have exit condition)
			return num * fact2(num-1);
		}
		return 1;
	}
}
