import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListFunHouse {
	/*
	 *method getListOfFactors will return a list of
	 *all of the factors of number ? excluding number
	 */
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 0;
		for(int i = 1; i < number; i++) {
			num = number % i;
			if(num == 0) {
				list.add(i);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number you want the factors for :: ");
		System.out.println(getListOfFactors(scan.nextInt()));
	}
}