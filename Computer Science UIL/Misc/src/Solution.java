public class Solution {
    public static void main(String[] args) {
    	long before = (System.currentTimeMillis());
    	System.out.println(System.currentTimeMillis() - before);
    }
	public static boolean canConvertString(String s, String t, int k) {
        if(s.equals(t)) {
            return true;
        }
        if(s.length() != t.length()) {
            return false;
        }
        int[] numberOfSame = new int[26];
        int[] farAway = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            int distance = t.charAt(i) - s.charAt(i);
            if(distance < 0) {
                distance += 26;
            }
            if(distance != 0) {
                numberOfSame[distance-1]++;
            }
            farAway[i] = distance;
        }
        int max = 0;
        for(int i = 0; i < 26; i++) {
            if(numberOfSame[i] > max) {
                max = numberOfSame[i];
            }
        }
        if(k < ((max-1)*26)+1) {
            return false;
        }
        for(int i = 1; i <= k; i++) {
            for(int index = s.length()-1; index > 0; index++) {
                if(farAway[index] == i % 26) {
                    farAway[index] = 0;
                    index = s.length();
                }
            }
            int count = 0;
            for(int j = 0; j < farAway.length; j++) {
                if(farAway[j] == 0) {
                    count++;
                }
                else {
                    j = farAway.length;
                }
            }
            if(count == farAway.length) {
                return true;
            }
        }
        return false;
    }
}