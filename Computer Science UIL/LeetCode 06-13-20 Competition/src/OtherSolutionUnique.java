import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.*;


public class OtherSolutionUnique {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> fu = new HashMap<>();
        for (int i : arr)
            fu.put(i, fu.getOrDefault(i, 0) + 1);
        int[] pan = IntStream.of(arr).distinct().boxed().sorted(Comparator.comparingInt(i -> fu.get(i))).mapToInt(i -> i).toArray();
        int deng = 0;
        for (int i : pan) {
            k -= fu.get(i);
            if (k >= 0) {
                deng++;
            } else {
                break;
            }
        }
        return pan.length - deng;
    }
}
