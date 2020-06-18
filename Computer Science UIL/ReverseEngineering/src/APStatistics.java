import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class APStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the flag?");
        String guess = sc.nextLine();
        String distorted = APStatistics.toString(APStatistics.swapArray(APStatistics.toNumbers(guess)));
        if (distorted.equals("qtqnhuyj{fjw{rwhswzppfnfrz|qndfktceyba")) {
            System.out.println("CONGRATULATIONS. Flag is --> " + guess);
        } else {
            System.out.println("You may have still entered the correct flag. Keep Trying.");
        }
    }

    private static int[] toNumbers(String guess) {
        int[] arr = new int[guess.length()];
        arr[0] = 97 + (int)(Math.random() * 26.0);
        for (int i = 1; i < guess.length(); ++i) {
            arr[i] = arr[i - 1] % 2 == 0 ? guess.charAt(i) + (arr[i - 1] - 97) : guess.charAt(i) - (arr[i - 1] - 97);
            arr[i] = (arr[i] - 97 + 29) % 29 + 97;
        }
        return APStatistics.swapArray(arr);
    }

    private static int[] swapArray(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i - 1] > arr[i]) continue;
            APStatistics.flip(arr, i, i - 1);
        }
        return arr;
    }

    private static String toString(int[] arr) {
        String ans = "";
        for (int x : arr) {
            ans = (String)ans + (char)x;
        }
        return ans;
    }

    public static void flip(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
