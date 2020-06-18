import java.util.Arrays;

public class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int m = arr[(n - 1) / 2];
        int[] res = new int[k];
        int l = 0, r = n - 1;
        for (int i = 0; i < k; i++)
        {
            if (Math.abs(arr[r] - m) >= Math.abs(arr[l] - m)) {
                res[i] = arr[r];
                --r;
            }
            else {
                res[i] = arr[l];
                ++l;
            }
        }
        return res;
    }
}