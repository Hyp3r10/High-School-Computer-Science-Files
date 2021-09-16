import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static HashSet<String> permutations;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        permutations = new HashSet<String>();
        int numTimes = scan.nextInt(); scan.nextLine();
        while(numTimes-->0) {
            String word = scan.nextLine();
            permutations(word);
        }
    }
    public static int factorial(int num){
        if(num==0) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <=num ; i++) {
            result *= i;
        }
        return result;
    }
    public static void permutations(String input){
        char[] chars = input.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <chars.length ; i++) {
            char x = chars[i];
            if(map.containsKey(x)) {
                int count = map.get(x);
                count++;
                map.put(x, count);
            }
            else {
                map.put(x, 1);
            }
        }

        int result = factorial(chars.length);

        Set<Character> set = map.keySet();
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()){
            char key = iterator.next();
            int count = map.get(key);
            int factorialCount = factorial(count);
            result = result/factorialCount;
        }

        System.out.println(result);
    }
}