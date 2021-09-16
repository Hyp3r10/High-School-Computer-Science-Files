import java.util.Arrays;
import java.util.HashSet;

public class Testing {
	public static void main(String[] args) {
		System.out.println(longestConsecutiveSubstring("pwwkew"));
	}
	/**
	 * @author MatthewSheldon
	 */
	public static int longestConsecutiveSubstring(String str) {
	    HashSet<String> used = new HashSet<String>();
	    int leftBound = 0, longest = 0;
	    String currSub = "";
	    for(int rightBound = 0; rightBound < str.length();) {
	    	String currChar = "" + str.charAt(rightBound);
	        if(used.contains(currChar)) {
	        	leftBound += currSub.indexOf(currChar)+1;
	            currSub = str.substring(leftBound, rightBound+1);
	            used = new HashSet<String>(Arrays.asList(currSub.split("")));
	        }
	        else {
	        	currSub += currChar;
	        	used.add(currChar);
	        }
	        System.out.println(currSub);
	        longest = Math.max(longest, used.size());
	        rightBound++;
	    }
	    return longest;
	}
}
