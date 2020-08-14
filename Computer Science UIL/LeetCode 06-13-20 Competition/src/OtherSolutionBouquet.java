public class OtherSolutionBouquet {
    public int minDays(int[] bloomDay, int m, int k) {
        int l = 0, r = 1000000010;
        while (r - l > 10) {
            int mid = (l + r) / 2;
            if (fu(bloomDay, mid, k) >= m) {
                r = mid;
            } else {
                l = mid;
            }
        }
        for (int i = l; i <= r; i++)
            if (fu(bloomDay, i, k) >= m)
                return i;
        return -1;
    }

    int fu(int[] a, int day, int k) {
        int pan = 0;
        int fu = 0;
        for (int i : a) {
            if (i <= day) {
                pan++;
                if (pan == k) {
                    pan = 0;
                    fu++;
                }
            } else {
                pan = 0;
            }
        }
        return fu;
    }
}
