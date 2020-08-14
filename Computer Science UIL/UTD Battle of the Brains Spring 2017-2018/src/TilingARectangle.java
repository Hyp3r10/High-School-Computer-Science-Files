/**
 * @author MatthewSheldon
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TilingARectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int max = Math.max(num1, num2);
			PrimeNumbers primes = new PrimeNumbers(max);
			ArrayList<Integer> primeNumbers = primes.primeNumbers;
			int gcd = gcd(primeNumbers, num1, num2);
			System.out.println(gcd);
		}
	}
	public static int gcd(ArrayList<Integer> primeNumbers, int num1, int num2) {
		int gcd = 1;
		for(int i = primeNumbers.size()-1; i >= 0; i--) {
			int curr = primeNumbers.get(i);
			if(num1 % curr == 0 && num2 % curr == 0) {
				return curr;
			}
		}
		return gcd;
	}
}
class PrimeNumbers {
	public ArrayList<Integer> primeNumbers;
	public PrimeNumbers(int largest) {
		primeNumbers = getPrimeNumbers(largest);
	}
	public ArrayList<Integer> getPrimeNumbers(int largest) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		boolean isPrime = false;
		for (int i = 1; i <= largest; i++) {
            isPrime = checkPrime(i);
            if (isPrime) {
                primes.add(i);
            }
        } 
		return primes;
	}
	public  boolean checkPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}